<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�ļ���ӳ�������</title>
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
    <span class="STYLE3">�û���¼</span>
  </center>
  	<form method="post" action="userLogin.html">
  	<center>${map.error }</center>
    <table align="center">
    	<tr>
    		<td height="23"><span class="STYLE3">�����û�����</span></td>
   		  <td height="23"><input name="userName" type="text"></td>
    	</tr>
    	<tr>
    		<td height="23"><span class="STYLE3">�������룺</span></td>
   		  <td height="23"><input name="userPwd" type="password"></td>
    	</tr>
    	<tr>
    		<td height="23" colspan="2" align="center">
    			<input type="submit" value="��¼">
    			<input type="reset" value="����">
   		    </td>
    	</tr>
    </table>
    </form>
  </body>
</html>
