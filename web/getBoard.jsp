<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-07-31
  Time: 오후 5:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background: darkviolet;
        }
    </style>
</head>
<body>

<center>
    <h2>로그아웃??<a hrf="logout.do">LOGOUT</a></h2>
    <hr>
    <a href="logout.do">logout</a>
    <hr>
    <form action="updateBoard.do" method="get"> <%--hidden이 중요--%>
        <input name="seqno" type="hidden" value="${board.seqno}"/>

    </form>
        <table border="2">
            <tr>
                <td>제목</td><td>${board.title}</td>
            </tr>
            <tr>
                <td>고객명</td><td>${board.writer}</td>
            </tr>
            <tr>
                <td>상담내용</td>
                <td>
                    <textarea name="content" cols="50" rows="10" value="${board.content}">${board.content}</textarea>
                </td>
            </tr>
            <tr>
                <td>상담 등록일</td><td>${board.writedate}</td>
            </tr>
            <tr>
                <td>조회수</td><td>${board.searchcnt}</td>
            </tr>
        </table>
    <a href="getBoardList.jsp">[상담글 목록]</a>
    <a href="getBoardList.do">[상담글 목록]</a>
                <%--indexOf() substring() && ||   ====>  jstl은 and,or 그대로 사용한다. --%>
    <c:if test="${fn:contains(user.id,'admin1234') and fn:contains(user.pw,'wangja')}">
        <a href="deleteBoard.do?seqno=${board.seqno}">[상담글삭제]</a>
    </c:if>
    <c:if test="${fn:contains(user.id,'admin4321') and fn:contains(user.pw,'kongjoo')}">
        <a href="deleteBoard.do?seqno=${board.seqno}">[상담글삭제]</a>
    </c:if>
</center>    <%--관리자 id는 admin1234 admin4321 2개이고 만들어놓아서 일반사용자는 추가로 만들 수 없다. 설혹 id를 알더라도 암호를 모르면 삭제 불가능--%>
</body>
</html>
