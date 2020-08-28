package com.core.array;
//In java,a multi-diamensional array is an array whose components are themselves arrays.
class CharMultiArray 
{
	public static void main(String[] args) 
	{
		char ch[][]={{'A','B','C','D'},{'E','F','G','H'}};
		String str[][]={{"John","Andrews","David","Scott"},{"-Manager","-CEO"}};
		System.out.println(ch[1][1]);
		System.out.println(ch.length);
		System.out.println(str[0][0]+str[1][0]);
		System.out.println(str[0][2]+str[1][1]);
       	System.out.println(str.length);
	}
}
