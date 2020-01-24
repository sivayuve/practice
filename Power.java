import java.util.Scanner;
public class Power
{
	public static void main(String[]args)
	{
		int base,exponent,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value");
		base = sc.nextInt();
		System.out.println("Enter the exponent value");
		exponent = sc.nextInt();
		result = 1;
		for(;exponent !=0; --exponent)
		{
			result *= base;
		}
		System.out.println("The power of value is : " +result);
	}
}