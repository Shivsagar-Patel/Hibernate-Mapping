package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cards {
	@Id
	private String cno;
	private String ctype;
	
	@Column(name="climit")
	private int limit; //limit is an keyword in sql so we donot take as a col name 
	
	@ManyToOne
	private Accounts account;
	

	public Cards() {
		super();
	}
	public Cards(String cno) {
		super();
		this.cno = cno;
	}
	public Cards(String cno, String ctype, int limit) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.limit = limit;
	}
	
	
	
	
	public Cards(String cno, String ctype, int limit, Accounts account) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.limit = limit;
		this.account = account;
	}
	public Accounts getAccount() {
		return account;
	}
	public void setAccount(Accounts account) {
		this.account = account;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "Cards [cno=" + cno + ", ctype=" + ctype + ", limit=" + limit + "]";
	}
	
	

}
