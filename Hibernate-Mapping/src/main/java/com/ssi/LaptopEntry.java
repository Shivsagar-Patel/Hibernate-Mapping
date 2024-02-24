package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		Laptop l1=new Laptop("L1","HP",50000);
		Laptop l2=new Laptop("L2","Sony",60000);
		Laptop l3=new Laptop("L3","Dell",70000);
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1);
		session.save(l2);
		session.save(l3);
		tr.commit();
		session.close();
		
		System.out.println("Laptop Information Stored....................................");

	}

}
