package com.app.tester;

import static com.app.utils.HibernateUtil.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.entities.Categaries;

public class RegisterCategary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in);){
			CategoryDao categary = new CategoryDaoImpl();
			System.out.println("Enter user details  - description  and name");
	        Categaries transientUser = new Categaries(sc.next(), sc.next());
	        System.out.println(categary.register(transientUser));
		}
            catch (Exception e) {
           	e.printStackTrace();
                   }
			
		}

}
