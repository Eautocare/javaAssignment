import java.util.Scanner;
public class Triangle
{
	public static void main(String...args)
	{
		Scanner zoe = new Scanner(System.in);
		System.out.print("Length of triangle: ");

		int length = zoe.nextInt();
		for(int i = 1; i <=length; i++) 
		{
		if (length <= 10) System.out.println("*");

		for(int base = 0; base <= i; base++) System.out.print("*");





		}
		


	}
}