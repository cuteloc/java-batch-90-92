package com.basicsofjava.learningarrays;
import java.util.Scanner;


public class ArrayClass {
	public static void main(String[] args)
	{  
	
		Scanner scn=new Scanner(System.in);
		int arr1[]=new int[6];
		int i;
		for(i=0;i<6;i++)
			{
				System.out.println("input integer value");
				arr1[i]=scn.nextInt();
		
			}		
		
		for(i=0;i<6;i++)
		{
			System.out.println(arr1[i]);
		}
	
	}
}



