package com.pro2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	
	@Column(name="eDep2")
	private String dep2;
	
	@Column(name="ePick")
	private String pick;
	
	@Column(name="eDrop")
	private String drop;
	
	@Column(name="eStatus")
	private String status;

	
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

	public String getDep2() {
		return dep2;
	}

	public void setDep2(String dep2) {
		this.dep2 = dep2;
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

	
	public Employee(int id, String name, String mail, String desig, String man, String dep1, String dep2, String pick,
			String drop, String status) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.desig = desig;
		this.man = man;
		this.dep1 = dep1;
		this.dep2 = dep2;
		this.pick = pick;
		this.drop = drop;
		this.status = status;
	}

}
