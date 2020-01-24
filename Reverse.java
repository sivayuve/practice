import java.util.Scanner;
public class Reverse
{
	public static void main(String[]args)
	{
		int a,b,num;
		int reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a = sc.nextInt();
		for(;a!=0;a/=10)
		{
			num = a%10;
			reverse= reverse*10 + num;
		}
		System.out.println("The reverse number is:"+reverse);
	}
}