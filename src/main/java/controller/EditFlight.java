package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FlightServiceImpl;
import model.Flight;

/**
 * Servlet implementation class EditFlight
 */
@WebServlet("/EditFlight")
public class EditFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  response.setContentType("text/html");
  PrintWriter out=response.getWriter();
  
  String fnumber=request.getParameter("param1");
  long fno=Long.parseLong(fnumber);
  FlightServiceImpl service=new FlightServiceImpl();
  Flight flightObj=service.getFlightByNumber(fno);
  System.out.println(flightObj);
  out.print("<center><form action='FinalEdit' method='post'>");
  out.print("<input type='hidden' name='t1' value="+flightObj.getFlightNumber()+"><br>");
  out.print("<label for='fType'>Edit Flight Type</label><input type='text' name='t2' value="+flightObj.getFlightType()+"><br>");
  out.print("<label for='fSource'>Edit Source Airport</label><input type='text' name='t3' value="+flightObj.getFlightSource()+"><br>");
  out.print("<label for='fDest'>Edit Destination Airport</label><input type='text' name='t4' value="+flightObj.getFightDestination()+"><br>");
  out.print("<label for='flay'>Edit LayOff Points</label><input type='text' name='t5' value="+flightObj.getLayOffPoints()+"><br>");
  out.print("<label for='fdate'>Edit Flight Date</label><input type='date' name='t6' value="+flightObj.getFlyDate()+"><br>");
  out.print("<label for='fCharge'>Edit Flight Cost</label><input type='text' name='t7' value="+flightObj.getFlightCharge()+"><br>");
  out.print("<input type='submit'  value='EDIT'>");
  out.print("</form></center>");
  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
