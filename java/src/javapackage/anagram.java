package javapackage;

import java.util.Arrays;

public class anagram {
	
	public static void main(String[] args) {
		String args1 = "MotherInLaw";
		String args2 = "Hitler woman";
		args1 = args1.replaceAll(" ", "");
		args2 = args2.replaceAll(" ", "");
		char[] array = args1.toLowerCase().toCharArray();
		char[] array1 = args2.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array);
		System.out.println(array);
		System.out.println(array1);
		if (Arrays.equals(array,array1))
		{
			System.out.println("Equal");
		}
	}
	
}
