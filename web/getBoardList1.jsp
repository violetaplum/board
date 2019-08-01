<%@ page import="sangdam.biz.board.vo.BoardVO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="sangdam.biz.board.imp.BoardService" %>
<%@ page import="sangdam.biz.board.dao.BoardDAO" %><%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-07-31
  Time: 오후 4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background: darkmagenta;
        }
    </style>
</head>
<body>
<h2>
id : ${user.get}<br>
pw : ${user.pw}<br>
    <a href="index.html">처음으로..</a>
</h2>
</body>
</html>
