package com.core.Inheritance;
//Example of Inheritance(using setters and getters methods)
class Teacher 
{
	int id;
	String name,addr;
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setAddr(String addr)
	{
		this.addr=addr;
	}
	String getAddr()
	{
		return addr;
	}
}

class Student extends Teacher
{
	int marks;
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	int getMarks()
	{
		return marks;
	}
}

class Inherit
{
	public static void main(String[] args) 
	{
		Student st=new Student();
		st.setId(1);
		st.setName("xxx");
		st.setAddr("131-22,P&T colony,DSNR");
		st.setMarks(598);
		System.out.println("ID="+st.getId());
		System.out.println("NAME="+st.getName());
		System.out.println("ADDRESS="+st.getAddr());
		System.out.println("MARKS="+st.getMarks());
	}
}
