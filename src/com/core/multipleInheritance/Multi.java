package com.core.multipleInheritance;
//Multiple inheritance by using multiple interface
interface Father
{
	int PROP1=50000;
	float HT1=6.2F;
}
interface Mother
{
	int PROP2=20000;
	float HT2=5.4F;
}
class Child implements Father,Mother
{
	void property()
	{
		System.out.println("Child property="+(PROP1+PROP2));
	}
	void height()
	{
		System.out.println("Child height="+(HT1+HT2)/2);
	}
}
class Multi 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.property();
		c.height();
	}
}
