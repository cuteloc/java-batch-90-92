package com.basicsofjava.conditionalstatements;

import java.util.Scanner;

public class Vote {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter your name:");
	String Name=scn.next();
	System.out.println("Enter your age:");
	int age=scn.nextInt();
	if(age>=18)
	{
		System.out.println(Name+(" can vote"));
				
	}
	else 
	{
		System.out.println(Name+(" is younger than 18 years"));
		System.out.println(Name+(" can not vote "));
	}	
}
}