import java.util.Scanner;
public class Perfect
{
	public static void main(String[]args)
	{
		int num,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		num=sc.nextInt();
		double sq=Math.sqrt(num);
		n=(int)sq;
		if(num==n*n)
		{
			System.out.println("The given number is a perfect square");
		}
		else
		{
			System.out.println("The given number is not a pefect square");
		}
	}
}