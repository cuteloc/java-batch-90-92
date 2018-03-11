package com.learningInterface;

public interface Demo1 {
	int a=90;
	// above is same as public static final int a=90; All the variables/members in Interface is  
	// public static final so you can skip 
	void test();
	//above is same as abstract void test();
	void test1();
	void test2();
	static void disp()
	{
		System.out.println("Inside Disp in Demo1");
		
	}
	

}
