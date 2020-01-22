import java.util.Scanner;
public class Compound
{
	public static void main(String[]args)
	{
	double p,r,n,i,ci;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principle value: ");
	p = sc.nextDouble();
	System.out.println("Enter the rate value: ");
	r = sc.nextDouble();
	System.out.println("Enter the duration value: ");
	n = sc.nextDouble();
	i = r/100;  
	ci= p * Math.pow(1+i,n);
	System.out.println("The compound intrest is:" +ci);
	
    }
}