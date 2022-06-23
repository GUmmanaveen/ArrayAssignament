package Arraycom;

public class LargeNuberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int temp=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(temp<array[i])
			{
				temp=array[i];
			}
		}
		System.out.print("largest element in the array is :"+temp);

	}

}
