package com.core.applet;
//Draw graphics
import java.awt.*;
import java.applet.*;

/*<html>
<head>
<title>My page</title>
</head>
<body bgcolor=blue>
<p>
<applet code="MyApplet4.class" width=400 height=100>
</applet>
</body>
</html>
*/
public class MyApplet4 extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
	Font f=new Font("Courier",Font.BOLD,16);
	Color c=new Color(200,235,255);
	g.drawLine(10,1,10,60);
	g.drawLine(20,1,60,10);
	g.drawRect(10,10,50,50);
	g.setFont(f);
	g.setColor(c);
	g.drawString("Have a nice Day!",110,50);
}
}