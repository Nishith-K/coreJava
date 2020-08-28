package com.core.operators;
class Reverse 
{
	public static void main(String[] args)
	{
		int r=0,rev=0;
		int n=63674;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		System.out.println("The Reverse Number is-->"+rev);
	}
}
