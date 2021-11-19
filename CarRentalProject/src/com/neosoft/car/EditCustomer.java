package com.neosoft.car;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elib.beans.CustomerBean;
import com.elib.dao.CustomerDao;
@WebServlet("/EditCustomer")
public class EditCustomer extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String cmobile=request.getParameter("mobile");
		long mobile=Long.parseLong(cmobile);
		CustomerBean bean=new CustomerBean(id,name, email, address, mobile);
		CustomerDao.update(bean);
		response.sendRedirect("ViewCustomer");
	}

}
