package com.basicsofjava.learningobjectclass;

public class MobileClass {
	public static void main(String[] args) {
		System.out.println("Welcome to OurMobileCompany");
		Mobile myMobv1 =new Mobile(5.8,"SILVER");
		myMobv1.call(2134359999);
		myMobv1.music("shape of you");
		myMobv1.callMusic(122323, "Shape of you");
		myMobv1.color();
		myMobv1.call(65656656);
		System.out.println(Mobile.os);
		System.out.println(myMobv1.size);
		Mobile.Os();
	}

}
