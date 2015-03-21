<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String sessionid = request.getSession().getId();
System.out.println("test1 session id: "+sessionid);

request.setCharacterEncoding("EUC-KR");
String str = request.getParameter("name");
out.println("哈哈哈哈哈  <br>");
out.println(str);

%>


</body>
</html>