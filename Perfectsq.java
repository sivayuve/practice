import java.util.Scanner;
public class Perfectsq
{
	public static void main(String[]args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		num=sc.nextInt();
		double sq=Math.sqrt(num);
		if(sq-(Math.floor(sq))==0)
		{
			System.out.println("The given number is a perfect square");
		}
		else
		{
			System.out.println("The given number is not a pefect square");
		}
	}
}