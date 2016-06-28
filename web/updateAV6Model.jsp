<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update AV6 model</title>
    <style>
        body {background-color: darkgray;}
        table {border-collapse: collapse;}
        td, th {border: 1px solid gray;}
        th {background-color: gray; color: black;}
    </style>
    <link rel="stylesheet" href="<c:url value="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css"/>">
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script>
        $(function () {
            $("#datepicker").datepicker();
        });
    </script>
</head>
<body>
<p>update</p>
<form method="post" action="UpdateAV6ModelServlet">
    id: <input name="id" value="${param.id}"><br>
    date: <input name="date" id="datepicker"><br>
    wind direction: <input name="windDirectionName"><br>
    wind speed: <input name="windSpeed"><br>
    wind rush: <input name="windRush"><br>
    visibility: <input name="visibility"><br>
    octants num: <input name="octantsNumerator"><br>
    octants den: <input name="octantsDenominator"><br>
    cloud form: <input name="cloudForm"><br>
    cloudiness: <input name="cloudiness"><br>
    temperature: <input name="temperature"><br>
    dew point temperature: <input name="dewPointTemperature"><br>
    rel humidity: <input name="relativityHumidity"><br>
    abs humidity: <input name="absoluteHumidity"><br>
    atmosphere pressure: <input name="atmospherePressure"><br>
    barometric trend: <input name="barometricTrend"><br>
    qnh GPa: <input name="qnhGPa"><br>
    qnh mm: <input name="qnhMm"><br>
    qfe: <input name="qfe"><br>
    <br>
    <input type="submit" value="update"/>
</form>

</body>
</html>
