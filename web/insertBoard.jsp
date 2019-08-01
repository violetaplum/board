<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-07-31
  Time: 오후 5:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background: hotpink;
        }
    </style>
</head>
<body>
<center>
    <h2>로그아웃??<a hrf="logout.do">LOGOUT</a></h2>
    <hr>
    <form action="insertBoard.do" method="post">
        <table border="2">
            <tr>
                <td>상담문의 제목</td><td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>상담고객명</td><td><input type="text" name="writer"></td>
            </tr>
            <tr>
                <td>상담내용</td>
                <td>
                <textarea name="content" cols="50" rows="10"></textarea>
                </td>
            </tr>
            <tr>
                <td>입력</td><td align="center"><input type="submit" value="상담등록"></td>
            </tr>
        </table>
    </form>

</center>
</body>
</html>
