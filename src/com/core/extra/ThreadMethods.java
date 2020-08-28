package com.core.extra;
public class ThreadMethods 
{
	public static void main(String[] args) 
	{
		Thread t=new Thread();

		System.out.println("Default Thread Name:"+t.getName());
		t.setName("MyThread");
		System.out.println("Given Thread Name:"+t.getName());

		System.out.println("Thread Priority is "+t.getPriority());
		t.setPriority(10);
		System.out.println("Thread Priority is "+t.getPriority());
		System.out.println("Thread is in running state or not:"+t.isAlive());

		System.out.println("Default Thread Group is "+t.getThreadGroup());
		ThreadGroup tg=new ThreadGroup("MyGroup");
		System.out.println("Given Thread Group is "+tg.getName());		
		/*System.out.println("isInterrupted or not "+t.isInterrupted());
		System.out.println("isDaemon() "+t.isDaemon());
		t.setDaemon(true);
		System.out.println("isDaemon() "+t.isDaemon());*/
	}
}