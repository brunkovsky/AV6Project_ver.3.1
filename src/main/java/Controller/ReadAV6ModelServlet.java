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

public class ReadAV6ModelServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        AV6ModelDAO av6ModelDAO = new AV6ModelDAOImpl();
        int id = 0;
        try {
            id = Integer.parseInt(request.getParameter("id").trim());
        } catch (NumberFormatException e) {
            request.getRequestDispatcher("insertAV6Model.jsp").forward(request, response);
        }
        AV6Model av6Model = av6ModelDAO.readAV6ModelById(id);
        request.setAttribute("av6Model", av6Model);
        request.getRequestDispatcher("insertAV6Model.jsp").forward(request, response);
    }
}
