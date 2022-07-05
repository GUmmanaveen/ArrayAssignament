package Arraycom;

public class Practice {
	public static void main(String[] args){
		/*3,1,8,6,9 
		1,3,6,8,9*/
		int array[]= {836346,836862523,3,1,76,6,9, 36343};
		//int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			if(array[i]>array[j])
			{
				int temp=array[i];
			    array[i]=array[j];
				array[j]=temp;
			}
		}
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i]+" ");
			}
		
	}

}
