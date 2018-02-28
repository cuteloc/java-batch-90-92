package com.basicsofjava.isarelationship;

public class MainClasss2 {
	public static void main(String[] args) {
		
		Dog d1=new Dog();
		d1.run();
		System.out.println("Value of eyes in Dog class is :"+d1.eyes);
		
		Human h1=new Human();
		h1.run();
		
		Animal a1=new Animal();
		System.out.println("valye of eyes in Animal class is : "+a1.eyes);
		
		Cat c1=new Cat();
		c1.run();
				
	}

}
