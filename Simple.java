import java.util.Scanner;
public class Simple
{
	public static void main(String[]args)
	{
	float p,r,n,si;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principle value: ");
	p = sc.nextFloat();
	System.out.println("Enter the rate value: ");
	r = sc.nextFloat();
	System.out.println("Enter the duration value: ");
	n = sc.nextFloat();
	si= p*n*r/100;
	System.out.println("The simple intrest is: " +si);
	
    }
}