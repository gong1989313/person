<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
  <head>
    <title>welcome.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
<%--   	<hr> 
    	 <br>This is my annotation HTML page. <br/>
         <br>今天是: ${today}<br/>
         <br>参数是: ${name}&nbsp;&nbsp;&nbsp;${sex}<br/>
    <hr/>     
    <c:forEach var="field" items="${map}">
       <c:if test="${field != null}" var="param" scope="page">
                          您输入的${field.key}不正确! ${field.value}<br/>
    </c:if>
    </c:forEach> --%>
    
    <form action="<%=path%>/user/add.do" method="post">
                   用户名: <input type="text" id="username" name="username"  value="" /><br/>
                   密码 : <input type="text" id="password" name="password"  value="" /><br/>
                  状态 : <input type="text" id="status"      name="status"       value="" /><br/>          
          <input type="submit" value="提交" />
    </form>          
  </body>
</html>
