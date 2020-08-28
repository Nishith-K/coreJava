package com.core.array;
//One diamansional array example
import java.io.*;
class Arr1 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many subjects");
		int n=Integer.parseInt(br.readLine());
		int marks[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Marks");
			marks[i]=Integer.parseInt(br.readLine());
		}
		int tot=0;
		System.out.println("The marks are");
		for(int i=0;i<n;i++)
		{
		System.out.println(marks[i]);
		tot=tot+marks[i];
		}
		System.out.println("Total Marks="+tot);
		float avg=(float)tot/n;
		//int avg=tot/n;
		System.out.println("Average is " +avg);
		System.out.println("The length of array="+marks.length);
	}
}
