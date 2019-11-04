<%@page import="co.micol.dto.MemberDto"%>
<%@page import="co.micol.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();
		dto = dao.select(id);
	%>
	<div align = "center">
		<div><h2>- M Y  P A G E -</h2></div>
		<div>
		<form id = "frm" name = "frm" action = "modifyOk.jsp" method = "post">
			<div>
				<table border = "1">
					<tr>
						<th width = "100">ID</th>
						<td width = "150"><%= dto.getId() %></td>
					</tr>
					<tr>
						<th width = "100">ENTER DATE</th>
						<td width = "150"><%= dto.getEnterDate() %></td>
					</tr>
					<tr>
						<th width = "100">NAME</th>
						<td><input type = "text" id = "name" name = "name" value = <%= dto.getName() %> size = "30"></td>
					</tr>
					<tr>
						<th width = "100">ADDRESS</th>
						<td><input type = "text" id = "addr" name = "addr" value = <%= dto.getAddr() %> size = "30"></td>
					</tr>
				</table>
			</div>
			<div>
				<br />
				<input type = "submit" value = "MODIFY">&nbsp;&nbsp;
				<button type = "button" onclick = "location.href = 'main.jsp'">RETURN</button>
			</div>
		</form>
		</div>
	</div>
</body>
</html>