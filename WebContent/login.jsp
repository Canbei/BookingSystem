<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookingSystem</title>
</head>
<body>
<s:form action="login" method="get" validate="true">
<s:textfield name="username" label="用户名" placeholder="请输入用户名"></s:textfield>  <br>
<s:fielderror></s:fielderror>
<s:password name="password" label="密码" placeholder="请输入密码"></s:password>  
<s:submit value="提交"></s:submit>  
</s:form>
<a href="UpLoad.jsp">上传文件</a>
</body>
</html>