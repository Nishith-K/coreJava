package com.core.IOStream.serialization;
import java.io.*;
public class Ser3
{
	public static void main(String[] args) throws Exception
	{
		Ctwo2 o=new Ctwo2(10,20.22f,"xxx");
		o.print();
		FileOutputStream fos=new FileOutputStream("TestSer2");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(o);
		FileInputStream fis=new FileInputStream("TestSer2");
		ObjectInputStream ois=new ObjectInputStream(fis);
		o=(Ctwo2)ois.readObject();
		System.out.println(Ctwo2.a);
		System.out.println(o.b);
		System.out.println(o.c);
		ois.close();
		oos.close();
	}
}
