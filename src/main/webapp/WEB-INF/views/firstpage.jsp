<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form role="form">
   <div class="form-group">
      <label for="name">Name</label>
      <input type="text" class="form-control" id="name" 
         placeholder="Enter Name">
   </div>
   <div class="form-group">
      <label for="inputfile">File input</label>
      <input type="file" id="inputfile">
      <p class="help-block">Example block-level help text here.</p>
   </div>
   <div class="checkbox">
      <label>
      <input type="checkbox"> Check me out
      </label>
   </div>
   <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>