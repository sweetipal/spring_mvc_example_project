package com.lcwd.mvc.SpringMvcProject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	private String name;
	private int empId;
	private String phone;
	
	
	//consume: json include karna hai :setter : @JsonProperty
	// produce: json exclude karna hai: getter: @JsonIgnor
	
	
	@JsonIgnore
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonIgnore
	public String getDept() {
		return dept;
	}
   @JsonProperty
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", empId=" + empId + ", phone=" + phone + ", dept=" + dept + "]";
	}

}
