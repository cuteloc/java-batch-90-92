package com.listdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo1 {
	public static void main(String[] args) {
		//LinkedList l2=new LinkedList();
		PriorityQueue l2=new PriorityQueue<>();
		
		l2.add("Saritha");
		l2.add("Lucky");
		l2.add("Vivienne");
		l2.add("Meenakshi");
		l2.add("Neelima");
		l2.add("Rekha");
		l2.add("Supraja");
		
		
		//for(int i=0;i<l2.size();i++)
		//{
		//	System.out.println(l2.get(i));
		//}
		
		System.out.println("Size of the collection is "+l2.size());
		Object o1=l2.poll();
		
		/*while(o1!=null)
		{
			System.out.println(o1);
			o1=l2.poll();
		}*/
		
		Iterator it=l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
			
		
	}

}
