package com.shristi.maven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
private int depId;

private String  deptName;
private String deptHead;
public int getDepId() {
	return depId;
}
//@Value("2")
public void setDepId(int depId) {
	this.depId = depId;
}
public String getDeptName() {
	return deptName;
}
//@Value("cse")
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getDeptHead() {
	return deptHead;
}
//@Value("HOD")
public void setDeptHead(String deptHead) {
	this.deptHead = deptHead;
}
@Override
public String toString() {
	return "Department [depId=" + depId + ", deptName=" + deptName + ", deptHead=" + deptHead + "]";
}



}
