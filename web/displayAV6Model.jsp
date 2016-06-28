<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>display AV6 model</title>
    <style>
        body {background-color: darkgray;}
        table {border-collapse: collapse;}
        td, th {border: 1px solid gray;}
        th {background-color: gray; color: black;}
    </style>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>date</th>
        <th>wind direction</th>
        <th>wind speed</th>
        <th>wind rush</th>
        <th>visibility</th>
        <th>octants</th>
        <th>cloud form</th>
        <th>cloudiness</th>
        <th>temperature</th>
        <th>d.p. temperature</th>
        <th>rel humidity</th>
        <th>abs humidity</th>
        <th>atm pressure</th>
        <th>barometric trend</th>
        <th>qnh GPa</th>
        <th>qnh mm</th>
        <th>qfe</th>
        <th>delete</th>
        <th>update</th>
    </tr>
    <c:forEach items="${requestScope.av6Models}" var="av6Models">
        <tr>
            <td>${av6Models.id}</td>
            <td>${av6Models.date}</td>
            <td>${av6Models.windDirectionName}</td>
            <td>${av6Models.windSpeed}</td>
            <td>${av6Models.windRush}</td>
            <td>${av6Models.visibility}</td>
            <td>${av6Models.octantsNumerator}/${av6Models.octantsDenominator}</td>
            <td>${av6Models.cloudForm}</td>
            <td>${av6Models.cloudiness}</td>
            <td>${av6Models.temperature}</td>
            <td>${av6Models.dewPointTemperature}</td>
            <td>${av6Models.relativityHumidity}</td>
            <td>${av6Models.absoluteHumidity}</td>
            <td>${av6Models.atmospherePressure}</td>
            <td>${av6Models.barometricTrend}</td>
            <td>${av6Models.qnhGPa}</td>
            <td>${av6Models.qnhMm}</td>
            <td>${av6Models.qfe}</td>
            <td>
            <form action="DeleteAV6ModelServlet">
                <label>
                    <input name="id" value="${av6Models.id}">
                </label>
                <input type="submit" value="delete"/>
            </form>
            </td>
            <td>
                <form action="updateAV6Model.jsp">
                    <label>
                        <input name="id" value="${av6Models.id}">
                    </label>
                    <input type="submit" value="update"/>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
