package com.one2one.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="student")
public class Student 
{
			
		   @Id
		   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	private String name;
	private int mobile;
	
	public Student(String name, int mobile)
	{
		super();
		this.name = name;
		this.mobile = mobile;
	}

	public Student() 
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
}
