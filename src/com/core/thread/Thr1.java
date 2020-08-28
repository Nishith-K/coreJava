package com.core.thread;
class Thr1 
{
	public static void main(String[] args) 
	{
		System.out.println("This is first statement");
		Thread t=Thread.currentThread();
		t.setName("Mythread");
		System.out.println(t.isAlive());
		System.out.println("Thread name is");
		System.out.println("current thread="+t);
		}
}
