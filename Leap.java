import java.util.Scanner;
public class Leap
{
	public static void main(String[]args)
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year:");
		year = sc.nextInt();
		boolean leap = false;
		if(year % 4 ==0)
		{
			if(year%100 ==0)
			{
				if(year%400 == 0)
					leap = true;
				else
					leap = false;
				}
				else
			    	leap = true;
			}
			else
			leap = false;
		if(leap == true)
			System.out.println(year +" is a leap year");
		else
			System.out.println(year +" is not a leap year");
	}
}