package testNotepadPrograms;

public class sumOfTwoNo {
	// Sum of two: Write a method that accepts int[] array and an int number, find 2 elements in the array that sum is equal to the given int. 
	// Assume that an input array will have only one pair of numbers that sum equal to our given number.
	//  It will always have this pair. See input and output examples. I use the Brute Force algorithm.

	public static void main(String [] args){
	 int a[]= {1,3,6,8,9,14};
	sumOf2Numbers(a, 9);

	}

	public static void sumOf2Numbers(int a[], int sum){

	int tempsum=0;
	boolean flag =false;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length-1;j++)
		{
			tempsum=a[i]+a[j];
			if(tempsum == sum)
				{
					System.out.println(a[i] +", " + a[j]);
					flag= true;
					break;
				}

		}
	}
	if(!flag)
		System.out.println("numbers not present whose sum is "+ sum);
	}
}
