<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>

<head>

<meta charset="UTF-8">

<title>Log-in</title>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">


<link href="<c:url value="/resources/css/jquery-ui.css" />" rel="stylesheet">

<link rel="stylesheet" href="css/style.css" media="screen"
	type="text/css" />

</head>

<body>
	<div class="login-card">
		<h3>
			<b> DIGITAL ARCHIVE SYSTEM</b>
		</h3>
		<h1>Log-in</h1>
		<br>
		<c:if test="${not empty userError}">
		<p >Incorrect username or password for user ${userError.username}</p>
		</c:if>
		<form method="post" action="checklogin">
			<input type="text" name="username" placeholder="Username"> 
			<input type="password" name="password" placeholder="Password"> 
			
			<input type="submit" name="login" class="login login-submit" value="Login">
		</form>

		<div class="login-help">
			<a href="registration">Register here</a>
		</div>
	</div>

	<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->

		<script src="<c:url value="/resources/js/jquery_and_jqueryui.js" />"></script>

</body>

</html>
