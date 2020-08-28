package com.core.controlstatement;
//When a break statement is encountered inside a loop, the loop is terminated and program control resumes at the next statement following the loop.

// Using break to exit a loop.
class BreakLoop
{
public static void main(String args[]) 
{
for(int i=0; i<=100; i++)
{
//if(i == 10) break; // terminate loop if i is 10//0 to 9
//if(i == 10) continue; //0 to100 except 10 
if((i%2 == 0)) continue; 
System.out.println("i: " + i);
}
//System.out.println("i: " + i);
System.out.println("Loop complete.");
}
}
