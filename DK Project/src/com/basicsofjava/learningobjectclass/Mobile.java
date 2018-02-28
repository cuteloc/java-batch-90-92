package com.basicsofjava.learningobjectclass;

public class Mobile {
	
	double size=4.5;
	static String os="IOs";
	String color="Black";
	Mobile(double size,String os)
	{
		size=this.size;
		color=this.os;
		
	}
	Mobile(double size)
	{
		this.size=size;
	}
Mobile(String color)
{
	this.color=color;
}
	void call(long number)
	{
		System.out.println("Calling "+number+".......");
	}
	void music(String song)
	{
		System.out.println("Playing "+song+".......");
	}
	void callMusic(long number,String song)
	{
		System.out.println("Calling "+number+"and playing "+song);
	}
	void color()
	{
		System.out.println(color);
	}
	static void Os()
	{
		System.out.println("Operating system is "+os);
		System.out.println("hi again");
	}
}
