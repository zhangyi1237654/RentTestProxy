package com.zy.rent;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SeeHouse implements MethodBeforeAdvice{

	

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("¿´·¿");
	}
}
