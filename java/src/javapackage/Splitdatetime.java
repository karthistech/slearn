package javapackage;

public class Splitdatetime {
	
	static String str = "12-Mon-2019-13-mon-mnbhgfc";
	public static void main(String args[])
	{
	int lindex = -1;
	String s1 = "";
	int findex = 0;
	int trigger = 0;
	do
	{
		if (str.indexOf('-',lindex+1)>=0)
		{
		findex = lindex+1;
		lindex = str.indexOf('-',lindex+1);
		}else
		{
			findex = lindex+1;
			lindex = str.length();
			trigger = 1;
		}
		for(int i = findex;i<lindex;i++)
		{
		         s1 = s1+str.charAt(i);
		}	
		
	}while(trigger == 0);
	
	System.out.println(s1);
	}}

