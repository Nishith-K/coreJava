package com.core.applet;
//passing value from HTML to applet
import java.awt.*;
import java.applet.Applet;
public class MyApplet3 extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Font f=new Font("Ariel",Font.BOLD,24);
	String msg;
	public void paint(Graphics g)
	{
	g.setFont(f);
	g.setColor(Color.blue);
	g.drawString(msg,10,50);
	}
	public void init()
	{
		msg=getParameter("para");
		if(msg==null)
		msg="Null value returned";
	}
}