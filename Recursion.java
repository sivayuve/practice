import java.util.Scanner;
public class Recursion
{
	public static void main(String[]args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
				System.out.println("The reverse number:");
				reverse(a);

	}
	public static void reverse(int number)
	{
		if(number<10)
		{
			System.out.println(number);
		return;
		}
		else
		{
			System.out.print(number%10);
			reverse(number/=10);
		}
	}
}
