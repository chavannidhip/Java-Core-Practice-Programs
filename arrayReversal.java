<<<<<<< HEAD
package testNotepadPrograms;

import java.util.Scanner;

public class arrayReversal {
	// Array reverse. Write a method that will take an array as an argument and reverse it.

	 public static void main(String args[]){

	 int a[] = {5,2,8,1,5,3,10};
	 int len=a.length;
/*
	 // with different array
	 int b[]= new int[len];

	 for(int i= len-1, j=0;i>=0;i--,j++)
	 {
	 	b[j]=a[i];
	 }

	 for(int j:b)
	 	System.out.print(j+ " ");

*/
	 // with same array
	 int j=len-1;
	 int temp;
	 for(int i=0;i<=len/2;i++)
	 {
	 temp= a[i];
	 a[i]=a[j-i];
	 a[j-i]=temp;
	 }

	 for(int i:a)
	 	System.out.print(i+ " ");

	 }
	}
=======
package testNotepadPrograms;

import java.util.Scanner;

public class arrayReversal {
	// Array reverse. Write a method that will take an array as an argument and reverse it.

	 public static void main(String args[]){

	 int a[] = {5,2,8,1,5,3,10};
	 int len=a.length;
/*
	 // with different array
	 int b[]= new int[len];

	 for(int i= len-1, j=0;i>=0;i--,j++)
	 {
	 	b[j]=a[i];
	 }

	 for(int j:b)
	 	System.out.print(j+ " ");

*/
	 // with same array
	 int j=len-1;
	 int temp;
	 for(int i=0;i<=len/2;i++)
	 {
	 temp= a[i];
	 a[i]=a[j-i];
	 a[j-i]=temp;
	 }

	 for(int i:a)
	 	System.out.print(i+ " ");

	 }
	}
>>>>>>> c1d927f97668aff75b41b4eb8b27d155bfadeb70
