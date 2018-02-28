package com.basicsofjava.learningloops;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int i=153;
		int temp=i;
		int count=0;
		int rem;
		int sum=0;
		
		//count number of digits in i
		while(temp!=0)	
		{
			temp=temp / 10;
			count=count+1;			
		}
		System.out.println("number of digits in " + i + " is " +count);
		
		// check if number is ArmstrongNumber
		temp=i;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+power(count, rem);
			temp=temp/10;
		}
		if(sum==i)
		{
			System.out.println(i +" is an Armstrong number");
		}
		else
		{
			System.out.println(i + " is not an Armstrong number");
		}
		System.out.println(power(3, 4));
	}
	
	static int power(int digits, int rem2)
	{
		int result=1;
		for (int count1=1; count1<=digits; count1++)
		{
			result=result*rem2;
		}
		return result;
	}

}

