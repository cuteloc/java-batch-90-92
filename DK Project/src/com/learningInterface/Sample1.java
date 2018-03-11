package com.learningInterface;

public class Sample1 extends Sample2 implements Demo1,Demo2{

	@Override
	public void test() {
		System.out.println("Test Method in Sample1");
		
	}

	@Override
	public void test1() {
		System.out.println("Test1 Method in Sample1");
		
	}

	@Override
	public void test2() {
		System.out.println("Test2 Method in Sample1");
		
	}

}
