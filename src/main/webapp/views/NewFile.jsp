<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello</h1>
<h1>hii</h1>

<form action="sub" method="post">
Enter 1st num1: <input type="text" name="num1">
Enter 1st num2: <input type="text" name="num2">
<input type="submit" value="sub">
</form>

<form action="addAlien" method="post">
Enter 1st id: <input type="text" name="aid">
Enter 1st name: <input type="text" name="aname">
<input type="submit">
</form>

<form action="deleteAlien" method="post">
Enter 1st id: <input type="text" name="aid">
<input type="submit">
</form>

<form action="getAlienbyname">
Enter 1st name: <input type="text" name="aname">
<input type="submit">
</form>
</body>
</html>