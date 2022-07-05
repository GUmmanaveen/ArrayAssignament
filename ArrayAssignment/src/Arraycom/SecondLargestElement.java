package Arraycom;

public class SecondLargestElement {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int max,max2;
		max=max2=array[0];
		for(int i=0;i<n;i++)
		{
			
			if(array[i]>max)
			{
				
				max=array[i];
			}
			else if(array[i]<max && array[i]>max2)
			{
				max2=array[i];
			}
		}
		System.out.println(max);
		System.out.println(max2);
		
		// TODO Auto-generated method stub

	}

}
