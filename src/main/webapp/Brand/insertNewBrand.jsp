<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Insert New Brand</title>
</head>
<body>
<h3>添加品牌</h3>
<form action="./InsertServlet" method="post">
    品牌名稱：<input name="brandName"><br>
    企業名稱：<input name="companyName"><br>
    訂單：<input name="ordered"><br>
    品牌介紹：<textarea name="description" rows="5" cols="20"></textarea><br>
    狀態：
    <input type="radio" name="status" value="0">禁用
    <input type="radio" name="status" value="1">啟用<br>
    <input type="submit" value="提交">
</form>
<hr>
<a href="./selectAllServlet">取消新增</a><br>
</body>
</html>