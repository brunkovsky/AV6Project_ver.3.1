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
        <th>octants-----</th>
        <th>cloud form</th>
        <th>cloudiness</th>
        <th>temperature</th>
        <th>d.p. temperature</th>
        <th>rel. humidity</th>
        <th>abs. humidity</th>
        <th>atm. pressure</th>
        <th>bar. trend</th>
        <th>qnh GPa</th>
        <th>qnh mm</th>
        <th>qfe</th>
    </tr>
    <c:forEach items="${requestScope.av6Models}" var="av6Models">
        <tr>
            <form action="UpdateAV6ModelServlet" method="post">
                <td><label>
                    <input hidden name="id" value="${av6Models.id}">${av6Models.id}
                </label></td>
                <td><label>
                    ${av6Models.date}
                </label></td>
                <td><label>
                    <input name="windDirectionName" value="${av6Models.windDirectionName}" size="10">
                </label></td>
                <td><label>
                    <input name="windSpeed" value="${av6Models.windSpeed}" size="10">
                </label></td>
                <td><label>
                    <input name="windRush" value="${av6Models.windRush}" size="10">
                </label></td>
                <td><label>
                    <input name="visibility" value="${av6Models.visibility}" size="10">
                </label></td>
                <td><label>
                    <input name="octantsNumerator" value="${av6Models.octantsNumerator}" size="1">
                    /
                    <input name="octantsDenominator" value="${av6Models.octantsDenominator}" size="1">
                </label></td>
                <td><label>
                    <input name="cloudForm" value="${av6Models.cloudForm}" size="10">
                </label></td>
                <td><label>
                    <input name="cloudiness" value="${av6Models.cloudiness}" size="7">
                </label></td>
                <td><label>
                    <input name="temperature" value="${av6Models.temperature}" size="12">
                </label></td>
                <td><label>
                    <input name="dewPointTemperature" value="${av6Models.dewPointTemperature}" size="12">
                </label></td>
                <td><label>
                    <input name="relativityHumidity" value="${av6Models.relativityHumidity}" size="10">
                </label></td>
                <td><label>
                    <input name="absoluteHumidity" value="${av6Models.absoluteHumidity}" size="10">
                </label></td>
                <td><label>
                    <input name="atmospherePressure" value="${av6Models.atmospherePressure}" size="10">
                </label></td>
                <td><label>
                    <input name="barometricTrend" value="${av6Models.barometricTrend}" size="10">
                </label></td>
                <td><label>
                    <input name="qnhGPa" value="${av6Models.qnhGPa}" size="7">
                </label></td>
                <td><label>
                    <input name="qnhMm" value="${av6Models.qnhMm}" size="7">
                </label></td>
                <td><label>
                    <input name="qfe" value="${av6Models.qfe}" size="5">
                </label></td>
                <td>
                    <input type="submit" value="update"/>
                </td>
            </form>
        </tr>
    </c:forEach>
</table>
<p>
<form action="DeleteAV6ModelServlet">
    <label>
        delete by id: <input name="id" size="5">
    </label>
    <input type="submit" value="delete"/>
</form>
</p>
<p>
<form action="ReadAV6ModelServlet">
    <label>
        create by id: <input name="id" size="5">
    </label>
    <input type="submit" value="create"/>
</form>
</p>
</body>
</html>
