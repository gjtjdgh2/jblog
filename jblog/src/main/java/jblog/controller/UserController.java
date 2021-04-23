package jblog.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jblog.service.UserService;
import jblog.vo.UserVo;


@Controller
@RequestMapping("/usr")
public class UserController {
	private static Logger logger= LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;

	@RequestMapping(value= {"","/","/join"},
			method=RequestMethod.GET)
	public String join(@ModelAttribute UserVo userrVo)
	{
		return "users/joinfrom";
	}
	@RequestMapping(value= "/join",
			method=RequestMethod.POST)
	public String joinAction(@ModelAttribute UserVo userVo) {
		logger.debug("form 전송된 데이터:"+userVo);
		boolean success =userService.join(userVo);
		if(success) {
			
			logger.debug("가입 성공!");
			return "redirect:/usr/joinsuccess";
		}else {
			System.err.println("가입실패");
			return "redirect:/usr/";
		}
	}
	
	//성공 화면
		@RequestMapping("/joinsuccess")
		public String joinSuccess() {
			return "users/joinsuccess";
		}
		
		//중복검색
		
		//로그인 폼
		@RequestMapping(value="/login",method=RequestMethod.GET)
		public String loginForm() {
			return "users/loginfrom";
		}
		
		//로그인
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public String loginAction( @RequestParam String id,@RequestParam String password,
				HttpSession session,RedirectAttributes rrt) {//사용자 세션 저장르 위한 세션 객체
				
				UserVo authUser = userService.getUser(id, password);
				
				//만약에 찾는 유저가 없다면 login 폼으로 되돌려 보낸다
				if(authUser !=null) {
					//세션 추가
					session.setAttribute("authUser", authUser);
					//홈페이지로 리다이렉트
					return "redirect:/";
				}else {
					rrt.addFlashAttribute("msg",false);
					return "redirect:/usr/login";
				}
			
			}
		
		
		@RequestMapping("/logout")
		public String logoutAction(HttpSession session) {
			//세션 지우기
			session.removeAttribute("authUser");
			//세션 무효화
			session.invalidate();
			return "redirect:/";
					
			
		}
		
		@ResponseBody //massageConverter 작동
		@RequestMapping("/show")
		public Object showUserByEmail(@RequestParam String id) {
			UserVo vo = userService.getUser(id);
			return vo;
		}
		
		
		//중복 이메일 체크
		@ResponseBody
		@RequestMapping("/idcheck")
		public Object existsEmail(@RequestParam(value="id", required=false, defaultValue="")
		String id) {
			UserVo vo =userService.getUser(id);
			boolean exists = vo !=null ? true : false;
			
			Map<String,Object> map = new HashMap<>();
			map.put("result", "success");
			map.put("data", exists);
			
			return map;
		}
	}

