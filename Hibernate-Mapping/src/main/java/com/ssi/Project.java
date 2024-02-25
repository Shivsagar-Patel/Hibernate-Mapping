package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private String pcode;
	private String title;
	private String client;

	@ManyToMany(mappedBy="projects")
	private List<Emp> emps;

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public Project(String pcode, String title, String client) {
		super();
		this.pcode = pcode;
		this.title = title;
		this.client = client;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", title=" + title + ", client=" + client + ", emps=" + emps + "]";
	}

	public Project(String pcode, String title, String client, List<Emp> emps) {
		super();
		this.pcode = pcode;
		this.title = title;
		this.client = client;
		this.emps = emps;
	}

	public Project() {
		super();
	}

	public Project(String pcode) {
		super();
		this.pcode = pcode;
	}
	
	
	

	
}
