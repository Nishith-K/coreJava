package com.core.Inheritance;
//Multilavel Inheritance
class Superclass
{
	void disp()
	{
		System.out.println("This is super class");
	}
}
class Subclass1 extends Superclass
{
	void disp1()
	{
		System.out.println("This is sub class1");
	}
}
class Subclass2 extends Subclass1
{
	void disp2()
	{
		System.out.println("This is sub class2");
	}
}
class  Mullevel
{
	public static void main(String[] args) 
	{
		Subclass2 dd=new Subclass2();
		dd.disp();
		dd.disp1();
		dd.disp2();
	
	}
}
