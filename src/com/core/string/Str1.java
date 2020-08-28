package com.core.string;
class Str1 
{
	public static void main(String[] args) 
	{
		String s1="This is java";
		System.out.println("hashcode for s1=-->"+s1.hashCode());
		String s2=new String("I like");
		System.out.println("hashcode for s2=-->"+s2.hashCode());
		char arr[]={'a','p','t','e','c','h'};
		String s3=new String(arr);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("The no. of character in s1 including spaces="+s1.length());
		System.out.println("s1 join with s2 with s3="+s1.concat(s2)+" "+s2.concat(s3));
//		System.out.println(s1+" "+s2+" "+s3);
		boolean x=s1.startsWith("This");
		if(x)
		System.out.println("s1 starts with This");
		else
		System.out.println("s1 does not starts with This");
		String r=s1.toUpperCase();
		String s=s2.toUpperCase();
		String r1=s1.toLowerCase();
		System.out.println("After converting s1="+r);
		System.out.println("After converting s2="+s);
		System.out.println("After converting s1="+r1);
	}
}
