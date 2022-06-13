package org.jsp.BasicsAbstracs;

public class MainOfClass 
{
	public static void main(String[] args) 
	{
		C c = new C();
		
		System.out.println("x ="+c.x);
		System.out.println("y ="+c.y);
		System.out.println("z ="+c.z);
		
		c.print();
		c.print(100);
		c.disp();
	}


}
