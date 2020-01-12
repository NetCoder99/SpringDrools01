//package com.home.SpringDrools01.entities.sqlserver;
//
//import java.io.Serializable;
//import javax.persistence.*;
//import java.sql.Timestamp;
//
//
//@Entity
//@Table(name = "ContactType", schema = "Person")
//@NamedQuery(name="ContactType.findAll", query="SELECT c FROM ContactType c")
//public class ContactType implements Serializable {
//	public static final long serialVersionUID = 1L;
//	public int contactTypeID;
//	public Timestamp modifiedDate;
//	public String name;
//
//	public ContactType() {
//	}
//
//	
//	@Override
//	public String toString() {
//	    return String.valueOf(this.contactTypeID) + ":" + this.name;	
//	}
//	
//	@Id
//	@Column(name="ContactTypeID")
//	public int getContactTypeID() {
//		return this.contactTypeID;
//	}
//
//	public void setContactTypeID(int contactTypeID) {
//		this.contactTypeID = contactTypeID;
//	}
//
//
//	@Column(name="ModifiedDate")
//	public Timestamp getModifiedDate() {
//		return this.modifiedDate;
//	}
//
//	public void setModifiedDate(Timestamp modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}
//
//
//	@Column(name="Name")
//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//}