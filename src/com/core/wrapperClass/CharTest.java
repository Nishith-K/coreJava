package com.core.wrapperClass;
//Character Test
import java.io.*;
class CharTest
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter a character");
		char ch=(char)br.read();
		if(Character.isDigit(ch))
		System.out.println("It is a Digit");
		else if(Character.isUpperCase(ch))
		System.out.println("It is capital");
		else if(Character.isLowerCase(ch))
		System.out.println("It is small");
		else if(Character.isSpaceChar(ch))
		System.out.println("It is coming from spacebar");
		else if(Character.isWhitespace(ch))
		System.out.println("It is coming from enter,tab");
		else
		System.out.println("Sorry I donot know that character");
			}
}
