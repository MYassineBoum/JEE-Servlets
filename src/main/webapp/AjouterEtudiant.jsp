<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>CRUD JEE</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/StudentServlet" method="post">
    Nom : <input type="text" name="nom">
    <br> <br>

    Prénom : <input type="text" name="prenom">

    <input type="hidden" value="student" name="action">

    <br>
    <input type="submit" value="OK">
</form>
</body>
</html>