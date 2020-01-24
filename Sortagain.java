import java.util.Scanner;
public class Sortagain
{
	public static void main(String[]args)
	{
		int n,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements required to sort");
		n=sc.nextInt();
		int a[]=new int[n]; 
		for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+ " ");
	}
}