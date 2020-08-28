package com.core.Inheritance;
class OneDemo 
{
	OneDemo()
	{
	System.out.println("OneDemo in super class!");
	}
}
class TwoDemo extends OneDemo
{
	
	TwoDemo()
	{
	System.out.println("TwoDemo in sub class");
	}
}
class TDemo extends TwoDemo
{
	
	TDemo()
	{
	System.out.println("TDemo in sub class");
	}
}
class InheritDemo
{
	public static void main(String[] args) 
	{
//		TDemo t=new TDemo();
	}
}
