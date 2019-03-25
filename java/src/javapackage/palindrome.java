package javapackage;

import java.util.Scanner;

public class palindrome {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int length = str.length();
	int start = 0;
	int count = 0;
	
	for(int i =length-1; i>=(length/2)-1; i--) {
	
		if(str.charAt(start)==str.charAt(i)){
		
			start = start+1;
			count = 1;
		}
		else
		{
			count = 0;
			break;
		}
	}
	
	if (count ==0) {
		System.out.println("not a palindrome");
	} else
		System.out.println("PalinDrome");
	}
}
