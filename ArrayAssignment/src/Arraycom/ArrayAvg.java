package Arraycom;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			sum=sum+array[i];
		}
		float avg=0;
		avg=(float)sum/size;
		System.out.print("Average of array elements is  :"+ avg);

	}

}
