package com.core.string;
//StringBuffer Example 
import java.io.*;
class Str4 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ser-name");
		String ser=br.readLine();
		System.out.println("Enter middle-name");
		String mid=br.readLine();
		System.out.println("Enter last-name");
		String last=br.readLine();
		StringBuffer sb=new StringBuffer();
		sb.append(ser+" ");
		sb.append(mid+" ");
		sb.append(last);
		System.out.println("Full name="+sb);
		//int n=ser.length();
		//sb.insert(n,last);
		//sb.insert(2,"xxxxx");
		sb.append(mid);
		System.out.println("After modified="+sb);
		//System.out.println("In Reverse="+sb.reverse());
	}
}
