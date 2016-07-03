<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>display AV6 model</title>
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
    <%--<script src="<c:url value="/resources/datetimepicker-master/jquery.js"/>"></script>--%>
    <script>
        function getDateStr(ar) {
            var year = ar.substring(0, 4);
            var month = ar.substring(5, 7);
            var day = ar.substring(8, 10);
            var hour = ar.substring(11, 13);
            var minute = ar.substring(14, 16);
            return year + "/" + month + "/" + day + " " + hour + ":" + minute;
        }
    </script>
</head>
<body>
<form action="UpdateAV6ModelServlet" method="post" id="UpdateAV6ModelForm"></form>
<table>
    <tr>
        <th>id</th>
        <th>-----dateTime-----</th>
        <th>wind direction</th>
        <th>wind speed</th>
        <th>wind rush</th>
        <th>visibility</th>
        <th>---octants---</th>
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
            <td><label>
                <input type="text" hidden name="id" value="${av6Models.id}">${av6Models.id}
            </label></td>
            <td><label>
                <script>
                    document.write(getDateStr("${av6Models.date}"));
                </script>
            </label></td>
            <td><label>
                <input type="text" name="windDirectionName" value="${av6Models.windDirectionName}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="windSpeed" value="${av6Models.windSpeed}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="windRush" value="${av6Models.windRush}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="visibility" value="${av6Models.visibility}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="octantsNumerator" value="${av6Models.octantsNumerator}" size="1" form="UpdateAV6ModelForm">
                /
                <input type="text" name="octantsDenominator" value="${av6Models.octantsDenominator}" size="1" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="cloudForm" value="${av6Models.cloudForm}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="cloudiness" value="${av6Models.cloudiness}" size="7" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="temperature" value="${av6Models.temperature}" size="12" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="dewPointTemperature" value="${av6Models.dewPointTemperature}" size="12" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="relativityHumidity" value="${av6Models.relativityHumidity}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="absoluteHumidity" value="${av6Models.absoluteHumidity}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="atmospherePressure" value="${av6Models.atmospherePressure}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="barometricTrend" value="${av6Models.barometricTrend}" size="10" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input name="qnhGPa" value="${av6Models.qnhGPa}" size="7" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="qnhMm" value="${av6Models.qnhMm}" size="7" form="UpdateAV6ModelForm">
            </label></td>
            <td><label>
                <input type="text" name="qfe" value="${av6Models.qfe}" size="5" form="UpdateAV6ModelForm">
            </label></td>
            <td>
                <input type="submit" value="update" form="UpdateAV6ModelForm"/>
            </td>
        </tr>
    </c:forEach>
</table>

<form action="DeleteAV6ModelServlet">
    <label>
        delete by id: <input name="id" size="5">
    </label>
    <input type="submit" value="delete"/>
</form>

<form action="ReadAV6ModelServlet">
    <label>
        create by id: <input name="id" size="5">
    </label>
    <input type="submit" value="create"/>
</form>

</body>
</html>
