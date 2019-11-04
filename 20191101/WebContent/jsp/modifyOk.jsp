<%@page import="co.micol.dao.MemberDao"%>
<%@page import="co.micol.dto.MemberDto"%>
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
		request.setCharacterEncoding("UTF-8");	
		String id = (String) session.getAttribute("id");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();
		
		dto.setId(id);
		dto.setName(name);
		dto.setAddr(addr);
		
		int n = dao.update(dto);
		
		if (n != 0) {
			dto = dao.select(id);
			out.print("<h2> 정상적으로 수정되었습니다. </h2>");
		} else {
			out.print("<h2> 데이터를 수정할 수 없습니다. </h2>");
		}
	%>
</body>
</html>