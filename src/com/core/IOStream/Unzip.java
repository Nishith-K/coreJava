package com.core.IOStream;
//Unzip the file contents
import java.io.*;
import java.util.zip.*;
class Unzip
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("File1.zip");
		FileOutputStream fos=new FileOutputStream("File2.doc");
		InflaterInputStream iis=new InflaterInputStream(fis);
		int data;
		while((data=iis.read())!=-1)
		//System.out.println(data);
		fos.write(data);
		//iis.close();
		fos.close();
		iis.close();
	}
}
		