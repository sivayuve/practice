import java.util.Scanner;
public class Reversewhile
{
	public static void main(String[]args)
	{
		int a,n,num;
		int reverse =0;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the number");
		a = ab.nextInt();
		while(a!=0)
		{
			num = a%10;
			reverse = reverse*10 + num;
			a/=10;
		}
		System.out.println("The reverse number is:"+reverse);
	}
}