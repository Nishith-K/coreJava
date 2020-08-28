package com.core.wrapperClass;
import java.io.*;
class ByteTest
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first byte no.");
		String s1=br.readLine();
		Byte b1=new Byte(s1);
		System.out.println("Enter second byte no.");
		String s2=br.readLine();
		Byte b2=new Byte(s2);
		int n=b1.compareTo(b2);
		System.out.println("CompareTo() methods return the difference between two no="+n);
		if(n==0)
		System.out.println("Both are equal");
		else if(n>0)
		System.out.println("b1 is bigger="+b1);
		else
		System.out.println("b1 is smaller="+b1);
	}
}