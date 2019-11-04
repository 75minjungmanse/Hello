<%@page import="co.micol.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%! boolean b; %>
</head>
<body>
<div align = "center">
	<%
		String id = request.getParameter("cid");
		MemberDao dao = new MemberDao();
		b = dao.isIdCheck(id);
		if (b) { %>
			<h2><%=id%>는 사용 가능한 ID입니다.</h2>
			<script type = "text/javascript">
			window.opner.document.frm.idChk.value = "Checked";
			window.opner.document.frm.pw.value.focus();
			</script> <%
		} else { %>
			<h2><%=id%>는 이미 사용 중인 ID입니다.</h2>
			<script type = "text/javascript">
			window.opner.document.frm.id.value = "";
			window.opner.document.frm.id.value.focus();
			</script>
		<% } %>
	
	<div>
		<br />
		<button type = "button" onclick = "window.close()">확인</button>
	</div>
</div>

</body>
</html>