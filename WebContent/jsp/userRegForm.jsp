<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입</title>
</head>
<body>
<center>
<h2>회원 가입</h2><p>
<s:form action="UserRegAction" validate="true">
	<s:textfield label="이메일" name="userEmail" value="%{userEmail}"/>
	<s:password label="비밀번호" name="userpw" value="%{userpw}"/>
	<s:password label="비밀번호 확인" name="fieldExpressionValidator"/>
	<s:textfield label="이름" name="username" value="%{username}"/>
	
	
	<s:submit value="회원가입" onclick="alert('성공적으로 회원가입 되었습니다.');" />
</s:form>
</center>


</body>
</html>