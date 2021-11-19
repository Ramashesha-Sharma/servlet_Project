package com.neosoft.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elib.beans.CarBean;
import com.elib.dao.CarDao;

@WebServlet("/BookCarForm")
public class BookCarForm {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Book Car Form</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		request.getRequestDispatcher("navadmin.html").include(request, response);
		out.println("<div class='container'>");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		CarBean bean=CarDao.viewById(id);
		
		out.print("<form action='BookCar' method='post' style='width:300px'>");
		out.print("<div class='form-group'>");
		out.print("<input type='hidden' name='id' value='"+bean.getId()+"'/>");
		out.print("<label for='name1'>Car Name</label>");
		out.print("<input type='text' class='form-control' value='"+bean.getCarName()+"' name='carname' id='name1' placeholder='Car Name'/>");
		out.print("</div>");
		out.print("<div class='form-group'>");
		out.print("<label for='carnum'>Car Number</label>");
		out.print("<input type='text' class='form-control' value='"+bean.getCarNum()+"'  name='email' id='email1' placeholder='Car Number'/>");
		out.print("</div>");
		out.print("<div class='form-group'>");
		out.print("<label for='seats'>Numebr of seats</label>");
		out.print("<input type='number' class='form-control' value='"+bean.getSeats()+"'  name='seats' id='password1' placeholder='Number of seats'/>");
		out.print("</div>  ");
		out.print("<div class='form-group'>");
		out.print("<label for='rent'>Rent Per Day</label>");
		out.print("<input type='number' class='form-control' value='"+bean.getRent()+"'  name='rent' id='mobile1' placeholder='Mobile'/>");
		out.print("</div>");
		out.print("<label for='rent'>Customer ID</label>");
		out.print("<input type='number' class='form-control' ' name='Cid' id='mobile1' placeholder='Customer id'/>");
		out.print("</div>");
		out.print("<button type='submit' class='btn btn-primary'>Book Now</button>");
		out.print("</form>");
		
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
		
	}
}
