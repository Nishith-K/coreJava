package com.core.IOStream;
//Without using type command Reading data from file
import java.io.*;
class Read
{
	public static void main(String[] args) throws IOException
	{
		//FileInputStream fis=new FileInputStream("MyFile.txt");

FileInputStream fis=new FileInputStream("Read.java");
		BufferedInputStream bin=new BufferedInputStream(fis);
		int ch;
		while((ch=bin.read())!=-1)
		System.out.print((char)ch);
		bin.close();
	}
}
