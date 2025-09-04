package com.tcf.encapsulation;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);;
		c1.setName("Kaviya");
		c1.setCity("Pondy");
		System.out.println(c1);
		//object printing invoke toString()
		
		Customer c2=new Customer();
		System.out.println(c2);
		Customer c3=new Customer();
		System.out.println(c3);
	}

}
