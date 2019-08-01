<%--
  Created by IntelliJ IDEA.
  User: KGITBANK
  Date: 2019-07-29
  Time: 오후 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <a href="index.html">index.html</a>
  </body>
<%--
  title content writer searchcnt seqno writedate

  create table board(title varchar2(20),content varchar2(20),writer varchar2(20),searchcnt number(20),seqno number(20),writedate date);

  create table users(
  id varchar2(10) primary key,
  pw varchar2(10),
  name varchar2(20),
  checker varchar2(3));


  insert into users values('admin1234','wangja','choi','a');
  insert into users values('admin4321','kongjoo','kim','a');
  insert into users values('bano','ondal','김경석','p');
  insert into users values('ttt','ttt','이미래','p');


  create table board(
  seqno number(5),
  title varchar2(50),
  writer varchar2(20),
  content varchar2(1000),
  writedate date default sysdate,
  searchcnt number(5) default 0);

  insert into board(seqno,title,writer,content) values(1,'아싸','이미래','내가 1등... 저기요 종로에 매장 있나요');


  Name                                      Null?    Type
  ----------------------------------------- -------- ----------------------------
  TITLE                                              VARCHAR2(20)
  CONTENT                                            VARCHAR2(20)
  WRITER                                             VARCHAR2(20)
  SEARCHCNT                                          NUMBER(20)
  SEQNO                                              NUMBER(20)
  WRITEDATE                                          DATE
--%>

</html>
