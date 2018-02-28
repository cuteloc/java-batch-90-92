package com.basicsofjava.learninghasarelations;

public class Mobile {
	String color="Silver";
	double size=4.5;
	String os="Windows";
	Battery b1=new Battery();
	
	public void call(long number)
	{
		System.out.println("Calling "+number+".......");
	}
	public void music(String song)
	{
		System.out.println("Playing "+song+".......");
	}
	
	public void charging()
	{
		b1.charge();
	}

}
