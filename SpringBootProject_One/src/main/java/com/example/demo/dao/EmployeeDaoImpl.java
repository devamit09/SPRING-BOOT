package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory sf;

	@Override
	public void saveEmployeeData(Employee e) {
		
		System.out.println("Employee in Dao "+ e);
		Session session=sf.openSession();
		session.beginTransaction().commit();
		session.save(e);
		
		
	}

	@Override
	public List<Employee> getAllEmployee(String uname, String pass) {
		
		
		Session session=sf.openSession();
		if (uname.equals("expo") && pass.equals("expo@123")) {
			Query<Employee>query=session.createQuery("from Employee");
			List<Employee>slist=query.getResultList();
			
			return slist;
			
		}
		
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		Session session = sf.openSession();
		Employee e = session.get(Employee.class, id);

		session.delete(e);
		session.beginTransaction().commit();
		System.out.println("Deleted !!");
	}

	@Override
	public Employee editEmployee(int id) {
		Session session = sf.openSession();
		Employee e = session.get(Employee.class, id);
		return e;
	}

	@Override
	public void updateStudent(Employee e) {
		Session session = sf.openSession();
		session.update(e);
		session.beginTransaction().commit();
		
		
	}

}
