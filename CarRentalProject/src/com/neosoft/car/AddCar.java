package com.neosoft.car;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elib.beans.CarBean;
import com.elib.dao.CarDao;
@WebServlet("/AddCar")
public class AddCar extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Add Car</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		request.getRequestDispatcher("navadmin.html").include(request, response);
		out.println("<div class='container'>");
		
		String name=request.getParameter("name");
		String carnum=request.getParameter("carnum");
		String cseats=request.getParameter("num");
		String crent=request.getParameter("rent");
		int seats = Integer.parseInt(cseats);
		long rent=Long.parseLong(crent);
		String status="No";
		CarBean bean=new CarBean(name, carnum, seats, rent,status);
		CarDao.save(bean);
		out.print("<h4>car details added successfully</h4>");
		request.getRequestDispatcher("addcarform.html").include(request, response);
		
		
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

}
