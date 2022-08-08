package testNotepadPrograms;

import java.util.Scanner;

public class stringPalindrome {
	// String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String:");
	String str = sc.nextLine();

	System.out.println(funcIsPalindrome(str));
	}

	public static String funcIsPalindrome(String origStr){
// using StringBuilder
/*	StringBuilder sb= new StringBuilder(origStr);
	StringBuilder tempStr = sb.reverse();
*/
		String tempStr="";
		//Using each Char
		for(int i =origStr.length()-1; i>=0;i--)
		{
			tempStr= tempStr+origStr.charAt(i);
		}
		
	if(tempStr.toString().equals(origStr))
		return "Yes, Palindrome";
	else
	 	return "Not a palindrome";

	}

}
