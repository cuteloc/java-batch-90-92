package com.basicsofjava.learningarrays;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr1=new int[6];
		String arr2[]=new String[6];
		arr1[0]=34;
		arr1[1]=214;
		arr1[2]=222;
		arr1[3]=111;
		arr1[4]=121;
		arr1[5]=125;
		arr2[0]="Daksh";
		arr2[1]="Lakakshya";
		arr2[2]="Lucky";
		arr2[3]="Dharmendra";
		arr2[4]="School";
		arr2[5]="Office";
		
		for(int i=0;i<6;i++)
		{
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
		}
		
		System.out.println("Length of array arr1[] is " +arr1.length);
		System.out.println("Length of array arr2[] is " +arr2.length);
		//arrange array in ascending orrder
		Arrays.sort(arr1);
		
		for(int i=0;i<6;i++)
		{
			System.out.println(arr1[i]);
		
		}
	}

}
