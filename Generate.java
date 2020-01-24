import java.util.Scanner;
public class Generate
{
	public static void main(String[]args)
	{
		int num,start,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number");
		num = sc.nextInt();
		System.out.println("The set of required numbers are");
		for(start=1;start<num+1;start++)
		{
			sum+=start;
		}
					System.out.print(sum+" ");

	}
}