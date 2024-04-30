<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>홈페이지</title>
</head>
<body>
    <h1>홈페이지</h1>
    <form action="/save" method="post">
        제목 : <input type="text" name="btitle"><br>
        작성자 : <input type="text" name="bname"><br>
        내용 : <textarea name="bcontent" cols="30" rows="10"></textarea><br>
        <input type="submit" value="작성">
    </form>
</body>
</html>