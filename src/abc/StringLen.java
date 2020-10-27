package abc;

import java.util.Scanner;

public class StringLen {
	public static void main(String args[])
	 {
	 int i=0;
	 String str;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string");
	 str=sc.nextLine();
	 char ch[]=str.toCharArray();
	 
	/* for(int r=ch.length-1;r>=0;r--)
	 {
		System.out.print(ch[r]); 
	 }*/
	 for(char c : ch)
	 {
		 if(c==' ')
			 continue;
	 i++; 
	     }
	        	System.out.println("Length of the string = "+i);
	        	sc.close();
	 }
}
