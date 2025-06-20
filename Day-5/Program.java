import java.util.*;
class Program
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size :");
		int n=sc.nextInt();
		System.out.println("enter array elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{

			arr[i]=sc.nextInt();
		}
		int c=0;
		int count=0;
		for(int i=0;i<n-1;i++)
		{

			if(arr[i]==arr[i+1])
			{
				c++;
			}
			if((c+1)==arr[i])
			{
				count=count+1;
				c=0;
			}
		}
		System.out.println(count);
	}
}


		
			
		