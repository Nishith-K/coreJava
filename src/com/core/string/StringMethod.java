package com.core.string;
//1) codePointAt():-- The codePointAt() method returns the character(Unicode code point) at the specified index. 

//2) codePointBefore():-- The codePointBefore() method returns the character(Unicode code point) before the specified index. 

//3) codePointCount():-- The codePointCount() method returns the number of Unicode code points between two indices in the String.

//4) startsWith():-- The startsWith() method returns a boolean value to test whether the string starts with a specified prefix.

//5) endsWith():-- The endsWith() method returns a boolean value to test whether the string ends with a specified sufix.

//6) toUpperCase():--The toUpperCase() method converts the characters in the string to upper case.

//7) toLowerCase():--The toLowerCase() method converts the characters in the string to lower case.

//8) valueOf():--The valueOf() method returns the string representation of the specified argument.The argument can have any one of the values:boolean, char, float, double, int, long etc.

//9) toCharArray():-- The toCharArray() method copies the content of the String to a new character array.

//10) equalsIgnoreCase():-- The equalsIgnoreCase() method compares two strings, ignoring case and returns a boolean value. If the strings are equal the method returns a true value, otherwise false.

class  StringMethod
{
	public static void main(String[] args) 
	{
		String str="Cmtes Global Learning Solutions";
		String str1="CMTES GLOBAL LEARNING SOLUTIONS";
		char[] array={'C','m','t','e','s','G','l','o','b','a','l'};
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(1));
		System.out.println(str.codePointCount(0,5));
		System.out.println(str.startsWith("Cmt"));
		System.out.println(str.endsWith("tions"));
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		System.out.println(String.valueOf(array));
		
		System.out.println(String.valueOf(array,7,6));
		
		char[] array1;
		array1=str.toCharArray();
		System.out.println(String.valueOf(array1));
		
		System.out.println(str.equalsIgnoreCase(str1)); 
		System.out.println(str.equals(str1)); 
	}
}
