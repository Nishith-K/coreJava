package com.core.Interface;
//class inside interface
interface Outer
{
	void disp();
	class Inner
	{
		void test()
		{
			System.out.println("Inner");
		}
	}
}
class  Main implements Outer
{
	public void disp()
	{
		System.out.println("disp");
	}
}
class Inter2
{

	public static void main(String[] args) 
	{
		Main m=new Main();
		m.disp();
		Outer.Inner i=new Outer.Inner();
		i.test();
		System.out.println("Hello World!");
	}
}
