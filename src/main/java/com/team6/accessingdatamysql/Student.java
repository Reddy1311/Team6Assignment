package com.team6.accessingdatamysql;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdetails")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stdid")
	Integer stdid;
	
	@Column(name="Firstname")
	private String Firstname;
	
	@Column(name="Lastname")
	private String Lastname;

	@Column(name="Semester")
	private int Semester;
	
	@Column(name="Marks")
	private int Marks;
	
	@Column(name="Grades")
	private String Grades;
	
	@Column(name="Remarks")
	private String Remarks;

	
	public Integer getStdid() {
		return stdid;
	}

	public void setStdid(Integer stdid) {
		this.stdid = stdid;
	}
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public int getSemester() {
		return Semester;
	}

	public void setSemester(int semester) {
		this.Semester = semester;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
	public String getGrades() {
		return Grades;
	}

	public void setGrades(String grades) {
		Grades = grades;
	
}
	
}	
		
