<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style= "background-color:lightgreen">
<hr>
<center>
<h1 style =" color:red">AMRUTHA AAHAR</h1>
<hr>
<br>
<br>
<h2 style="color:blue">"Amrutha Aahar"</h2>
<br>
where the natural food grows!
<br>
<br>
<br>
<br>
<a href ="/home"><button style= "background-color:blue; color:white">HOME</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<a href ="/veggies"><button style= "background-color:blue; color:white">VEGGIES</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<a href ="/fruits"><button style= "background-color:blue; color:white">FRUITS</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<a href ="/createFruits"><button style= "background-color:blue; color:white">CREATE FRUITS</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<a href ="/login"><button style= "background-color:blue; color:white">LOGOUT</button></a>
<br>
<br>
<br>
<h3>Fruits Details</h3>
<br>

<table border=2 width= 100%>
<tr><td>S.NO</td><td>Fruits</td><td>COST</td><td>Action</td></tr>
<c:forEach items ="${fruitsList}" var="fruits">
<tr><td>${fruits.fID}</td><td>${fruits.fName}</td><td>${fruits.fCost}</td><td><a href="/deleteFruits/${fruits.fID}"><button>Delete</button></a></td>
</tr>
</c:forEach>
</table>
<br><br><br>
<br><br><br>
<br><br><br>
<br><br><br>
<br><br><br>
<hr>
copyright@SangeethaSolutions
<hr>
</center>


</body>
</html>