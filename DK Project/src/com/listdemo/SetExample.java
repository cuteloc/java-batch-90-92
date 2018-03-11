package com.listdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet s1=new HashSet<>();
		//TreeSet s1=new TreeSet();
		
		s1.add("Saritha");
		s1.add("Lucky");
		s1.add("Vivienne");
		s1.add("Meenakshi");
		s1.add("Neelima");
		s1.add("Rekha");
		s1.add("Supraja");
		
		//for-each loop
/*		for(Object o1:s1) {
			System.out.println(o1);
		}*/
		
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
