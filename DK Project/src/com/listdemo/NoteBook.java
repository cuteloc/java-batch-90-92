package com.listdemo;

public class NoteBook {
	double price;
	int pages;
	public NoteBook(double price,int pages)
	{
		super();
		this.price=price;
		this.pages=pages;
				
	}
	@Override
	public String toString() {
		return "NoteBook [price=" + price + ", pages=" + pages + "]";
	}

}
