package com.core.abstractclass;
 abstract class Car 
{
	int regno;
	Car(int regno)
	{
		this.regno=regno;
	}
	void fillTank()//concrete method
	{
		System.out.println("Fill Tank");
	}
	abstract void steering(int direction);
	abstract void breaking(int force);
}
class Maruti extends Car
{
	
	Maruti(int regno)
	{
		super(regno);
	}
	void steering(int direction)
	{
		System.out.println("Regno of Maruti="+regno);
		System.out.println("Maruti uses manual steering="+direction);
		System.out.println("please drive the maruti car");
	}
	void breaking(int force)
	{
		System.out.println("Breaking of Maruti="+force);
		System.out.println("Maruti uses hydralic breaks");
		System.out.println("Apply breaks stop the car");
	}
}
class Santro extends Car
{
	Santro(int regno)
	{
		super(regno);
	}
	void steering(int direction)
	{
		System.out.println("Regno of Santro="+regno);
		System.out.println("Santro uses manual steering="+direction);
		System.out.println("please drive the Santro car");
	}
	void breaking(int force)
	{
		System.out.println("Breaking of Santro="+force);
		System.out.println("Santro uses hydralic breaks");
		System.out.println("Apply breaks stop the car");
	}
}
class AbstractDemo
{
	public static void main(String[] args) 
	{
		Maruti m=new Maruti(6666);
		Santro s=new Santro(9999);
		Car c,c1;
		c=m;
		c1=s;
		c.fillTank();
		c.steering(2);
		c.breaking(200);

		c1.fillTank();
		c1.steering(2);
		c1.breaking(200);
	}
}
