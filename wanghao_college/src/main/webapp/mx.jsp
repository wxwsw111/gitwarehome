<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
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
  <table border="1">
      <tr>
        <td>姓名</td>
        <td>人数</td>
        <td>入职时间</td>
        <td>离开期</td>
      </tr>
    <c:forEach items="${mlist}" var="v">
      <tr>
        <td>${v.mname }</td>
        <td>${v.mnum }</td>
        <td>${v.rdate }</td>
        <td>${v.ldate }</td>
    </c:forEach>
  </table>
</body>
</html>