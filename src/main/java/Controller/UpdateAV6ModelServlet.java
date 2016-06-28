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
        AV6ModelDAO av6ModelDAO = new AV6ModelDAOImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        Date date = getDateFromString(request.getParameter("date"));
        String windDirectionName = request.getParameter("windDirectionName");
        Integer windSpeed = Integer.valueOf(request.getParameter("windSpeed"));
        Integer windRush = Integer.valueOf(request.getParameter("windRush"));
        Integer visibility = Integer.valueOf(request.getParameter("visibility"));
        Integer octantsNumerator = Integer.valueOf(request.getParameter("octantsNumerator"));
        Integer octantsDenominator = Integer.valueOf(request.getParameter("octantsDenominator"));
        String cloudForm = request.getParameter("cloudForm");
        Integer cloudiness = Integer.valueOf(request.getParameter("cloudiness"));
        Double temperature = Double.valueOf(request.getParameter("temperature"));
        Double dewPointTemperature = Double.valueOf(request.getParameter("dewPointTemperature"));
        Integer relativityHumidity = Integer.valueOf(request.getParameter("relativityHumidity"));
        Double absoluteHumidity = Double.valueOf(request.getParameter("absoluteHumidity"));
        Double atmospherePressure = Double.valueOf(request.getParameter("atmospherePressure"));
        Double barometricTrend = Double.valueOf(request.getParameter("barometricTrend"));
        Double qnhGPa = Double.valueOf(request.getParameter("qnhGPa"));
        Double qnhMm = Double.valueOf(request.getParameter("qnhMm"));
        Double qfe = Double.valueOf(request.getParameter("qfe"));
        av6ModelDAO.updateModelById(new AV6Model(id, date, windDirectionName, windSpeed, windRush, visibility, octantsNumerator, octantsDenominator, cloudForm, cloudiness, temperature, dewPointTemperature, relativityHumidity, absoluteHumidity, atmospherePressure, barometricTrend, qnhGPa, qnhMm, qfe));

        List<AV6Model> av6Models = av6ModelDAO.readAll();
        request.setAttribute("av6Models", av6Models);
        request.getRequestDispatcher("displayAV6Model.jsp").forward(request, response);
    }

    private Date getDateFromString(String date) {
        return new Date();
    }
}
