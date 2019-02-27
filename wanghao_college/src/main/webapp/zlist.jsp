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

</script>
</head>
<body>
<c:if test="${pd!=1}">
  <form action="zlist" method="post">
    <input type="text" value="${st.sname }" name="sname">
    <input type="submit" value="查询">
  </form> 
</c:if>
  <table border="1">
      <tr>
        <td>学生姓名</td>
        <td>性别</td>
        <td>所属学院</td>
        <td>入学日期</td>
        <td>当前宿舍</td>
        <td>宿舍人数</td>
        <td></td>
      </tr>
    <c:forEach items="${zlist}" var="v">
      <tr>
        <td>${v.sname }</td>
        <td>${v.sex }</td>
        <td>${v.sxy }</td>
        <td>${v.sdatea }</td>
        <td>${v.qname }</td>
        <td>${v.snum }</td>
        <c:if test="${pd!=1}">
        <td>
         <a href="update.jsp?sid=${v.sid}"><input type="button" value="更换宿舍"></a>
         <a href="mx?mid=${v.sid}"><input type="button" value="明细"></a>
         <a href="zlist?qid=${v.qid}"><input type="button" value="寝室人员"></a>
        </td>
        </c:if>
      </tr>
    </c:forEach>
      <tr>
        <td colspan="11">
          ${st.pageStr}
        </td>
      </tr>
  </table>
</body>
</html>