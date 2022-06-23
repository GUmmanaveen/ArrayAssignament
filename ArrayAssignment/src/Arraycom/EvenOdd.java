package Arraycom;

public class EvenOdd {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		int evCount=0;
		int oddCount=0;
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			if(array[i]%2==0)
			{
				evCount++;
			}
			else
			{
				oddCount++;
			}
		}
		int evenArray[]=new int[evCount];
		int oddArray[]=new int[oddCount];
		int j=0;
		int k=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				evenArray[j]=array[i];
				j++;
			}
			else
			{
				oddArray[k]=array[i];
				k++;
			}
		}
		System.out.print("even numbers in the array are :");
		for(int i=0;i<evenArray.length;i++)
		{
			System.out.print(evenArray[i]+" ");
		}
		System.out.println();
		System.out.print("Odd numbers in the array are :");
		for(int i=0;i<oddArray.length;i++)
		{
			System.out.print(oddArray[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
