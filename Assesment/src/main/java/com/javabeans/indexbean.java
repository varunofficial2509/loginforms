package com.javabeans;

public class indexbean {
private String empid;

public String getEmpid() {
	return empid;
}

public void setEmpid(String empid) {
	this.empid = empid;
}

public indexbean(String empid) {
	super();
	this.empid = empid;
}

public indexbean() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "indexbean [empid=" + empid + "]";
}

}
