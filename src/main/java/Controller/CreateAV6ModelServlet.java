package Controller;

import DAO.AV6ModelDAO;
import DAO.AV6ModelDAOImpl;
import Model.AV6Model;
import Utils.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class CreateAV6ModelServlet extends HttpServlet {
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

        Date date = DateUtil.getDateFromString(request.getParameter("date"));
        if (!request.getParameter("windDirectionName").trim().equals(""))
            windDirectionName = request.getParameter("windDirectionName");
        if (!request.getParameter("windSpeed").trim().equals(""))
            windSpeed = Integer.valueOf(request.getParameter("windSpeed"));
        if(!request.getParameter("windRush").trim().equals(""))
            windRush = Integer.valueOf(request.getParameter("windRush"));
        if(!request.getParameter("visibility").trim().equals(""))
            visibility = Integer.valueOf(request.getParameter("visibility"));
        if(!request.getParameter("octantsNumerator").trim().equals(""))
            octantsNumerator = Integer.valueOf(request.getParameter("octantsNumerator"));
        if(!request.getParameter("octantsDenominator").trim().equals(""))
            octantsDenominator = Integer.valueOf(request.getParameter("octantsDenominator"));
        if(!request.getParameter("cloudForm").trim().equals(""))
            cloudForm = request.getParameter("cloudForm");
        if(!request.getParameter("cloudiness").trim().equals(""))
            cloudiness = Integer.valueOf(request.getParameter("cloudiness"));
        if(!request.getParameter("temperature").trim().equals(""))
            temperature = Double.valueOf(request.getParameter("temperature"));
        if(!request.getParameter("dewPointTemperature").trim().equals(""))
            dewPointTemperature = Double.valueOf(request.getParameter("dewPointTemperature"));
        if(!request.getParameter("relativityHumidity").trim().equals(""))
            relativityHumidity = Integer.valueOf(request.getParameter("relativityHumidity"));
        if(!request.getParameter("absoluteHumidity").trim().equals(""))
            absoluteHumidity = Double.valueOf(request.getParameter("absoluteHumidity"));
        if(!request.getParameter("atmospherePressure").trim().equals(""))
            atmospherePressure = Double.valueOf(request.getParameter("atmospherePressure"));
        if(!request.getParameter("barometricTrend").trim().equals(""))
            barometricTrend = Double.valueOf(request.getParameter("barometricTrend"));
        if(!request.getParameter("qnhGPa").trim().equals(""))
            qnhGPa = Double.valueOf(request.getParameter("qnhGPa"));
        if(!request.getParameter("qnhMm").trim().equals(""))
            qnhMm = Double.valueOf(request.getParameter("qnhMm"));
        if(!request.getParameter("qfe").trim().equals(""))
            qfe = Double.valueOf(request.getParameter("qfe"));

        AV6ModelDAO av6ModelDAO = new AV6ModelDAOImpl();
        av6ModelDAO.createModel(new AV6Model(date, windDirectionName, windSpeed, windRush, visibility, octantsNumerator, octantsDenominator, cloudForm, cloudiness, temperature, dewPointTemperature, relativityHumidity, absoluteHumidity, atmospherePressure, barometricTrend, qnhGPa, qnhMm, qfe));
        List<AV6Model> av6Models = av6ModelDAO.readAll();
        request.setAttribute("av6Models", av6Models);
        request.getRequestDispatcher("displayAV6ModelList.jsp").forward(request, response);
    }
}
