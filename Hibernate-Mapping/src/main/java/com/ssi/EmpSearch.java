package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		Session session =Utility.getSF().openSession();
		Emp emp=session.get(Emp.class,111);
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		
		System.out.println(emp.getLaptop().getLcode());
		System.out.println(emp.getLaptop().getBrand());
		System.out.println(emp.getLaptop().getPrice());
		
		List<Project> projects=emp.getProjects();
		
		for(Project project:projects)
		{
			System.out.println(project);
		}
		session.close();
	}

}
