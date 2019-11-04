<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div> <jsp:include page = "topMenu.jsp"></jsp:include> </div>
	<div align = "center">
	<c:if test = "${id != null}">
		${ id } 님, 환영합니다! <br />
		<c:if test = "${ grant == 'U' }"> 일반 유저로 접속합니다. </c:if>
		<c:if test = "${ grant == 'S' }"> 관리자로 접속합니다. <br />
			<button type = "button" onclick = "location.href = 'mlist.jsp'">MEMBER</button>
		</c:if>
		<hr />
		<button type = "button" onclick = "location.href = 'modify.jsp'">MY PAGE</button>
		&nbsp;&nbsp;
		<button type = "button" onclick = "location.href = 'logOut.jsp'">LOG-OUT</button>
		</c:if>
		<c:if test = "${id == null}">
			<h2>로그인한 사용자만 접근 가능합니다.</h2>
		<button type = "button" onclick = "location.href = 'login.jsp'">LOG IN</button>
		</c:if>
	<div> <jsp:include page = "footer.jsp"></jsp:include> </div>
	</div>
</body>
</html>