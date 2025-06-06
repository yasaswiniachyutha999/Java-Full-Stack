import java.util.*;
class Swapping
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		System.out.println("before swapping:");
		System.out.println("a="+a +" "+"b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping:");
		System.out.println("a="+a +" "+"b="+b);
	}
}

		




		
		