package com.zuchepad.services;

public class Base {
	
	static
	{
		System.out.println("父类静态代码块");
		
	}
     
	protected  int ss=900;
	
     public Base(){
	
    	System.out.println(((sub)this).a);
	  
    }
	

}
