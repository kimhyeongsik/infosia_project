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

<s:form action="UserRegForm" validate="true">

<s:url id="url_test" action="LoginAction"/>


	<table border="0" cellspacing="0" cellpadding="5" class="menubox" width="400">
		<tbody>
			<tr bgcolor="#009ACD">
				<th>
					<font>InfosiaTec 출퇴 System</font>
				</th>
			</tr>
			<tr bgcolor="#6CA6CD">
				<td align="center"><br>
					<font size="2px">귀하의 이메일 주소 및 비밀번호를 입렵해주세요.</font>
				<br><br>
			<table class=login_viewbox border="0" cellpadding="3" width="400">
		<tbody>
			<tr>
				<td align="left">
					<!-- <font>이메일 주소 :</font>
				</td>
			<input type="text" name="domain" size="30" value="@infosiatec.com">
			<td> --> 
			<s:textfield label="이메일 주소" name="userid" size="15" />
				</td>
			</tr>
			<tr>		
				<td align="left">
					<!-- <font>비밀번호 :</font>			
				</td>
				<td>
				<input type="password" name="password"> -->
				<s:password label="비밀번호" name="userpw" value="%{userpw}" />
				</td>
			</tr>
			<tr>
				<td align="left"></td>
				<td>
					<input type="checkbox">
					<font>로그인 유지</font>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<!-- <a href="action"> -->
				 <s:a href="%{url_test}" theme="simple"><font size="2" color="#696969">사원등록</font></s:a> 
				<s:submit value="로그인" align="center"/>
				</td>
			</tr>
		</tbody>

	</table></td></tr>
	</tbody>
</table>
<br>
<table class="notice_table" border="1px">
	<tbody>
			<tr>
				<th class="notice_title" height="10" width="500" bgcolor="#9C9C9C">
					<font>공지사항</font>
				</th>
			</tr>
			<tr>
				<td bgcolor="#E8E8E8">
					<ul>
						<li>
							<font>10월30일(금) 귀사회 다들 참가할 수 있도록!(회비:1500엔)</font><br>
						</li>
						<li>
							<font>이강선상은 11월부터 부장으로 승진입니다.</font><br>
						</li>
					</ul>
				</td>
			</tr>
		</tbody>
</table>
</s:form>
</center>
</body>
</html>