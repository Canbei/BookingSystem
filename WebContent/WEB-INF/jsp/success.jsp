<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookingSystem</title>
</head>

<body>
<form class="show" action="show" method="post">
Welcome: &nbsp;<s:property value="student.username"/><br>
<s:property value="student.name"/><br>
<s:property value="student.district"/><br>
<s:property value="student.phone"/><br>
<s:property value="student.email"/><br>
<hr>
<s:date name="currentDate" format="dd/MM/yyyy" /><br>
<hr>
<input type="submit" value="show all students"></input>
</form>

   <s:form action="login">
      <s:select name="username" label="Username"
         list="{'Mike','John','Smith'}" />

      <s:select label="Company Office" name="mySelection"
         value="%{'America'}"
         list="%{#{'America':'America'}}">
      <s:optgroup label="Asia" 
         list="%{#{'India':'India','China':'China'}}" />
      <s:optgroup label="Europe"
         list="%{#{'UK':'UK','Sweden':'Sweden','Italy':'Italy'}}" />
      </s:select>

      <s:combobox label="My Sign" name="mySign"
         list="#{'aries':'aries','capricorn':'capricorn'}"
         headerKey="-1" 
         headerValue="--- Please Select ---" emptyOption="true"
         value="capricorn" />
      <s:doubleselect label="Occupation" name="occupation"
         list="{'Technical','Other'}" doubleName="occupations2"
         doubleList="top == 'Technical' ? 
         {'I.T', 'Hardware'} : {'Accounting', 'H.R'}" />

   </s:form>
</body>
</html>