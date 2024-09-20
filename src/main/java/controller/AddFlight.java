package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FlightServiceImpl;
import model.Flight;

/**
 * Servlet implementation class AddFlight
 */
@WebServlet("/addMyFlight")
public class AddFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlight() {
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
	
   long fnum=Long.parseLong(request.getParameter("fno"));
   String fType=request.getParameter("fType");
   String fSrc=request.getParameter("fSource");
   String fDest=request.getParameter("fDest");
   String[] layOffs=request.getParameterValues("ch1");
   String fDate=request.getParameter("flyDate");
   double fCost=Double.parseDouble(request.getParameter("cost"));
   
   //to test whether request input from HTML elements are successfully fetcher or not
   
  /* out.println(fnum+" "+fType+" "+fSrc+" "
   +fDest+" "+Arrays.toString(layOffs)+" "+fDate+" "+fCost);*/
   
   //converting string into LocalDate object
   LocalDate ld=LocalDate.parse(fDate);
   //converting String[] into single string
   String layOffPoints=Arrays.toString(layOffs);
   
 //construct object of Flight using all requested inputs
   /*
    * 
    * public Flight(long flightNumber, String flightType, String flightSource, String fightDestination,
			String layOffPoints, LocalDate flyDate, double flightCharge)
    */
   Flight flightObj=new Flight(fnum, fType,fSrc, fDest,layOffPoints,ld,fCost);
   
   out.println(flightObj);
   
   //creating object of FlightServiceImpl class to access all dao methods
   FlightServiceImpl service=new FlightServiceImpl();
   //invoke addFlight(Flight obj)
 Flight obj=  service.addFlight(flightObj);
   if(obj!=null)
   {
	   out.print("<h3><font color='blue'>"
	   		+ ""+obj.getFlightType()+ " "+"added to system"+"</font></h3><br>");
	   out.print("<a href='AddFlight.jsp'>ADD MORE FLIGHT</a><br>");
	   out.print("<a href='adminTask.jsp'>Go ADMIN PAGE</a>");
	 
   }else
   {
	   out.print("<h3><font color='red'>Flight Not added</font></h3>");
   }
   
   
   
   
   
   
   
   
   
   
   
   
		
		
		
		
		
		
		
		
		
		
	}

}
