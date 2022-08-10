<<<<<<< HEAD
package testNotepadPrograms;

import java.util.Arrays;

public class maxMinNumberFromArray {
	// Program: Max/min number from an array.
	//Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.


	public static void main(String args[]){

	int a[]={10,1,5,30,100,6,45,2,46};

//	funcMaxMin(a);
	secondMaxMin(a);
	}

	public static void funcMaxMin(int arr[]){

	int max=arr[0];
	int min=arr[0];

	for (int i=0;i<arr.length;i++)
	{
		if(max <arr[i])
			max=arr[i];
		if(min > arr[i])
			min = arr[i];
	}
	System.out.println("Maximum Number is: "+ max);
	System.out.println("Minimum Number is: " +min);
	}
	
	public static void secondMaxMin(int a[]) {
		// Approach 1
/*		Arrays.sort(a);
		int max=a[0], min=a[0];
		if(a.length>=2)
		{
			max=a[a.length-2];
			min = a[1];
			System.out.println("Second Maximum Number is: "+ max);
			System.out.println("Second Minimum Number is: " +min);
		}
		else
			System.out.println("Array has less than 2 elements. Enter more values...");
	*/		
		// Approach 2

		int max=a[0];
		int maxIndex=0;
		for (int i=0;i<a.length;i++)
		{
			if(max <a[i])
			{
				max=a[i];
				maxIndex=i;
			}
		}
		System.out.println("Maximum Number is: "+ max);
		System.out.println("Index of Max number is: " +maxIndex);
		
		int secondMax= a[0];
		
		for (int i=0;i<a.length;i++)
		{
			if(secondMax <a[i] && i!= maxIndex)
				secondMax=a[i];
		}
			System.out.println("Second Maximum Number is: "+ secondMax);
		
		
	}
	
}
=======
package testNotepadPrograms;

import java.util.Arrays;

public class maxMinNumberFromArray {
	// Program: Max/min number from an array.
	//Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.


	public static void main(String args[]){

	int a[]={10,1,5,30,100,6,45,2,46};

//	funcMaxMin(a);
	secondMaxMin(a);
	}

	public static void funcMaxMin(int arr[]){

	int max=arr[0];
	int min=arr[0];

	for (int i=0;i<arr.length;i++)
	{
		if(max <arr[i])
			max=arr[i];
		if(min > arr[i])
			min = arr[i];
	}
	System.out.println("Maximum Number is: "+ max);
	System.out.println("Minimum Number is: " +min);
	}
	
	public static void secondMaxMin(int a[]) {
		// Approach 1
/*		Arrays.sort(a);
		int max=a[0], min=a[0];
		if(a.length>=2)
		{
			max=a[a.length-2];
			min = a[1];
			System.out.println("Second Maximum Number is: "+ max);
			System.out.println("Second Minimum Number is: " +min);
		}
		else
			System.out.println("Array has less than 2 elements. Enter more values...");
	*/		
		// Approach 2

		int max=a[0];
		int maxIndex=0;
		for (int i=0;i<a.length;i++)
		{
			if(max <a[i])
			{
				max=a[i];
				maxIndex=i;
			}
		}
		System.out.println("Maximum Number is: "+ max);
		System.out.println("Index of Max number is: " +maxIndex);
		
		int secondMax= a[0];
		
		for (int i=0;i<a.length;i++)
		{
			if(secondMax <a[i] && i!= maxIndex)
				secondMax=a[i];
		}
			System.out.println("Second Maximum Number is: "+ secondMax);
		
		
	}
	
}
>>>>>>> c1d927f97668aff75b41b4eb8b27d155bfadeb70
