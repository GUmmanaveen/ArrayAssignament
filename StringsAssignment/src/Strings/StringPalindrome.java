package Strings;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter String input");
		String s=sc.nextLine();
		String newString="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			newString=c+newString;
		}
		if(s.equals(newString))
		{
			System.out.println("given String "+s+" is palindrome");
		}
		else
		{
			System.out.println("given String "+s+" not is a palindrome");
		}

	}

}
