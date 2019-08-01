<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-07-31
  Time: 오후 6:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>상담 게시판 내용</title>
</head>
<body>
<center>
    <a href="logout.do">logout</a>
    <hr>
    <form action="updateBoard.do" method="post">
        <input name="seqno" type="hidden" value="${board.seqno}"/>

    </form>
</center>

</body>
</html>
