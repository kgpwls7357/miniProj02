<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<form action="/save" method="post">
    제목 : <input type="text" name="boardTitle"><br>
    작성자 : <input type="text" name="boardWriter"><br>
    비밀번호 : <input type="text" name="boardPass"><br>
    내용 : <textarea name="boardContents" cols="30" rows="10"></textarea><br>
    <input type="submit" value="작성">
</form>
</body>
</html>