package com.core.accept;
//Accepting data from keyboard
import java.io.*;
class Input 
{
	public static void main(String[] args) throws Exception
	{
		/*InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);*/

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("Enter a value");
		String ch1=br.readLine();
		char ch=(char)br.read();
		//int ch1=Integer.parseInt(br.readLine());
		//float ch1=Float.parseFloat(ch);
		//double ch1=Double.parseDouble(ch);
		System.out.println("You have entered-->"+ch1);
		System.out.println("You have entered-->"+ch);
		
	}
}
