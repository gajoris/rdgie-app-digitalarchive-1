<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#A9A9A9">
<div style="position:absolute;left:550px;width:1000px;height:1000px)">
<div align="center" style="align:center ;width:900px;height:700px;left:650px; top:350px; border:3px solid #EE872A; background-color:#FFFFE0">
<form:form action="registrationsuccess" method="post" commandName="user">
             <center><br><br>
            <table border="0" width="50%" cellpadding="5">
                <thead>
                    <tr>
                    
                        <th>REGISTRATION FORM </th>
                        
                    </tr>
                </thead>
                <tbody>
                <tr>
                        <td><h3>First Name</h3></td>
                        <td><form:input path="firstname"/></td>
                    </tr>
                    

                    <tr>
                        <td><h3>Last Name</h3></td>
                        <td><form:input path="lastname"/></td>
                    </tr>
                    <tr>
                        <td><h3>Email</h3></td>
                        <td><form:input path="email"/></td>
                    </tr>
                    <tr>
                        <td><h3>User Name</h3></td>
                        <td><form:input path="username"/></td>
                    </tr>
                    <tr>
                        <td><h3>Password</h3></td>
                       <td><form:input type="password" path="password"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="SAVE" />&nbsp;&nbsp;&nbsp;<input type="reset" value="CLEAR" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Click To&nbsp;&nbsp;&nbsp;<a href="home">Login Here</a></h3></td>
                    </tr>
           
            </table>
            </center>
            
            </form:form>
            </div>
            </div>
        
</body>
</html>