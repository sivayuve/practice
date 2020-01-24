import java.util.Random;
public class Randomnum
{
	public static void main(String[]args)
	{
	Random obj = new Random();

		for(int a=0;a<10;a++)
		{
			int anynum =obj.nextInt(100);
			System.out.println("The random number is:"+anynum);
		}
	}
}