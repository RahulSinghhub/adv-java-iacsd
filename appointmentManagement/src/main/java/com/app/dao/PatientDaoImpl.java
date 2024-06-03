package com.app.dao;

import static com.app.utils.Connect.getConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.entities.Patients;

public class PatientDaoImpl implements PatientDao {
	
	private Connection cn;
	private PreparedStatement pst1;
	
	public PatientDaoImpl() throws SQLException {
		// open cn
		cn = getConnection();
		pst1 = cn.prepareStatement("select * from patients");
		System.out.println("candidate dao is created....");
	}

	@Override
	public Patients signIn(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Patients> getUserDetails(Date begin, Date end) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void cleanup
	
	

	
}
