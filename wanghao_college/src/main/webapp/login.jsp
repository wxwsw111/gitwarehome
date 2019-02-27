<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#log").click(function(){
		$.post(
		  "login",
		  $("form").serialize(),
		  function(msg) {
			 if(msg==1){
				 alert("登陆成功");
				 location="zlist"
			 }else{
				 alert("登陆失败");
				 location.reload();
			 }
				
		  },
		  "text"
		);
	});
})
</script>
</head>
<body>
 <form>
   账户:<input type="text" name="uname"><br>
   密码:<input type="text" name="upwd"><br>
   <input type="button" value="登录" id="log">
 </form>
</body>
</html>