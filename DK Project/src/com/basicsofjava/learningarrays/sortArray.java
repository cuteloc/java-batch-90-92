package com.basicsofjava.learningarrays;
import java.util.Scanner;
public class sortArray {
	public static void main(String[] args) {
	
		int a1[]=new int [6];
		Scanner scn1=new Scanner(System.in);
	
		for(int i=0;i<6;i++)
			{
				System.out.println("Enter array element "+i +" :");
				a1[i]=scn1.nextInt();
			}
	
		System.out.println("=============Before sorting=======");
		
		for(int i=0;i<6;i++)
		{
			System.out.print(a1[i]+"  ");
			
		}
		
				
		for(int i=0;i<6;i++)
		{
			int temp1=a1[i];
			for(int j=i;j<6;j++)
			{
				if(a1[j]<temp1)
				{
					a1[i]=a1[j];
					a1[j]=temp1;
					temp1=a1[i];
				}
			}
						
		}
		
		System.out.println();
		System.out.println("=============After sorting=======");
		
		for(int i=0;i<6;i++)
		{
			System.out.print(a1[i]+"  ");
			
		}
	}
}
