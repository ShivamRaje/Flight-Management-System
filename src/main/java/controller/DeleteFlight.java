package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FlightServiceImpl;
import dao.UserServiceImpl;

/**
 * Servlet implementation class DeleteFlight
 */
@WebServlet("/DelFlight")
public class DeleteFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	String fid=request.getParameter("param1");
	long flightId=Long.parseLong(fid);
	
	FlightServiceImpl service=new FlightServiceImpl();
int removeStatus=	service.removeFlight(flightId);
		if(removeStatus>0)
		{
			out.println("deleted successfully"+"<br>");
			out.println("<a href='ViewFlight.jsp'>check Details</a>");
		}
		else
		{
			out.println("not able to remove");
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
