package com.core.string;
class Str2 
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		System.out.println("hashcode for s1=-->"+s1.hashCode());
		String s2="Hello";
		System.out.println("hashcode for s2=-->"+s2.hashCode());
		//if(s1==s2)
		if(s1.equals(s2))
		System.out.println("Both are equals");
		else
		System.out.println("Both are not equals");
	}
}
