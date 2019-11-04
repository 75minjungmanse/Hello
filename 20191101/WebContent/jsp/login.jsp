<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript">
	function formCheck() {
		if (frm.id.value == "") {
			alert ("ID를 입력해 주세요.")
			frm.id.focus();
			return false;
		}
		if (frm.pw.value == "") {
			alert ("PW를 입력해 주세요.")
			frm.pw.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div align = "center">
	<c:if test = "${ id == null }">
			<div> <h3>L O G - I N</h3> </div>
			<div>
				<form id = "frm" name = "frm" action = "loginOk.jsp" method = "post" onsubmit = "return formCheck()">
					<table border = "1">
						<tr>
						<th width = "100">I D</th>
						<td><input type = "text" id = "id" name = "id" size = "40"></td>
						</tr>
						<tr>
						<th width = "100">P W</th>
						<td><input type = "password" id = "pw" name = "pw" size = "40"></td>
						</tr>
					</table>
			<div>
			<br />
				<button type = "submit">log-in</button>&nbsp;&nbsp;
				<button type = "reset">reset</button>&nbsp;&nbsp;
				<button type = "button" onclick = "location.href = 'join.jsp'">join</button>
			</div>
			</form>
			</div>
			</c:if>
			<c:if test = "${id != null}">
				<h2>${id}는 이미 로그인하였습니다.</h2>
				<a href = "main.jsp">HOME</a>
			</c:if>
		<div> <jsp:include page = "footer.jsp"></jsp:include> </div>
		</div>
</body>
</html>