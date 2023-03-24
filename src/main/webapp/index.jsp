<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Cookie & Session practice</h2>
</body>
<h3>Cookie</h3>
    練習1:新增Cookie至用戶瀏覽器<br>
    <form action="./cookieDemo01" method="post">
        &nbsp;&nbsp;用戶名稱：<input name="username">
        &nbsp;<input type="submit" value="提交"><br>
    </form>
    <a href="./cookieDemo02">練習2:從用戶瀏覽器獲取Cookie</a><br>
<hr>
<h3>Session</h3>
    練習3:服務器獲取session對象並設置屬性進行儲存<br>
    <form action="./sessionDemo01" method="post">
        &nbsp;&nbsp;用戶名稱：<input name="username">
        &nbsp;<input type="submit" value="提交"><br>
    </form>
    <a href="./sessionDemo02">練習4:服務器獲取並返回session對象屬性值</a><br>
    <a href="./sessionDemo03">練習5:服務器調用invalidate()方法銷毀session</a><br>
<h3>綜合練習</h3>
    <a href="./User/login.jsp">練習6:結合Cookie與session實作用戶登入及註冊</a><br>
<hr>
</html>
