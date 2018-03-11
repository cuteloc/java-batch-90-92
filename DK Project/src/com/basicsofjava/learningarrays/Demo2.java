package com.basicsofjava.learningarrays;

public class Demo2 {
	public static void main(String[] args) {
		int [][] arr1=new int[3][4];
	
		int arr2[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		
		int i=0;
		int j=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(arr2[i][j]+"    ");
			}
			System.out.println();
		}
		
	}

}
