package Arraycom;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int size=sc.nextInt();
		int array1[]=new int[size];
		int array2[]=new int[size];
		int array3[]=new int[size];
		int j=0;
		for(int i=0;i<size;i++)
		{
			array1[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
		array2[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			array3[i]=array1[i]+array2[i];
		}
		System.out.print("The elements of array3 is :");
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]+" ");
		}

	}

}