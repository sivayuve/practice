public class Stringint
{
	public static void main(String[]args)
	{
		String s= "350";
		int i=Integer.parseInt(s) ;
		System.out.println("without converstion "+(s+100));
				System.out.println("with converstion "+(i+100));
	}
}