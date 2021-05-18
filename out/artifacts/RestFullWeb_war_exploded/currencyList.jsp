<%--
  Created by IntelliJ IDEA.
  User: zgabr
  Date: 5/18/2021
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table style="width:20%;margin: 15px">
    <tr>
        <th>
            Currency
        </th>
        <th>Rate</th>
        <th>Converted</th>

    </tr>
    <tr>
       <c:forEach items="${asd}" var="item">
        ${item}<br>
        </c:forEach>

    </tr>

</table>


<form action="user" method="post">
    <tr>
        <td>ToConvert</td>
        <td><input name="name"/></td>
    </tr>

    </table>
    <input type="submit"/>
</form>

<p>
    ${inputedCurrency+2}
</p>

</body>
</html>