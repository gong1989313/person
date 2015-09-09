<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>文件名映射控制器</title>
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
    -->
		<style type="text/css">
<!--
.STYLE3 {
	font-size: 9pt
}
-->
</style>
</head>
  
  <body>
  <center>
    <span class="STYLE3">用户登录</span>
  </center>
  	<form method="post" action="userLogin.html">
  	<center>${map.error }</center>
    <table align="center">
    	<tr>
    		<td height="23"><span class="STYLE3">输入用户名：</span></td>
   		  <td height="23"><input name="userName" type="text"></td>
    	</tr>
    	<tr>
    		<td height="23"><span class="STYLE3">输入密码：</span></td>
   		  <td height="23"><input name="userPwd" type="password"></td>
    	</tr>
    	<tr>
    		<td height="23" colspan="2" align="center">
    			<input type="submit" value="登录">
    			<input type="reset" value="重置">
   		    </td>
    	</tr>
    </table>
    </form>
  </body>
</html>
