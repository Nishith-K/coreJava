package com.core.Interface;
//An Interface can extends more than one interface,but one interface can't implements another interface

interface First
{
	void disp1();
}
interface Second 
{
	void disp2();
}
interface Third extends First,Second
{
	void disp3();
}
class Test implements Third
{
	public void disp3()
	{
		System.out.println("disp3()");
	}
	public void disp1()
	{
		System.out.println("disp1()");
	}
	public void disp2()
	{
		System.out.println("disp2()");
	}
}
class Inter1
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.disp1();
		t.disp2();
		t.disp3();
		//System.out.println("Hello World!");
	}
}
