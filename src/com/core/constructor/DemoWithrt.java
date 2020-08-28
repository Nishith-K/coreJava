package com.core.constructor;
//Method with return type
class Withrt 
{
	double d1,d2;
	Withrt(double x,double y)
	{
		d1=x;
		d2=y;
	}
	double sum()
	{
		//double d3=d1+d2;
		//return d3;
		return d1+d2;
	}
}
class DemoWithrt
{
	public static void main(String[] args) 
	{
		Withrt s=new Withrt(10.3,20.5);
		System.out.println("sum="+s.sum());
		Withrt s1=new Withrt(23.5,12.6);
		System.out.println("sum="+s1.sum());
		}
}
