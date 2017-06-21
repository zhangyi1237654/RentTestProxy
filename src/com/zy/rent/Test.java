package com.zy.rent;

public class Test {

	public static void main(String[] args) {

		Host host = new Host();
		InvocationHandler ih = new InvocationHandler();
		ih.setRent(host);
		Rent rent = (Rent) ih.getProxy();
		rent.rent(" ");
	}

}
