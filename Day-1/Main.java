import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no of rows");
		int r1=sc.nextInt();
		System.out.println("enter no of columns");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("enter matrix");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("the given matrix is :");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();			
		}
		System.out.println("spiral order is :");
		spiralPrint(a,r1,c1);
	}
	static void spiralPrint(int a[][],int r,int c)
	{
	    int top=0,bottom=r-1,left=0,right=c-1;
	    while(top<=bottom && left<=right)
	    {
	        for (int i = left; i <= right; i++)
	        {
	            System.out.print(a[top][i]+" ");   
	        }
	        top++;
	       for (int i = top; i <= bottom; i++) 
	        {
	            System.out.print(a[i][right]+" ");   
	        }
	        right--;
	        
	        if (top <= bottom) 
	        {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
	    }
	}
}