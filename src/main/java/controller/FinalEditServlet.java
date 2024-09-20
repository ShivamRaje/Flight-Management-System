package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FlightServiceImpl;
import model.Flight;

/**
 * Servlet implementation class FinalEditServlet
 */
@WebServlet("/FinalEdit")
public class FinalEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditServlet() {
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
   
   
   long fid=Long.parseLong(request.getParameter("t1"));
   String ftype=request.getParameter("t2");
   String fsrc=request.getParameter("t3");
   String fdest=request.getParameter("t4");
   String flayOffs=request.getParameter("t5");
   LocalDate fdate=LocalDate.parse(request.getParameter("t6"));
   Double fcost=Double.parseDouble(request.getParameter("t7"));
   
   //based on the above input creating the object of Flight
   Flight flight=new Flight(fid, ftype, fsrc, fdest, flayOffs, fdate, fid);
   
   //creating the object FlightServiceImpl
   FlightServiceImpl service=new FlightServiceImpl();
   //invoking method editeFligt(long fno,Flight newFlight)
   int updateStatus=  service.editFlight(fid, flight);
   if(updateStatus>0)
   {
	   out.print("updated successfully"+"<br>");
	   out.print("<a href='ViewFlight.jsp'>View Updated Flight</a>");
   }
   else
   {
	   out.print("not able to update");
   }
   
   
   
   
   
   

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
