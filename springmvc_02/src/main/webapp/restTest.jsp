<html>
<link href="static/css/bbb.css" type="text/css">
<body>
<%--<script src="static/js/aaa.js" type="text/javascript"></script>--%>
<h2>Hello World!</h2>
<img src="static/img/img.png"/>
<form action="testRest/13" method="post">
    <input type="submit" name="post" value="post">
</form>
<form action="testRest/10" method="POST">
    <input  type="hidden" name="_method" value="PUT">
    <input type="submit" value="testPUT">
</form>
<br/>
<form action="testRest/10" method="POST">
    <input  type="hidden" name="_method" value="DELETE">
    <input type="submit" value="testDELETE">
</form>
<br/>
<form action="testRest/13" method="get">
    <input type="submit" name="get" value="get">
</form>
</body>
</html>
