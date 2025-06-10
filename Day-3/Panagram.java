import java.util.*;
public class Panagram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string :");
		String s=sc.nextLine();
		int max_char=26;
		boolean arr[]=new boolean[max_char];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch >='A' && ch <='Z')
			{
				arr[ch - 'A']=true;
			}
			else if(ch >='a' && ch <='z')
			{
				arr[ch - 'a']=true;
			}
		}
		boolean isPanagram=true;
		for(int i=0;i<max_char;i++)
		{
			if(!arr[i])
			{
				isPanagram=false;
				break;
			}
		}
		if(isPanagram)
			System.out.println("panagram");
		else
			
			System.out.println("not panagram");			
		
	}
				
		
}

					
			
			

			
			