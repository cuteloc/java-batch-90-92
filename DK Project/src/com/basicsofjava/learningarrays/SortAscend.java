package com.basicsofjava.learningarrays;

public class SortAscend {
	public static void main(String[] args) {
		
		int[] a1= {90,80,45,100,2,4};
		int x;
		for(int j=0;j<a1.length-1;j++)
		{
			for(int i=0;i<a1.length-1;i++)
			{
				if(a1[i]>a1[i+1])
						{
					x=a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=x;
					
						}
			}
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}

}
