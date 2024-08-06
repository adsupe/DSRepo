package study.springboot.crud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sts")
public class Student 
{
    @Id 
     @GeneratedValue(strategy = GenerationType.AUTO)
	 private int Id;
     private String studentName;
     private String dob;
     private String address;
     private String email;
     private String phoneno;
     private String gender;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String dob, String address, String email, String phoneno,
			String gender) {
		super();
		//this.Id = Id;
		this.studentName = studentName;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.phoneno = phoneno;
		this.gender = gender;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", studentName=" + studentName + ", dob=" + dob + ", address="
				+ address + ", email=" + email + ", phoneno=" + phoneno + ", gender=" + gender + "]";
	}
     
	
     
	
     
}
