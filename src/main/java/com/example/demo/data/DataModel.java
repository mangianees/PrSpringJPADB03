package com.example.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DataModel")
public class DataModel {
	@Override
	public String toString() {
		return "DataModel [aid=" + aid + ", aName=" + aName + ", fName=" + fName + "]";
	}
	@Id
	private int aid;
	String aName;
	String fName;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}

}
