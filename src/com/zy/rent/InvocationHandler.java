package com.zy.rent;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHandler implements java.lang.reflect.InvocationHandler {

	private Rent rent;
	
	public void setRent(Rent rent) {
		this.rent = rent;
	}
	
	public Object getProxy(){
		
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		seeHouse();
		Object result = method.invoke(rent, "出租");
		fare();
		return result;
	}
	private void seeHouse(){
		System.out.println("看房");
	}
	private void fare(){
		System.out.println("收费");
	}

}
