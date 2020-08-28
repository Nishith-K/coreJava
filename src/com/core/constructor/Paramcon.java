package com.core.constructor;
//Parameterized Constructor
class Constru
{
	private String a;
	private int b;
	private int c;
	Constru()//default constructor
	{
		a="xyz";
		b=30;
		//c=45;
	}
	Constru(String a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Constru(String a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void display()
	{
	
	    System.out.println("Hello name is-->"+a);
		System.out.println("Hello age is-->"+b);
		System.out.println("Hello age is-->"+c);
	}
}
class Paramcon
{
	public static void main(String[] args) 
	{
	Constru c1=new Constru();
	c1.display();
	Constru c2=new Constru();
	c2.display();
	Constru c3=new Constru("san",25);
	c3.display();
	Constru c4=new Constru("Ram",55);
	c4.display();
	Constru c5=new Constru("xxx",58,54);
	c5.display();
	Constru c6=new Constru("ddd",53,44);
	c6.display();
	}
}
//Note: In this program we are able to get different set of values by using parameterized constructor, even the variable are declared as private.