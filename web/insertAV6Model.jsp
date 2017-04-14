<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
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

        td {
            border: 1px solid gray;
        }

    </style>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/datetimepicker-master/jquery.datetimepicker.css"/>"/>
    <script src="<c:url value="/resources/datetimepicker-master/jquery.js"/>"></script>
    <script src="<c:url value="/resources/datetimepicker-master/build/jquery.datetimepicker.full.js"/>"></script>
    <script>
        $(function () {
            $('#datetimepicker').datetimepicker({});
        });
    </script>
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
<form action="CreateAV6ModelServlet" method="post" id="CreateAV6ModelForm"></form>
<table>
    <tr>
        <th>------dateTime------</th>
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
    <tr>
        <td><label>
            <input type="text" name="date" size="15" id="datetimepicker" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="windDirectionName" value="${requestScope.av6Model.windDirectionName}" size="10" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="windSpeed" value="${requestScope.av6Model.windSpeed}" size="10" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="windRush" value="${requestScope.av6Model.windRush}" size="10" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="visibility" value="${requestScope.av6Model.visibility}" size="10" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="octantsNumerator" value="${requestScope.av6Model.octantsNumerator}" size="1" form="CreateAV6ModelForm">
            /
            <input type="text" name="octantsDenominator" value="${requestScope.av6Model.octantsDenominator}" size="1" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="cloudForm" value="${requestScope.av6Model.cloudForm}" size="10" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="cloudiness" value="${requestScope.av6Model.cloudiness}" size="7" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="temperature" value="${requestScope.av6Model.temperature}" size="12" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="dewPointTemperature" value="${requestScope.av6Model.dewPointTemperature}" size="12"
                   form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="relativityHumidity" value="${requestScope.av6Model.relativityHumidity}" size="10"
                   form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="absoluteHumidity" value="${requestScope.av6Model.absoluteHumidity}" size="10"
                   form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="atmospherePressure" value="${requestScope.av6Model.atmospherePressure}" size="10"
                   form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="barometricTrend" value="${requestScope.av6Model.barometricTrend}" size="10"
                   form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="qnhGPa" value="${requestScope.av6Model.qnhGPa}" size="7" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="qnhMm" value="${requestScope.av6Model.qnhMm}" size="7" form="CreateAV6ModelForm">
        </label></td>
        <td><label>
            <input type="text" name="qfe" value="${requestScope.av6Model.qfe}" size="5" form="CreateAV6ModelForm">
        </label></td>
    </tr>
</table>
<input type="submit" value="insert" form="CreateAV6ModelForm"/>
</body>
</html>
