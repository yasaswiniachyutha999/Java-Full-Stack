import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		System.out.println("enter c:");
		int c=sc.nextInt();
		int p=a+b+c;
		System.out.println("perimeter of triangle is : "+p);
		System.out.println("enter height :");
		int height=sc.nextInt();
		double area=0.5*b*height;
		System.out.println("area of triangle : "+area);
	}
}
