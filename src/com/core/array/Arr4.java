package com.core.array;
//Two diamensional character array example
class Arr4
{
	public static void main(String[] args) 
	{
		char x[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		System.out.println("In Matrix Form:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
				System.out.println();
	}
}
}
