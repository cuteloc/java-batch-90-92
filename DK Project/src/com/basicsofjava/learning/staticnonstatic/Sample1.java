package com.basicsofjava.learning.staticnonstatic;

public class Sample1 {
	int a=200;
	static int b=300;
	
	void test(int i)
	{
		int x=1-0;
		int y=i+x;
		System.out.println(y);
	}
	
	static void disp(int j)
	{
		int k=20+40;
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		System.out.println("b value is " +b);
	}

}
