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
@WebServlet("/BookCar")
public class BookCar {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String name=request.getParameter("carname");
		String carnum=request.getParameter("carnum");
		String cseats=request.getParameter("seats");
		String crent=request.getParameter("rent");
		String status=request.getParameter("status");
		int seats=Integer.parseInt(cseats);
		long rent=Long.parseLong(crent);
		if(status.equalsIgnoreCase("no")) {
			status="yes";
			CarBean bean=new CarBean(id,name, carnum, seats, rent,status);
			CarDao.update(bean);
			response.sendRedirect("ViewCar");
		}
		else
		{
			out.println("That car is already booked");
			response.sendRedirect("ViewCar");
		}

	}
}
