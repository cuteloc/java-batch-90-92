package com.listdemo;

public class Student {
	String name;
	int id;
	public Student(String name,int id)
	{
		super();
		this.name=name;
		this.id=id;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	
	
	

}
