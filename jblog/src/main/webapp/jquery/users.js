function checkForm(frm){
	console.log(frm);
	
	var userName=frm.userName.value.trim();
	var password = frm.password.value.trim();
	var id =frm.id.value.trim();
	var cbox =frm.cbox.value;
	var check = frm.check.value;
	
	
	if(userName.length <= 0){
		alert("이름 입력하세여");
		frm.userName.focus();
	}else if(id.length <=0){
		alert("아이디을 입력해 주세여");
		frm.id.focus();
	}else if(password.length <=0){
		alert("비밀번호를 입력해 주세여");
		frm.password.focus();
		
	}else if(check !="t"){
	alert("id 중복 체크해주세여");
	}else if(!frm.cbox.checked){
	alert("약관 체크해주세여");
	}
	else{
		return true;
	}
	return false; //onsubit 이벤트에서 true여야 전송
}

function checkid(idField,url ){
	console.log("id field:" ,idField.value);

	//Ajax 호출
	
	if (idField.value.trim().length ==0){
	alert("아이디 입력해주세여");
	return;
}
	$.ajax({
		url:url,
		type: "GET",
		dataType: "json",
		data:{
			id: idField.value.trim()
		},
		success: function(result){
			console.log("Result:",result);
			//check
			if(result.data ==true){
			idField.form.check.value ="f";
			alert("이미 가입된 아이디입니다");
			}else{
			idField.form.check.value ="t";
			alert("가입 가능 아이디입니다");
			}
		},
		error: function(xhr,status,error){
		console.error("Status:",status);
		console.error("Xhr:",xhr);
		console.error("Error:",error);
		
		idField.form.check.value ="f";
		}
		});
}


