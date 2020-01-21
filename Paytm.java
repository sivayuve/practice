import java.util.Scanner;
public class Paytm
{
	public static void main(String[]args)
	{
		int balance = 1000,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number=");
		n = sc.nextInt();
		if(n==1)
		{
			balance = balance - 250;
			System.out.println("Balance is " +balance);
		}
		if(n==2)
		{
			balance = balance + 500;
			System.out.println("Balance is " +balance);
		}
		else
		{
			System.out.println("Balance is " +balance);
		}
		}
	
}