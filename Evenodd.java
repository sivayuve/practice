import java.util.Scanner;
public class Evenodd
{
	public static void main(String[]args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
		int a=sc.nextInt();
		System.out.println("Enter the last value");
		int b=sc.nextInt();
		{
		System.out.println("The even numbers are");
		for(i=a;i<b+1;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			}
			System.out.println();
		}
	
		System.out.println("The odd numbers are");
		for(i=a;i<b+1;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}
}