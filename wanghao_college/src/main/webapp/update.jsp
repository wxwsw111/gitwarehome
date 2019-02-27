<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(function(){
	    var sid=${param.sid}
		$.post(
		  "xl",
		  function(msg) {
			  for(var i=0;i<msg.length;i++){
		        	 $("#ss").append("<option value="+msg[i].qid+">"+msg[i].qname+"</option>")  
		          }
		  },
		  "json"
		);
		$.post(
		  "toupd",
		  {sid:sid},
		  function(msg) {
			$("#sname").val(msg.sname);
			$("#sid").val(msg.sid);
			$("#sex").val(msg.sex);
			$("#sxy").val(msg.sxy);
			$("#snum").val(msg.snum);
			$("#dangqian").val(msg.dangqian);
			$("[value="+msg.qid+"]").attr('selected',true);
		  },
		  "json"
		);
})
function js(qid){
	$.post(
			  "js",
			  {qid:qid.value},
			  function(msg) {
				if(msg==0){
					alert("该寝室人满")
				}else{
					alert("可以入住")
				}
			  },
			  "json"
			);
}
</script>
</head>
<body>
  <form method="post" action="upd">
  <table border="1">
      <tr>
        <td>学生姓名</td>
        <td>
        <input type="text" name="sid" id="sid">
        <input type="text" name="snum" id="snum">
        <input type="text" name="sname" id="sname">
        </td>
      </tr>
      <tr>
        <td>学生性别</td>
        <td><input type="text" name="sex" id="sex"></td>
      </tr>
      <tr>
        <td>所属学院</td>
        <td><input type="text" name="sxy" id="sxy"></td>
      </tr>
      <tr>
        <td>当前宿舍</td>
        <td><input type="text" name="dangqian" id="dangqian"></td>
      </tr>
      <tr>
        <td>更换宿舍</td>
        <td>
          <select name="qid" id="ss" onchange="js(this)"></select>
        </td>
      </tr>
      <tr>
        <td colspan="11">
          <input type="submit" value="更换">
        </td>
      </tr>
  </table>
  </form> 
</body>
</html>