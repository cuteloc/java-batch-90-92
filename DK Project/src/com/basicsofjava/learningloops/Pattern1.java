package com.basicsofjava.learningloops;

public class Pattern1 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
				
			}
			for(int l=3;l>=i;l--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
