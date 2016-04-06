package com.zuchepad.services;

public class sub  extends Base{
	static
	{
		System.out.println("子类静态代码块");
		
	}
	
	
	private static  int sa=100;
    public int a=100;
	
	public sub(){
		
		System.out.println(super.ss);
		System.out.println("sa"+sa);
		System.out.println("a"+a);
	
	}

}
