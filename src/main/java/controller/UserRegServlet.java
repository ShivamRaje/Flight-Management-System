package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserServiceImpl;
import model.User;

/**
 * Servlet implementation class UserRegServlet
 */
@WebServlet("/UserSignUp")
public class UserRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegServlet() {
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
	
  //fetching all requested parameters from HTML element
  String name=request.getParameter("name");
  String pass=request.getParameter("password");
  String uType=request.getParameter("uType");
  String addr=request.getParameter("address");
  long ph=Long.parseLong(request.getParameter("phone"));
  String gender=request.getParameter("gen");
  String db=request.getParameter("dob");
  Date dob=null;
  //converting String date of birth into java.util.Date using yyyy-MM-dd format
  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
  try
  {
  dob =  sdf.parse(db);
  }catch(ParseException e)
  {
	  System.out.println(e);
	  
  }
  
  //construct the object of User class
 User user=new User();
 user.setUserName(name);
 user.setUserPassword(pass);
 user.setUserPhone(ph);
 user.setUserType(uType);
 user.setGender(gender);
 user.setUserDob(dob);
 user.setUserAddress(addr);
 
 //out.println(user);
UserServiceImpl service=new UserServiceImpl();
User userObj= service.addUser(user);
  if(userObj!=null)
  {
	  out.println("<h3><font color='green'>welcome"+" "+userObj.getUserName()+" "+"</font></h3><br>");
	  out.println("<a href='Home.jsp'>Home</a>");	
	  response.sendRedirect("Home.jsp");
  }else
  {
	  
	  response.sendRedirect("error.jsp");
  }
  
  
  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
