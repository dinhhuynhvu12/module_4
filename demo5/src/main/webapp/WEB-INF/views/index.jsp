<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Currency Converter</title>
</head>
<body>

<h2>Currency Converter</h2>

<form action="convert" method="post">
  <label>Rate:</label>
  <input type="number" name="rate" value="25000">
  <br><br>

  <label>USD:</label>
  <input type="number" name="usd">
  <br><br>

  <button type="submit">Convert</button>
</form>

</body>
</html>