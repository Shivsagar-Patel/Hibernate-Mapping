package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountEntry {

	public static void main(String[] args) {
		
		
//		List<Cards>list1=new ArrayList<Cards>();
//		list1.add(new Cards("C1"));list1.add(new Cards("C2"));
//		
//		List<Cards>list2=new ArrayList<Cards>();
//		list2.add(new Cards("C3"));list2.add(new Cards("C4"));list2.add(new Cards("C5"));
		
        Accounts ac1=new Accounts(); 
        ac1.setAno(1111); ac1.setName("AAA");ac1.setBalance(50000);//ac1.setCards(list1);
        
        Accounts ac2=new Accounts(); 
        ac2.setAno(1112); ac2.setName("BBB");ac2.setBalance(60000);
		
	
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(ac1);
		session.save(ac2);
		tr.commit();
		session.close();
		System.out.println("Accounts Information Stored............................");

	}

}
