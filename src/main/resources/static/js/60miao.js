var countdown = 60;
function settime(val) {
	//获取验证码
	if (parseInt(countdown)==60) {
		var phone=$("[name='cardTel']").val();
		 $.ajax({
			type : 'post',
			url : 'http://localhost:8080/getMagCheck.action',
			data: "cardTel="+phone,
			dataType : "text",
			success : function(data) {
			}
		}); 
	}
	 if(countdown == 0) {
		val.removeAttribute("disabled");
		val.value = "获取验证码";
		countdown = 60;
		return;
	} else {
		val.setAttribute("disabled", true);
		val.value = "重新发送(" + countdown + ")";
		countdown--;
	}
	setTimeout(function() {
		settime(val)
	}, 1000)

	
}

