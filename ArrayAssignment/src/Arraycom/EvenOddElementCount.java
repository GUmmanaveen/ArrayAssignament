package Arraycom;

public class EvenOddElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			if(array[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Count of even numbers in the array is :"+evenCount);
		System.out.println("Count of odd numbers in the array is :"+oddCount);

	}

}
