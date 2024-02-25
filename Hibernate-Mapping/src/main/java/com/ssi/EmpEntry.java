package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Project p1=new Project("P1");
		Project p2=new Project("P2");
		Project p3=new Project("P3");
		
		List<Project>list1=new ArrayList<Project>();   list1.add(p1); list1.add(p2);
		List<Project>list2=new ArrayList<Project>();   list2.add(p2); list2.add(p3);
		List<Project>list3=new ArrayList<Project>();   list3.add(p1); list3.add(p3);
		
		
		
		Emp e1=new Emp(111,"AAA",50000,new Laptop("L1"));    e1.setProjects(list1);
		Emp e2=new Emp(112,"BBB",60000,new Laptop("L2"));	 e2.setProjects(list1);
		Emp e3=new Emp(113,"CCC",70000,new Laptop("L3"));    e3.setProjects(list1);
		
		
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();
		
		System.out.println("Employee Information Stored....................................");

	}

}
