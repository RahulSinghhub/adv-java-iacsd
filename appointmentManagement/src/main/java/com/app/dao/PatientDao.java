package com.app.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.app.entities.Patients;



public interface PatientDao {
	

	
	Patients signIn(String email, String password) throws SQLException;
	List<Patients> getUserDetails(Date begin, Date end) throws SQLException;

}
