package com.jdbc.studentmgt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student 
{
  @Id
  @GeneratedValue
  @Column(name="s_id")
  private int id;
  @Column(name="s_name",nullable=false,length=30)
  private String name;
  @Column(name="s_contact",nullable=false,length=10,unique=true)
  private String contact;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "aid")
  private Address address;
 
  
  public Student() {
		
	}
  public Student( String name, String contact,Address address) {
		super();
		//this.sid = sid;
		this.name = name;
		this.contact = contact;
		this.address=address;
	}
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
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
}
}

