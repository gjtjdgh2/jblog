package jblog.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jblog.exception.ControllerExcetion;



@Controller
public class MainController {
	@RequestMapping({"/","/main"})
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main");
		return mav;
}
}