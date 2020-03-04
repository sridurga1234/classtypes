package com.innerclass;
import com.innerclass.Outer.Inner;
public class Outer {
	static int x = 100;
	
	
	
	static class Inner{
		int y = 200;
		void show()
		{
			System.out.println(x+" "+y);
		}
	}
	
	public static void main(String args[])
	{
		Outer.Inner outer = new Outer.Inner();
		outer.show();
	}

}
