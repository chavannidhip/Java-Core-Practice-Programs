package testNotepadPrograms;

public class reverseNumber {
	//Number palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward. 

	public static void main(String args[])
	{

		int num = 10210;
		System.out.println(funcIsNumPalindrome(num));

	}

	public static boolean funcIsNumPalindrome(int number){
		int orig=number;
		int temp=0;

		while(number>0)
		{
			temp=temp*10+(number%10);
			number=number/10;
		}
	/*	if(temp==orig)
			return true;
		else
			return false; */
		
		return temp==orig?true:false; //Ternary operator
	}
}
