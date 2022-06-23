package Arraycom;

public class ArraySum {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			sum=sum+array[i];
		}
		System.out.print("sum of array elements is  :"+ sum);
		
		// TODO Auto-generated method stub

	}

}
