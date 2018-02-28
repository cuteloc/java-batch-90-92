package com.basicsofjava.learningblocks;
import java.util.Scanner;
public class Demo1 {
	
	static int a;
	int b;
	static
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a value: ");
		a=scn.nextInt();
		System.out.println("inside static block1");
	}
	
	Demo1()
	{
		System.out.println("Inside constructor");
	}
	
	{
		System.out.println("inside non-static block1");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter b value: ");
		b=scn.nextInt();
				
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		System.out.println("a value is: "+a);
		Demo1 D1=new Demo1();
		System.out.println("Main Ended");
	}
	
	static
	{
		System.out.println("inside static block2");
	}

}
