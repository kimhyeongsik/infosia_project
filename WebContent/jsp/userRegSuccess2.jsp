<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입 완료</title>
</head>
<body>
<center>

<table border="1"  style="border-collapse:collapse;" width="100%" height="40px" >
		<tr bgcolor="#D3D3D3" style="font-size: small;">
				<th>
					<font color="#8B0000"><관리자 페이지입니다></font>
				</th>
			</tr>
	
		<tr>
			<td style="margin-left: 30px;">
			
			<SELECT Name="Infosia_people" width="20">
    		<OPTION Value="이강선">이강선
   			<OPTION Value="김형식">김형식
  			<OPTION Value="이원경">이원경
   			<OPTION Value="홍호식">홍호식
   			</OPTION>
			</Select>
			<Input type="button" value="확인">
			</td>
		</tr>
	</table>
	<table border="1"  style="border-collapse:collapse;" width="100%" height="40px" >
		<tr bgcolor="#D3D3D3" style="border-top: groove;">
				<th colspan="6">
					<font >님의 이번달 출근표입니다.</font>
				</th>
			</tr>
		<tr align="center">
			<td>날짜</td>
			<td>출근시간</td>
			<td>퇴근시간</td>
			<td>금일 업무시간</td>
			<td>총 업무시간</td>
			<td>총 근무일수</td>
		</tr>
		
		<tr align="center" style="border-top: double;">
			<td>합계</td>
			<td>ㅡ</td>
			<td>ㅡ</td>
			<td>ㅡ</td>
			<td></td>
			<td></td>
		</tr>
</table>
	



</center>

</body>
</html>