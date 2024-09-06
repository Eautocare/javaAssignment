//prompt the user for a number

import java.util.Scanner;
public class PositiveDoublevalue
{
	public static void main(String...args){
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter digit: ");
		double value = scan.nextDouble();

		System.out.print(Math.sqrt(value));

		}

}