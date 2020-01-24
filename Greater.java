import java.util.Scanner;
public class Greater
{
	public static void main(String[]args)
	{
		int a,b,c;
		Scanner dr=new Scanner(System.in);
		System.out.println("Enter the integers");
		a = dr.nextInt();
		b = dr.nextInt();
		c = dr.nextInt();
		if (a>b)
		{
			b = a;
		}
		if (b>c)
		{
							System.out.println("The largest number is "+b);
		}
		else
		{
							System.out.println("The largest number is "+c);

		}
	}
}