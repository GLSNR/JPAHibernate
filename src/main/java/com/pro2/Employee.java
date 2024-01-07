package com.pro2;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="eId")
	private int id;
	
	@Column(name="eName")
	private String name;
	
	@Column(name="eMail")
	private String mail;
	
	@Column(name="eDesig")
	private String desig;
	
	@Column(name="eManager")
	private String man;
	
	@Column(name="eDep1")
	private String dep1;
	
	@Column(name="ePro")
	private String project;
	
	@Column(name="ePick")
	private String pick;
	
	@Column(name="eDrop")
	private String drop;
	
	@Column(name="eStatus")
	private String status;
	
	@Column(name="eDate")
	private String date;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	public String getDep1() {
		return dep1;
	}

	public void setDep1(String dep1) {
		this.dep1 = dep1;
	}


	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getPick() {
		return pick;
	}

	public void setPick(String pick) {
		this.pick = pick;
	}

	public String getDrop() {
		return drop;
	}

	public void setDrop(String drop) {
		this.drop = drop;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Employee(int id, String name, String mail, String desig, String man, String dep1, String ePro, String pick,
			String drop, String status, String date) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.desig = desig;
		this.man = man;
		this.dep1 = dep1;
		this.project = ePro;
		this.pick = pick;
		this.drop = drop;
		this.status = status;
		this.date = date;
	}
	
	public Employee()
	{
		
	}

}
