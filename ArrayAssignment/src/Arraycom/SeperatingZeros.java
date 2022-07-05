package Arraycom;

public class SeperatingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]==0)
				{
					array[i]=array[j]+array[i]-(array[j]=array[i]);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}

}
