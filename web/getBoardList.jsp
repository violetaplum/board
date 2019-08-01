<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-07-31
  Time: 오후 3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Title</title>
    <style>
        body{
            background: blueviolet;
        }
    </style>
</head>
<body>
<center>
    <h1>상담목록</h1>
<h2>
${user.name}님 안녕하십니까

<a href="logout.do">LOGOUT</a>
<form action="getBoardList.do" method="get">
    <input type="submit" value="getBoardList"/>
</form>
</h2>
    <table width="700" border="2">
        <tr>
            <th>상담번호</th><th>상담제목</th><th>상담고객명</th><th>작성한날</th><th>조회수</th>
        </tr>
        <c:forEach items="${boardList}" var="board">
            <tr>
                <td>${board.seqno}</td>
                <td><a href="updateBoard.do?seqno=${board.seqno}">${board.title}</a></td>
                <td>${board.writer}</td>
                <td>${board.writedate}</td>
                <td>${board.searchcnt}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="insertBoard.jsp">새 글 등록</a>
    <a href="index.html">처음으로..</a>



</center>
</body>
</html>
