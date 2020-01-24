import java.util.Scanner;
public class Binary
{
	public static void main(String[]args)
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements required");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the search value");
		j=sc.nextInt();
		int first=0;
		int last=n-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
			if(a[middle]<j)
			{
				first = middle+1;
			}
			else if(a[middle]==j)
			{
				System.out.println(j+" is present at "+(middle+1)+"th place");
				break;
			}
			else
			{
				last = middle-1;
			}
			middle=(first+last)/2;
		}
		if(first>last)
			System.out.println(j+" is not present in the array");
	}
}