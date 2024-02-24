package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CardEntry {

	public static void main(String[] args) {
		Cards c1=new Cards("C1","Pl-D-C",150000,new Accounts(1111));
		Cards c2=new Cards("C2","PL-C-C",50000,new Accounts(1111));
		Cards c3=new Cards("C3","GL-D-C",200000,new Accounts(1111));
		Cards c4=new Cards("C4","GL-C-C",330000,new Accounts(1112));
		Cards c5=new Cards("C5","SL-D-C",500000,new Accounts(1112));
		Cards c6=new Cards("C6","SL-C-C",400000,new Accounts(1112));
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(c1);session.save(c2);session.save(c3);session.save(c4);session.save(c5);session.save(c6);
		tr.commit();
		session.close();
		System.out.println("Cards Information Stored............................");

	}

}
