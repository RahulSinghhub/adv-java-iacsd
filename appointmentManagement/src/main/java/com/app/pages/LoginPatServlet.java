package com.app.pages;

import static com.app.utils.Connect.openConnection;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.DoctorDaoImpl;
import com.app.dao.PatientDaoImpl;


/**
 * Servlet implementation class LoginPatServlet
 */
@WebServlet("/login")
public class LoginPatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PatientDaoImpl patientDao;
	private DoctorDaoImpl doctorDao;
	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ServletConfig config1 = getServletConfig();
		try {
			openConnection(config1.getInitParameter("db_url"),
					config.getInitParameter("user_name"),
					config.getInitParameter("password"));
			patientDao= new PatientDaoImpl();
			doctorDao = new DoctorDaoImpl();			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			patientDao.cleanUp();
			doctorDao.cleanUp();
			closeConnection();
		} catch (Exception e) {
			System.out.println("err in destroy - " + getClass());
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try(){
			
		}catv
	}

}
