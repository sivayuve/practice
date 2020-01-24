import java.util.Scanner;
public class Linearsearch
{
	public static void main(String[]args)
	{
		int n,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of values:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value to find");
		j=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i] == j)
			{
				System.out.println(j+" is present at "+(i+1)+" place");
				break;
			}
		}
		if(i==n)
				System.out.println(j+ " is not in the given set");
			
		}
	}