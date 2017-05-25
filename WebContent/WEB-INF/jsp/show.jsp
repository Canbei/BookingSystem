<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student</title>
</head>

<body>
<s:iterator value="student">
	<s:property value="no"/>&nbsp; 
	<s:property value="name"/>&nbsp;
	<s:property value="phone"/>&nbsp;
	<s:property value="district"/>&nbsp;
	<s:property value="emaii"/><br/>
</s:iterator>
</body>
</html>