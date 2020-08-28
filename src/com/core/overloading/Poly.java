package com.core.overloading;
//Method Overloading
class Sample 
{
	 void add(int a,int b)
	{
		System.out.println("sum of two="+(a+b));
	}
	void add(int a,int b,int c)
	{
		
		System.out.println("sum of three="+(a+b+c));
	}
}
class Poly
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.add(10,20);
		s.add(10,20,30);
	}
}
 