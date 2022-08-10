package testNotepadPrograms;

import java.util.Arrays;

public class strinAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("pehl","help"));
	}

	
	public static boolean isAnagram(String str1, String str2) {
		char a[] = str1.toCharArray();
		char b[]= str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);

	}
}
