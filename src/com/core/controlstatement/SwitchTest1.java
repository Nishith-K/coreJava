package com.core.controlstatement;
class SwitchTest1 
{
	public static void main(String[] args) 
	{
		char color='2';
		int a=10,b=20;
		switch(color)
		{
		case '1':System.out.println(a+b);
		break;
		case '2':System.out.println(a-b);
		break;
		case '3':System.out.println(a*b);
		break;
		case '4':System.out.println(a/b);
		break;
		case '5':System.out.println(a%b);
		break;
		default:System.out.println("No condition");
	}
}
}
