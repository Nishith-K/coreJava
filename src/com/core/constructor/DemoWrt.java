package com.core.constructor;
//Method without return type
class Wrt 
{
	double d1,d2;
	Wrt(double x,double y)//Parameterized constructor
	{
		d1=x;
		d2=y;
	}
	void sum()
	{
		double d3=d1+d2;
		System.out.println("sum="+d3);
	}
}
class DemoWrt
{
	public static void main(String[] args) 
	{
		Wrt s=new Wrt(10.3,20.5);
		s.sum();
		Wrt s1=new Wrt(10.4566,20.55556);
		s1.sum();
	}
}
