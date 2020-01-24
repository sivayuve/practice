import java.util.Scanner;
public class Division
{
	public static void main(String[]args)
	{
		int n,j,quotient,reminder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		n = sc.nextInt();
		System.out.println("Enter the second value: ");
		j = sc.nextInt();
		quotient = n/j;
		reminder = n%j;
		System.out.println("The quotient is " +quotient);
		System.out.println("The reminder is " +reminder);
	}
}