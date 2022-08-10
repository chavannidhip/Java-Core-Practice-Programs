package testNotepadPrograms;

public class stringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		String str1="abc";
		String str2 = new String("abc");
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str2.equals(str1));
	}

}
