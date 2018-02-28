package com.basicsofjava.isarelationship;

public class MainClass {
	public static void main(String[] args) {

		//Demo2 will Demo1 property also
		Demo2 d2=new Demo2();
		d2.disp();
		System.out.println("a value is :"+d2.a);
		d2.m();
		d2.test();
		
		d2.music("Song Song ");
		d2.call(11223454);
		d2.charging();
	}

}
