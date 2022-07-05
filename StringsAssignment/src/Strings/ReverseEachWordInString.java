package Strings;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter String input");
		String s=sc.nextLine();
		String newString="";
		String sArray[]=s.split(" ");
		for(int i=0;i<sArray.length;i++)
		{
			String stringRev = "";
			//System.out.println(sArray[i]);
			for(int j=0;j<sArray[i].length();j++)
			{
				char c=sArray[i].charAt(j);
				stringRev=c+stringRev;
				//sArray[i]=stringRev;
			}
			
			newString=newString+" "+stringRev;
		}
		System.out.print(newString);
	}
}
