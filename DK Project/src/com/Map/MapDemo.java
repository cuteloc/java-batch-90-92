package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.listdemo.NoteBook;
import com.listdemo.Pen;
import com.listdemo.Student;

public class MapDemo {
	public static void main(String[] args) {
		HashMap m1=new HashMap();
		
		m1.put("java", new Student("Xyz",2324));
		m1.put(12, new Pen("Green"));
		m1.put(3.4, new NoteBook(23,234));
		
		System.out.println(m1.get(12));
		System.out.println(m1.get(3.4));
		System.out.println(m1.get("java"));
		
		Set keys= m1.keySet();
		
		Iterator it=keys.iterator();
		while(it.hasNext())
		{
			System.out.println(m1.get(it.next()));
		}
	}

}
