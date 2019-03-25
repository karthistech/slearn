package javapackage;

public class removespace1 {
	
	String str = "This is Testing";
int index = -1;
	String removesp() {
		char str1[] = str.toCharArray();
		
		System.out.println(str1);
	do 
	{
		System.out.println(str.indexOf(" ",index+1));
		int a = str.indexOf(" ",index+1);
		for (int i = a; i< str.length()-1;i++)
		{
			str1[i] = str1[i+1];
		}
		index = a;
	}
	while(str.indexOf(" ",index)>=0);
	return str1.toString();
	
	}
			
public static void main(String args[]) {
	removespace1 sp = new removespace1();
	System.out.println(sp.removesp());
}
	
}
