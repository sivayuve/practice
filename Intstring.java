public class Intstring
{
	public static void main(String[]args)
	{
		int i=100;
		String s= Integer.toString(i);
		String v= String.valueOf(i);
		System.out.println("without converstion "+(i+100));
				System.out.println("with converstion "+(s+100));
								System.out.println("with converstion "+(v+100));

	}
}