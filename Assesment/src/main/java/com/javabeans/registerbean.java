package com.javabeans;

public class registerbean {
private String empid;
private String empname;
private String email;
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid2) {
	this.empid = empid2;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public registerbean(String empid, String empname, String email) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.email = email;
}
public registerbean() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "registerform [empid=" + empid + ", empname=" + empname + ", email=" + email + "]";
}

}
