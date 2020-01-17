package org.deloitte.sms.studentmarkregistration.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "STUDENT_INFO")
@Component

public class Student {

	@Id
	private String studentid;
	@Column(name="STUDENTNAME")
	private String studentname;
	@Column(name="STUDENTSTANDARD")
	private String studentstd;
	@Column(name="CATEGORY")
	private char stdcategory;
	
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentstd() {
		return studentstd;
	}
	public void setStudentstd(String studentstd) {
		this.studentstd = studentstd;
	}
	public char getStdcategory() {
		return stdcategory;
	}
	public void setStdcategory(char stdcategory) {
		this.stdcategory = stdcategory;
	}
	
	
	
}