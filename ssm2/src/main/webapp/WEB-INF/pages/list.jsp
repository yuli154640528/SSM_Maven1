<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有</h3>

    <c:forEach var="account" items="${list}" >
        ${account.id}
        ${account.name}
        ${account.money}<br/>
    </c:forEach>
</body>
</html>
