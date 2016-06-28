package Controller;

import DAO.AV6ModelDAO;
import DAO.AV6ModelDAOImpl;
import Model.AV6Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class UpdateAV6ModelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String windDirectionName = null;
        Integer windSpeed = null;
        Integer windRush = null;
        Integer visibility = null;
        Integer octantsNumerator = null;
        Integer octantsDenominator = null;
        String cloudForm = null;
        Integer cloudiness = null;
        Double temperature = null;
        Double dewPointTemperature = null;
        Integer relativityHumidity = null;
        Double absoluteHumidity = null;
        Double atmospherePressure = null;
        Double barometricTrend = null;
        Double qnhGPa = null;
        Double qnhMm = null;
        Double qfe = null;

        Date date = getDateFromString(request.getParameter("date"));
        if (!request.getParameter("windDirectionName").equals(""))
            windDirectionName = request.getParameter("windDirectionName");
        if (!request.getParameter("windSpeed").equals(""))
            windSpeed = Integer.valueOf(request.getParameter("windSpeed"));
        if(!request.getParameter("windRush").equals(""))
            windRush = Integer.valueOf(request.getParameter("windRush"));
        if(!request.getParameter("visibility").equals(""))
            visibility = Integer.valueOf(request.getParameter("visibility"));
        if(!request.getParameter("octantsNumerator").equals(""))
            octantsNumerator = Integer.valueOf(request.getParameter("octantsNumerator"));
        if(!request.getParameter("octantsDenominator").equals(""))
            octantsDenominator = Integer.valueOf(request.getParameter("octantsDenominator"));
        if(!request.getParameter("cloudForm").equals(""))
            cloudForm = request.getParameter("cloudForm");
        if(!request.getParameter("cloudiness").equals(""))
            cloudiness = Integer.valueOf(request.getParameter("cloudiness"));
        if(!request.getParameter("temperature").equals(""))
            temperature = Double.valueOf(request.getParameter("temperature"));
        if(!request.getParameter("dewPointTemperature").equals(""))
            dewPointTemperature = Double.valueOf(request.getParameter("dewPointTemperature"));
        if(!request.getParameter("relativityHumidity").equals(""))
            relativityHumidity = Integer.valueOf(request.getParameter("relativityHumidity"));
        if(!request.getParameter("absoluteHumidity").equals(""))
            absoluteHumidity = Double.valueOf(request.getParameter("absoluteHumidity"));
        if(!request.getParameter("atmospherePressure").equals(""))
            atmospherePressure = Double.valueOf(request.getParameter("atmospherePressure"));
        if(!request.getParameter("barometricTrend").equals(""))
            barometricTrend = Double.valueOf(request.getParameter("barometricTrend"));
        if(!request.getParameter("qnhGPa").equals(""))
            qnhGPa = Double.valueOf(request.getParameter("qnhGPa"));
        if(!request.getParameter("qnhMm").equals(""))
            qnhMm = Double.valueOf(request.getParameter("qnhMm"));
        if(!request.getParameter("qfe").equals(""))
            qfe = Double.valueOf(request.getParameter("qfe"));

        AV6ModelDAO av6ModelDAO = new AV6ModelDAOImpl();
        av6ModelDAO.updateModel(new AV6Model(date, windDirectionName, windSpeed, windRush, visibility, octantsNumerator, octantsDenominator, cloudForm, cloudiness, temperature, dewPointTemperature, relativityHumidity, absoluteHumidity, atmospherePressure, barometricTrend, qnhGPa, qnhMm, qfe));
        List<AV6Model> av6Models = av6ModelDAO.readAll();
        request.setAttribute("av6Models", av6Models);
        request.getRequestDispatcher("displayAV6Model.jsp").forward(request, response);
    }

    private Date getDateFromString(String date) {
        try {
            String year = date.substring(0, 4);
            String month = date.substring(5, 7);
            String day = date.substring(8, 10);
            String hour = date.substring(11, 13);
            String minute = date.substring(14, 16);
            System.out.println(year + " " + month + " " + day + " " + hour + " " + minute);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
