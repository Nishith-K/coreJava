package com.core.prepost;
class PrePost 
{
	public static void main(String[] args) 
	{
		int x=3;
		//System.out.println(++x*x++*x++);//4*4*5=80
		System.out.println(++x*x++*++x);//4*4*6=96
		System.out.println(x);//6
	}
}
