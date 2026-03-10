package com.nk.ly;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------->Get flowers through iterator");
		IContainer icontainer=new FlowerContainer();
		IIterator iiterator=icontainer.createIterator();
		if(iiterator.hasNext()) {
			Object object=iiterator.next();
			System.out.println(object);
		}
	}
}
