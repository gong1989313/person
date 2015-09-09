<%@taglib prefix="spring" uri="/spring"%>

<%@page contentType="text/html;charset=utf-8"%>

<html>

<head>
<title><spring:message code="title"></spring:message></title>
</head>

<body>
	<spring:bind path="command.username">
		<h3>
			<spring:message code="welcome"></spring:message>
			{status.value }
			<spring:message code="loginSuccess" />
		</h3>
		<br>
	</spring:bind>
</body>
</html>
