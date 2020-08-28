package com.core.thread;
//creating and running a thread using extends Thread
import java.io.*;
class Tdemo extends Thread 
{
		
		public void run()
		{
			for(int i=0;i<10;i++)
			{
			System.out.println(i);
			try
				{
				Thread.sleep(1000);//1000ms=1s
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			
			}
		}
}
class Thr2
{
	public static void main(String args[])throws IOException
	{
		Tdemo obj=new Tdemo();
		Thread t=new Thread(obj);
		t.start();
		
	}
}
