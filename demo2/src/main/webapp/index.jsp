<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Calculator</title>
</head>
<body>

<h1>Calculator</h1>

<form action="${pageContext.request.contextPath}/calculate" method="post">
    <input type="number" name="num1" value="${num1}" required>
    <input type="number" name="num2" value="${num2}" required>

    <br><br>

    <button type="submit" name="operator" value="add">Addition(+)</button>
    <button type="submit" name="operator" value="sub">Subtraction(-)</button>
    <button type="submit" name="operator" value="mul">Multiplication(X)</button>
    <button type="submit" name="operator" value="div">Division(/)</button>
</form>

<%
    Object result = request.getAttribute("result");
    Object label = request.getAttribute("label");

    if (result != null) {
%>
<h2>Result <%= label %> : <%= result %></h2>
<%
    }
%>

</body>
</html>