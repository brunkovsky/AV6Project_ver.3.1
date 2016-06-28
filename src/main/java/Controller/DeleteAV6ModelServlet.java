package Controller;

import DAO.AV6ModelDAO;
import DAO.AV6ModelDAOImpl;
import Model.AV6Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeleteAV6ModelServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        AV6ModelDAO av6ModelDAO = new AV6ModelDAOImpl();
        int delId = Integer.parseInt(request.getParameter("id"));
        av6ModelDAO.deleteModelById(delId);
        List<AV6Model> av6Models = av6ModelDAO.readAll();
        request.setAttribute("av6Models", av6Models);
        request.getRequestDispatcher("displayAV6Model.jsp").forward(request, response);
    }
}
