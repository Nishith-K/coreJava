package com.core.controlstatement;
//The return statement is used to explicitly return from a method. That is, it causes program control to transfer back to the caller of the method.

// Demonstrate return.
class Return 
{
public static void main(String args[]) 
{
boolean t = true;
System.out.println("Before the return.");
if(t) return; // return to caller
System.out.println("This won't execute.");
}
}
