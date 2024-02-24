package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchAccount {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Accounts account=session.get(Accounts.class, 1111);
		
		System.out.println("Account Details:");
		System.out.println(account.getAno());
		System.out.println(account.getBalance());
		System.out.println(account.getName());
		
		List<Cards>cards=account.getCards();
		
		for(Cards card:cards)
		{
			System.out.println(card);
		}
		
		session.close();

	}

}
