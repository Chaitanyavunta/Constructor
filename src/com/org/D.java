package com.org;

public class D extends C{ 
	
	public D() { 
		
		this(25);
		  
		System.out.println("parent const..."); 
	  } 
	 
	public D(int id) { 
		this("chaiay");
	
	    System.out.println(id); 
	  } 
	
	public D(String name) { 
		super();
	
	    System.out.println(name); 
	  } 
	
	public static void main(String[] args) { 
	    D d = new D(); 
	  } 
	 
	 
	} 