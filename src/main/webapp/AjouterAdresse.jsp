<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>CRUD JEE</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/AddressServlet" method="post">
    Rue : <input type="text" name="rue">
    <br> <br>

    Ville : <input type="text" name="ville">

    <input type="hidden" value="address" name="action">

    <br>
    <input type="submit" value="OK">
</form>
</body>
</html>