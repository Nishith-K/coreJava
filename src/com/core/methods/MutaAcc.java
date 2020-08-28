package com.core.methods;
//Accesor and Mutator method
class Person
{
	String name;
	int age;
	char sex;
	Person(String name,int age,char sex)
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	//Accesor Method
	void display()
	{
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
		System.out.println("Sex-->"+sex);
	}
	//Mutator Method
	Person modify(Person obj)
	{
		obj.name="yyy";
		--obj.age;
		obj.sex='F';
		return obj;
	}
}
class MutaAcc
{
	public static void main(String[] args) 
	{
		Person p=new Person("xxx",36,'M');
		p.display();
		Person p1=p.modify(p);
		//Here we are not creating an object to p1. Here p1 is a reference variable.
		p1.display();
		p.display();
		Person p2=new Person("sai",22,'M');
		p2.display();
		}
}
