<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Result</title>
</head>
<body>

<h1>Selected Condiments</h1>

<%
  String[] condiments =
          (String[]) request.getAttribute("condiments");
%>

<ul>
  <%
    if (condiments != null) {
      for (String item : condiments) {
  %>

  <li><%= item %></li>

  <%
    }
  } else {
  %>

  <li>No condiment selected</li>

  <%
    }
  %>
</ul>

<a href="/">Back</a>

</body>
</html>