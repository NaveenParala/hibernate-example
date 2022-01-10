package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathya.dao.EmpDaoFactory;
import com.sathya.dao.IEmpDao;
import com.sathya.entity.Employee;
@WebServlet("/PaginationServlet")
public class PaginationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pageNo=Integer.parseInt(request.getParameter("pageNo"));

		int startIndex=pageNo*3-3;
		IEmpDao dao= EmpDaoFactory.getInstance();
		List list= dao.readEmps(startIndex);
		out.println("<center> <table boarder ='1'>");
		out.println("<tr>");
		out.println("<B><th>EMPNO</th><th>ENAME</th><th>SAL</th><th>DEPTNO</th></B>");
		out.println("</tr>");
		Iterator it=list.iterator();
		while(it.hasNext()){
			Employee e=(Employee)it.next();
			out.println("<tr>");
			out.println("<td>"+e.getEmpno()+"</td>");
			out.println("<td>"+e.getEname()+"</td>");
			out.println("<td>"+e.getSal()+"</td>");
			out.println("<td>"+e.getDeptno()+"</td>");
			out.println("</tr>");

		}
		out.println("</table>");

		long totalRows=dao.getNoOfRows();

		long noOfPages=totalRows/3;
		if(totalRows%3!=0){
			
			noOfPages++;
		}

		if(pageNo==1){

			int x=pageNo+1;
			out.println("<a href=./PaginationServlet?pageNo="+x+"> NEXT </a>");
		}
		else if(pageNo==noOfPages){

			
			int y=pageNo-1;
			out.println("<a href=./PaginationServlet?pageNo="+y+"> PREV </a>");
		}
		else{
			int x=pageNo-1;
			out.println("<a href=./PaginationServlet?pageNo="+x+"> PREV </a>");

			out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");

			int y=pageNo+1;
			out.println("<a href=./PaginationServlet?pageNo="+y+"> NEXT </a>");

		}
		out.println("</center>");

		out.close();

	}
}