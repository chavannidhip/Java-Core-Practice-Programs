package testNotepadPrograms;

public class reverseWords {

	//Reverse words: Write a method that will take a string as an argument. The method will reverse the position of words and return it.

	public static void main(String args[]){

		String str= "I love my family";
		System.out.println(reverseWordsfunc(str));
	}

	public static String reverseWordsfunc(String origStr){

		/*		String[] strA= origStr.split(" ");
		StringBuilder revStr= new StringBuilder();

		
		for(String word: strA)
		{
			StringBuilder sb = new StringBuilder(word);
			revStr.append(sb.reverse());
			revStr.append(" ");
		}

		return revStr.toString();
	
*/
	
	// approach 2
		String[] strA= origStr.split(" ");
	

		String temp ="";
		for(String word: strA)
		{
			for(int i =word.length()-1;i>=0;i--)
			{
				temp=temp+word.charAt(i);
			}
			temp=temp +" ";
		}
		return temp; 
	}
}

