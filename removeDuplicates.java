package testNotepadPrograms;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aassddffeerrwwtt";
		String ans="";
		char c[] = str.toCharArray();
		
		for(char ele : c)
		{
			if(!ans.contains(String.valueOf(ele)))
				ans=ans+ele;
		}
		
		System.out.println(ans);
	}

}
