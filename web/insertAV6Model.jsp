<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert AV6 Model</title>
    <style>
        body {
            background-color: darkgray;
        }

        table {
            border-collapse: collapse;
        }

        td, th {
            border: 1px solid gray;
        }

        th {
            background-color: gray;
            color: black;
        }
    </style>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script>
        $(function() {
            $( "#datepicker" ).datepicker({
                showOtherMonths: true,
                selectOtherMonths: true,
                changeMonth: true,
                changeYear: true
            });
        });
    </script>
</head>
<body>
<table>
    <tr>
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
    <tr>
        <form action="CreateAV6ModelServlet" method="post">
            <td><label>
                <input name="date" value="${av6Model.date}" size="15" id="datepicker">
            </label></td>
            <td><label>
                <input name="windDirectionName" value="${av6Model.windDirectionName}" size="10">
            </label></td>
            <td><label>
                <input name="windSpeed" value="${av6Model.windSpeed}" size="10">
            </label></td>
            <td><label>
                <input name="windRush" value="${av6Model.windRush}" size="10">
            </label></td>
            <td><label>
                <input name="visibility" value="${av6Model.visibility}" size="10">
            </label></td>
            <td><label>
                <input name="octantsNumerator" value="${av6Model.octantsNumerator}" size="1">
                /
                <input name="octantsDenominator" value="${av6Model.octantsDenominator}" size="1">
            </label></td>
            <td><label>
                <input name="cloudForm" value="${av6Model.cloudForm}" size="10">
            </label></td>
            <td><label>
                <input name="cloudiness" value="${av6Model.cloudiness}" size="7">
            </label></td>
            <td><label>
                <input name="temperature" value="${av6Model.temperature}" size="12">
            </label></td>
            <td><label>
                <input name="dewPointTemperature" value="${av6Model.dewPointTemperature}" size="12">
            </label></td>
            <td><label>
                <input name="relativityHumidity" value="${av6Model.relativityHumidity}" size="10">
            </label></td>
            <td><label>
                <input name="absoluteHumidity" value="${av6Model.absoluteHumidity}" size="10">
            </label></td>
            <td><label>
                <input name="atmospherePressure" value="${av6Model.atmospherePressure}" size="10">
            </label></td>
            <td><label>
                <input name="barometricTrend" value="${av6Model.barometricTrend}" size="10">
            </label></td>
            <td><label>
                <input name="qnhGPa" value="${av6Model.qnhGPa}" size="7">
            </label></td>
            <td><label>
                <input name="qnhMm" value="${av6Model.qnhMm}" size="7">
            </label></td>
            <td><label>
                <input name="qfe" value="${av6Model.qfe}" size="5">
            </label></td>
            <td>
                <input type="submit" value="insert"/>
            </td>
        </form>
    </tr>
</table>
</body>
</html>
