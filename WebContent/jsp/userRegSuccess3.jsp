<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
    
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
    
    <!--jquery.ui.datepicker 한글팩 -->
    <script type="text/javascript" src="js/jquery.ui.datepicker-ko.js"></script>
    
    <!--캘린더 : 외부 js파일-->
    <script type="text/javascript" src="js/calendar2.js"></script>
 <script>

        $(document).ready(function(){

            // jquery.ui.datepicker 기본 사용
            //$("#txtDate").datepicker(); 
            
            /* jquery.ui.datepicker 옵션설정하기 , 자세한 옵션은 API문서 참고.*/
            $("#txtDate").datepicker({
                showOn: "button", //이미지로 사용 , both : 엘리먼트와 이미지 동시사용
                buttonImage: "../img/icon_date.gif", //버튼으로 사용할 이미지 경로
                buttonImageOnly: true //이미지만 보이기
            });

            //datepicker에서 사용한 이미지 버튼 style적용
            $("img.ui-datepicker-trigger").attr("style","margin-left:5px; vertical-align:middle; cursor:pointer; width:17px"); 

        });
    </script>

    <style>
        body {font-size:9pt}
        /*img {vertical-align:middle}*/
        #txtDate { margin:2px 2px;  width:90px;vertical-align:center}
    </style>

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
				<input type="text" width="10" placeholder="이름을 입력하세요." style="width: 150px" > 
				<Input type="button" value="검색">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text"　placeholder="2015년 11월 02일" id="txtDate" readonly>
				
							
			</td>
		</tr>
	</table>
	<table border="1"  style="border-collapse:collapse;" width="100%" height="40px" >
		<tr bgcolor="#D3D3D3" style="border-top: groove;">
				<th colspan="6">
					<font >금일 출퇴근 현황입니다.</font>
				</th>
			</tr>
		<tr align="center">
			<td>사원</td>
			<td>출근시간</td>
			<td>퇴근시간</td>
			<td>금일 업무시간</td>
			<td>총 업무시간</td>
			<td>총 근무일수</td>
		</tr>

</table>
	



</center>

</body>
</html>