package com.core.exception;
//throw example
class Exce2
{
	static void demo()
	{
		try
		{
			throw new NullPointerException("Mydata");
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
	}
	public static void main(String[] args) 
	{
		Exce2.demo();
		//demo();
	}
}
