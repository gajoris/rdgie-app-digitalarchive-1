<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/elfinder/css/jquery-ui.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/elfinder/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/elfinder/js/jquery-ui.min.js" />"></script>


<link href="<c:url value="/resources/elfinder/css/elfinder.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/elfinder/js/elfinder.min.js" />"></script>
<script
	src="<c:url value="/resources/elfinder/js/i18n/elfinder.ru.js " />"></script>
<title>Digital Archive</title>

<script language="JavaScript">
function Validate()
{
	  var image =document.getElementById("image").value;
	 if(image==''){
		 alert("Please enter Image Path");
		 document.getElementById("image").focus();
		 return false;
		 }
	 }
</script>
</head>


<body bgcolor="#C0C0C0">

	<table width="100%" border="2">
		<tr>
			<td
				style="background: url(./resources/images/seven.gif) no-repeat 100%; width: 100%; height: 200px"><div
					class="text-vertical-center">
					<center>
						<h1>WELCOME TO DIGITAL ARCHIVE SYSTEM</h1>
					</center>

					<div align="right">
						<br> <a href="logout"><font color="white">Log out</font></a>
					</div>
				</div></td>
		</tr>
		<tr valign="top">

			<td bgcolor="#FFFFFF" width="100%" height="1000px">

				<div id="elfinder" style="height: 100%; width: 200px;"></div>
			</td>
		</tr>
		<tr>
			<td><form:form action="uploadfile" modelAttribute="uploadItem" name="frm"
					method="post" enctype="multipart/form-data"
					onSubmit="return Validate();">
					<fieldset>
						<legend>Upload File</legend>
						<table>
							<tr>
								<td><form:label for="fileData" path="fileData">File</form:label><br />
								</td>
								<td><form:input path="fileData" id="image" type="file" /></td>
							</tr>
							<tr>
								<td>Document number: <input name="documentnumber"
									type="text"></td>
							</tr>
							<tr>
								<td>Document Identifier:<input name="name" type="text">
							</tr>
							<tr>
								<td><br /></td>
								<td><input type="submit" value="Upload And Save" /></td>
							</tr>

						</table>
					</fieldset>
				</form:form></td>
		</tr>
	</table>

	<script type="text/javascript" charset="utf-8">
		$().ready(function() {
			var elf = $('#elfinder').elfinder({
				// lang: 'ru',             // language (OPTIONAL)
				url : '/digitalarchive/connector' // connector URL (REQUIRED)
			}).elfinder('instance');
		});
	</script>
</body>
</html>

<!-- <link rel="stylesheet" type="text/css" media="screen" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/themes/smoothness/jquery-ui.css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js" ></script> 
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script> -->