package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Accounts {
	
	@Id
	private int ano;
	private String name;
	private int balance;
	
	@OneToMany(mappedBy="account")
	private List<Cards> cards;

	
	
	public Accounts(int ano) {
		super();
		this.ano = ano;
	}

	public Accounts() {
		super();
	}

	public Accounts(int ano, String name, int balance, List<Cards> cards) {
		super();
		this.ano = ano;
		this.name = name;
		this.balance = balance;
		this.cards = cards;
	}


	@Override
	public String toString() {
		return "Accounts [ano=" + ano + ", name=" + name + ", balance=" + balance + ", cards=" + cards + "]";
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Cards> getCards() {
		return cards;
	}

	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}
	
	
	

}
