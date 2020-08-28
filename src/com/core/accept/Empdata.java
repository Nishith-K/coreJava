package com.core.accept;
//Accepting Employee data
import java.io.*;
class Empdata
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter sex(M/F)");
		char sex=(char)br.read();
		br.skip(2);
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Id-->"+id);
		System.out.println("Sex-->"+sex);
		System.out.println("Name-->"+name);
	}
}
