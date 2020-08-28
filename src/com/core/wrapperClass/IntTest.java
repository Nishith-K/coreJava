package com.core.wrapperClass;
import java.io.*;
class IntTest 
{
	public static void main(String[] args) throws IOException
	{
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number");
			String str=br.readLine();
			int n=Integer.parseInt(str);
			System.out.println("In decimal-->"+n);
			str=Integer.toBinaryString(n);
			System.out.println("In binary-->"+str);
			str=Integer.toHexString(n);
			System.out.println("In hexadecimal-->"+str);
			str=Integer.toOctalString(n);
			System.out.println("In octal-->"+str);
	}
}
