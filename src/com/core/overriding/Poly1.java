package com.core.overriding;
//Method Overriding
class One 
{
	  void calculate(double x)
	{
		System.out.println("Square="+(x*x));
	}
	
}
class Two extends One
{
	void calculate(double x)
	{
		super.calculate(2);
		System.out.println("Square root value"+
			Math.sqrt(x));
	}
}
class Poly1
{
	public static void main(String[] args) 
	{
		
		Two t=new Two();
		t.calculate(25);
		t.calculate(9);
		t.calculate(36);
	}
}
