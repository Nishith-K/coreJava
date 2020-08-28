package com.core.IOStream;
//Using Writer create and pass the data into the file
import java.io.*;
class Create2
{
	public static void main(String[] args) throws IOException
	{
		String str="This is an Institute I am a student";
		FileWriter fw=new FileWriter("textfile.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0;i<str.length();i++)
		bw.write(str.charAt(i));
		bw.close();
	}
}
