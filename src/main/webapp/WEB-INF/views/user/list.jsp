<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>
<%@ include file="/WEB-INF/views/common/scripts.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>사용자 목록</title>
</head>
<body>

<h2>사용자 목록</h2>
<table border="1">
    <thead>
        <tr>
            <th>번호</th>
            <th>아이디</th>
            <th>이름</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="user" items="${userList}">
            <tr>
                <td>${user.userNo}</td>
                <td>${user.userId}</td>
                <td>${user.userName}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<script src="/resources/js/user/list.js"></script>
</body>
</html>
