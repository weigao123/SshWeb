<%@page import="java.util.Enumeration"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Homepage</title>
</head>
<body>

<form action="test1.jsp" method="post">
  <p>First name: <input type="text" name="name" /></p>
  <p>Last name: <input type="text" name="name2" /></p>
  <input type="submit" value="Submit" />
</form>

  
 <form method="post" action="upload"  enctype="multipart/form-data">
文件名：<input type="text" id="name" name="name" /><br/>
选择：<input type="file" id="file" name="file" /><br/>
上传	<input type="submit" value="上传" /><br/>
</form>
	
</body>
</html>