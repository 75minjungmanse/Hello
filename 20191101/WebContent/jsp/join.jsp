<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript">
	function formCheck() {
	var form = document.frm;
	if (frm.id.value == "") {
		alert("ID를 입력해 주세요.")
		frm.id.focus();
		return false;
		}
	if (frm.idChk.value == "unCheck") {
		alert("ID 중복 확인을 해 주세요.")
		return false();
	}
	if (frm.pw.value == "") {
		alert("PW를 입력해 주세요.")
		frm.pw.focus();
		return false;
	}
	if (frm.name.value == "") {
		alert("이름을 입력해 주세요.")
		frm.name.focus();
		return false;
	}
	frm.submit();
	}
	
	
	function idCheck() {
		window.open("idcheck.jsp?cid="+id.value, "IdCheck", "width = 800, height = 700")
	}
</script>
</head>
<body>
	<div align = "center">
		<div><h2>J O I N</h2></div>
		<div>
			<form id = "frm" name = "frm" action = "joinOk.jsp" method = "post">
				<div>
					<table border = "1">
						<tr>
							<th width = "100">I D<font color="red">*</font></th>
							<td><input type = "text" id = "id" name = "id" size = "30">&nbsp;&nbsp;
								<button type = "button" name = "idChk" onclick = "idCheck()" value = "unCheck">ID check</button></td>
						</tr>
						<tr>
							<th>P W<font color="red">*</font></th>
							<td><input type = "password" id = "pw" name = "pw" size = "50"></td>
						</tr>
						<tr>
							<th>N A M E<font color="red">*</font></th>
							<td><input type = "text" id = "name" name = "name" size = "50"></td>
						</tr>
						<tr>
							<th>A D D R</th>
							<td><input type = "text" id = "addr" name = "addr" size = "70"></td>
						</tr>
					</table>
				</div>
				<div>
					<br />
					<button type = "submit" onclick = "formCheck()">JOIN</button>&nbsp;&nbsp;&nbsp;
					<button type = "reset">CANCEL</button>&nbsp;&nbsp;&nbsp;
					<button type = "button" onclick = "location.href = 'login.jsp'">LOG IN</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>