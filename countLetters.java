package testNotepadPrograms;
import java.util.HashMap;
import java.util.Map;

//Count letters(Map). Write a method that accepts a string as an argument.
//The method counts the number of appearances of each char and return map.
// The key will be a letter and the value will be a number of appearances in the string. 
// See input and output in the example.package testNotepadPrograms;

public class countLetters {
	public static void main(String [] args){

		countLettersfunc("Yellow");
	}

	public static void countLettersfunc(String str){

		char c[]= str.toCharArray();

		Map<Character, Integer> m= new HashMap<Character, Integer>();

		for(char ele: c)
		{
			if(m.containsKey(ele))
				m.put(ele, (m.get(ele)+1));
			else
				m.put(ele, 1);
		}

		// print map

		for(Character key: m.keySet())
		{
			System.out.println(key + " " + m.get(key));
		}
	}
}