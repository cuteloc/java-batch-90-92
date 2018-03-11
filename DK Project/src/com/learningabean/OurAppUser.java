package com.learningabean;

public class OurAppUser {
	private String userName;
	private String dob;
	private String firstName;
	private String lastName;
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
//		OR
// class OurAppUser {
//	private String userName;
//	private String dob;
//	private String firstName;
//	private String lastName;
//	
//  public OurAppUser()
//	{
//	}
//
//}