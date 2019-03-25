package javapackage;

import java.util.Arrays;

public class arrayequals {

	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int a1[] = {1,2,3,4,5};
		
		String str = Arrays.toString(a);
		String str1 = Arrays.toString(a1);
		
		if (str ==str1)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
			
		}
	}
}
