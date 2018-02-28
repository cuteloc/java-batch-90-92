package com.basicsofjava.learningconstructor;

public class Mobile {
	int size=5;
	String color="Black";
	String os="Ios";
	Mobile(int size,String color)
	{
		this.size= size;
	}
	
void call(long Number)
{
	System.out.println("calling Number "+Number);
}
void music(String song)
{
	System.out.println("playing "+song);
}
void callMusic(long Number,String song)
{
	System.out.println("calling "+Number+(" playing song"));
	
}
void size(int size)
{
	System.out.println("your mobile size is "+this.size+" inch");
}
void color()
{
	System.out.println("my mobile color is: "+color);
}
}
