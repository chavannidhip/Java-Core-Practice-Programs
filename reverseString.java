<<<<<<< HEAD
package testNotepadPrograms;

import java.util.Scanner;

public class reverseString {
	//String reverse: 
	//Write a method that will take one string as an argument and will return the reverse version of this string.

	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String orig= sc.next();
		//	System.out.println(funRevString(orig));
		System.out.println(funUsingStringBuilder(orig));
	}

	// StringBuilder is more efficient
	public static String funUsingStringBuilder(String orig){

		StringBuilder str = new StringBuilder();

		char c[]=orig.toCharArray();

		for(int i=orig.length()-1;i>=0;i--)
		{
			str.append(c[i]);
		}
		return str.toString();
	}

	// String will create many string objects in concatenation as it is an immutable object.
	public static String funRevString(String orig){

		int l=orig.length();
		char c[]=orig.toCharArray();
		String temp="";

		for(int i=l-1;i>=0;i--)
		{
			temp=temp+c[i];
		}
		return temp;
	}
}
=======
package testNotepadPrograms;

import java.util.Scanner;

public class reverseString {
	//String reverse: 
	//Write a method that will take one string as an argument and will return the reverse version of this string.

	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String orig= sc.next();
		//	System.out.println(funRevString(orig));
		System.out.println(funUsingStringBuilder(orig));
	}

	// StringBuilder is more efficient
	public static String funUsingStringBuilder(String orig){

		StringBuilder str = new StringBuilder();

		char c[]=orig.toCharArray();

		for(int i=orig.length()-1;i>=0;i--)
		{
			str.append(c[i]);
		}
		return str.toString();
	}

	// String will create many string objects in concatenation as it is an immutable object.
	public static String funRevString(String orig){

		int l=orig.length();
		char c[]=orig.toCharArray();
		String temp="";

		for(int i=l-1;i>=0;i--)
		{
			temp=temp+c[i];
		}
		return temp;
	}
}
>>>>>>> c1d927f97668aff75b41b4eb8b27d155bfadeb70
