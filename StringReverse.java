import java.util.*;
class StringReverse
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		System.out.println("reverse string:");
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			System.out.print(c);
		}
	}
}
		
