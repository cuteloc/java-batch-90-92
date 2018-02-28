package com.basicsofjava.learningmethods;

public class Addition {
	public static int addTwoNum(int x,int y)
	{
		int a=x;
		int b=y;
		int sum=a+b;
		return sum;
	}
	static void areaOfTheCircle(double r)
	{
		double area=3.14*r*r;
		System.out.println(" Area of circle with radius "+r +" is " +area);
	}

	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println("Sum of a and b is " + addTwoNum(a,b));
		areaOfTheCircle(3.5);

	}

}
