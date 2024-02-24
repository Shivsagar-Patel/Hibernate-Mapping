package com.ssi;

import org.hibernate.Session;

public class LaptopSearch {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Laptop laptop=session.get(Laptop.class,"L1");
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getLcode());
		System.out.println(laptop.getPrice());
		
		System.out.println(laptop.getEmp().getEcode());
		System.out.println(laptop.getEmp().getEname());
		System.out.println(laptop.getEmp().getSal());
		
		session.close();
	}

}
