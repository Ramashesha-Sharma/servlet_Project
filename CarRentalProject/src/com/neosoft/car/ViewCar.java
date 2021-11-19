package com.neosoft.car;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elib.beans.CarBean;
import com.elib.dao.CarDao;
@WebServlet("/ViewCar")
public class ViewCar extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>View Car details</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		request.getRequestDispatcher("navadmin.html").include(request, response);
		out.println("<div class='container'>");
		
		List<CarBean> list=CarDao.view();
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Id</th><th>Car Name</th><th>Car Number</th><th>Number of seats</th><th>Rent Per day</th><th>Booking Status</th><th>Edit</th><th>Delete</th><th>Book a Car</th></tr>");
		for(CarBean bean:list){
			out.println("<tr><td>"+bean.getId()+"</td><td>"+bean.getCarName()+"</td><td>"+bean.getCarNum()+"</td><td>"+bean.getSeats()+"</td><td>"+bean.getRent()+"</td><td>"+bean.getStatus()+"</td><td><a href='EditCarForm?id="+bean.getId()+"'>Edit</a></td><td><a href='DeleteCar?id="+bean.getId()+"'>Delete</a></td><td><a href='BookCarForm?id="+bean.getId()+"'>Book</a></td></tr>");
		}
		out.println("</table>");
		
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
		
	}
}
