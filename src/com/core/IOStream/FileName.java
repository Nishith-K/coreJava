package com.core.IOStream;
//Accept file name from keyboard and display the content
import java.io.*;
class FileName
{
	public static void main(String[] args) 
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name");
		String fname=br.readLine();
		FileInputStream ss=new FileInputStream(fname);
		BufferedInputStream bin=new BufferedInputStream(ss);
		int ch;
		while((ch=bin.read())!=-1)
		System.out.print((char)ch);
		bin.close();
	}
	catch(Exception fe)
	{
		System.out.println("File not found"+fe);
	}
}
}