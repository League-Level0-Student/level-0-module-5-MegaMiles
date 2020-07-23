package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyname = "";

		// 1. Ask the user to enter their name
String lol = JOptionPane.showInputDialog(null,"What is your name" );
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(lol.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
for (int i = 0; i < lol.length(); i++) {
System.out.println(lol.charAt(i));	
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			System.out.println(lol.substring(1,4));
			String next = lol.substring(i,i+1);
			//System.out.println(next);
			if(i%2==0) {
			goofyname=goofyname+next.toUpperCase()+lol.substring(3,4);	
			}
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
			if(i%2==1) {
				goofyname=goofyname+next.toLowerCase()+lol.substring(2,4);	
				}
			
			// 6. ADD this String  (containing 1 char) to the goofyName String

}
		// 7. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null,"Your goofyname is "+goofyname);
	}
}

