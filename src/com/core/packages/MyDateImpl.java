package com.core.packages;
import java.util.Date;
public class MyDateImpl implements MyDate
{
	public void showDate()
	{
		Date d=new Date();
		System.out.println(d);
	}
}