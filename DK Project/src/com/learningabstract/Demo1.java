package com.learningabstract;

public abstract class Demo1 {
	//method without body is known is abstract method
	abstract void test();
	
	//method with body is known is concrete method
	void disp()
	{
		System.out.println("Inside disp()");
	}
	
	abstract int m(int a);

}
