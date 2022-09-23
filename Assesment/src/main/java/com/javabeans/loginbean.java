package com.javabeans;

public class loginbean {
	private String empid;
	private String empname;
	private String date;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public loginbean(String empid, String empname, String date) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.date = date;
	}

	public loginbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "loginform [empid=" + empid + ", empname=" + empname + ", date=" + date + "]";
	}

}
