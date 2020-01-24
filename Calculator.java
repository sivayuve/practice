import java.util.Scanner;
public class Calculator
{
	public static void main(String[]args)
	{
		int a,b,operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		System.out.println("The operations available are:");
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		operator = sc.nextInt();
		double answer=0;
		switch(operator)
		{
			case 1:
			answer=a+b;
			break;
		
			case 2:
			answer=a-b;
			break;
		
		
			case 3:
			answer=a*b;
			break;
		
		
			case 4:
			answer=a/b;
			break;
		}
		System.out.println(answer+" is the answer");
	}
}