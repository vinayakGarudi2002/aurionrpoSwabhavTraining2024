<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ include file="insert.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b>My Jsp file</b>
<%
   Date date = new Date();
out.print(date.getDate());

%>

<br>
<%--Expression tag --%>
<%=  new Date() %>


<%! String mssg="hello"; %>
<br>
<h1><%= mssg="12" %>    </h1>



</body>
</html>