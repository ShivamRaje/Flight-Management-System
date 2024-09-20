package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FlightServiceImpl;
import model.Flight;

/**
 * Servlet implementation class SearchFlightController
 */
@WebServlet("/searchFlight")
public class SearchFlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchFlightController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    
    String source=request.getParameter("t1");
    String dest=request.getParameter("t2");
    String doj=request.getParameter("t3");
    
    
    LocalDate ld=LocalDate.parse(doj);
    
    FlightServiceImpl service=new FlightServiceImpl();
  List<Flight> list=  service.getFlightByLocation(source, dest, ld);
    HttpSession session=request.getSession();
    session.setAttribute("flightList", list);
    System.out.println(list);
    RequestDispatcher rd=request.getRequestDispatcher("ViewSearchedFlight.jsp");
    rd.forward(request, response);
    
	}

}
