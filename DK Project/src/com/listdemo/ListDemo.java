package com.listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(new Pen("Red"));
		l1.add(new NoteBook(34,87));
		l1.add(new Student("Abc",123));
		
		/*for(int i=0;i<3;i++)
		{
			System.out.println(l1.get(i));
		}*/
		
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
