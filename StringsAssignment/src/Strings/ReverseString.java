package Strings;

public class ReverseString {

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
      System.out.println("reverse String of "+s+" is "+newString);
	}

}
