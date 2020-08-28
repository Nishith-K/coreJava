package com.core.string;
//1) charAt():-- The charAt() method returns the character value at the specified index.

//2) deleteCharAt():-- The deleteCharAt() method deletes the character value at the specified position.

//3) delete():- Deletes the characters within a specified range in a StringBuffer object and returns the new StringBuffer object.

/*4) getChars():-- The getChars() method copies specified number of character into an array.
syntax:
void getChars(int begin,int end, char[] destArray,int destArrayBegin)*/

//5) length():-- The length() method returns the total number of characters from the StringBuffer object.

//6) replace():-- The replace() method replaces characters from the StringBuffer object with new characters.

//7) setCharAt():-- The setCharAt() method replaces a character from the StringBuffer object with a new character at the specified index.

//8) setLength():-- The setLength() method sets the length of the StringBuffer to a new value.

//9) capacity():-- The capacity() method returns the current capacity of the StringBuffer object. The capacity is the amount of storage available for newly inserted characters, beyond which an allocation will occur. 

//10) substring():-- The substring() method creates a new string from the stringBuffer object.

//11) ensureCapacity():-Ensures that the capacity of the buffer is at least equal to the specified minimum.
                       //If the current capacity of this string buffer is less than the argument, then a new internal buffer is allocated with greater capacity. The new capacity is the larger of:
  //minimumCapacity .
  //Twice the old capacity, plus 2.


 //12) append():- The append() method concatenates the string representation of any other type of data to the end of the invoking StringBuffer object.
 
 //13) insert():- The insert() method inserts the data in the string buffer in any positions.

//14) reverse():- The reverse() method reverse the StringBuffer Object



class StringBufferMethod 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Aptech Global Learning Solutions");
		StringBuffer sb1=new StringBuffer("Aptech Global Learning Solutions");
		System.out.println(sb.charAt(7));//G
		System.out.println(sb.deleteCharAt(5));
		//Aptec Global Learning Solutions
		char[] array=new char[10];
		sb1.getChars(0,6,array,0);
		System.out.println(array);//Aptech
		System.out.println(sb1.length());//32
		System.out.println(sb1.replace(23,32,"Services"));
		//Aptech global Learning Services
		sb1.setCharAt(7,'g');
		System.out.println(sb1);
		//Aptech global Learning Services
		//sb1.setLength(35);
		System.out.println(sb1);
		//Aptech global Learning Services
		sb1.setLength(13);
		System.out.println(sb1);
		//Aptech global 
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity());//16
		System.out.println(sb1.capacity());//48
	    //capacity=length+16
        String str;
		str=sb1.substring(7);
		System.out.println(str);//global Learning Services
		str=sb1.substring(7,13);
		System.out.println(str);//global
      	}
}
