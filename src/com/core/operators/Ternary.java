package com.core.operators;
//Ternary operator
class Ternary
{
public static void main(String args[]) {
int i = 20;
int j = 55;
int z = 0;
//z = i < j ? i : j; // ternary operator(output is 20)
z = i > j ? i : j; // ternary operator(output is 55)
System.out.println("The value assigned is " + z);
}
}
