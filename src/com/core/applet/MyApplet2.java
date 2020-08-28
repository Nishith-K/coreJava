package com.core.applet;
//Insert image into Applet
import java.applet.*;
import java.awt.*;
/*<applet code="MyApplet2.class" width=400 height=300>
</applet>*/
public class MyApplet2 extends Applet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init()
	{}
	public void paint(Graphics g)
	{

		Image i=getImage(getDocumentBase(),"OBJECT.gif");
		//move image from left to right
		for(int x=0;x<100;x++)
		{
			g.drawImage(i,x,50,this);
		}
		//make time delay
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException IE)
		{}
		}
}
