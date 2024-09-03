import java.util.Scanner;
public class GasMileage
{
	public static void main(String...args)
	{
		Scanner zoe = new Scanner(System.in);

		System.out.print("Miles driven: ");
		int milesdriven = zoe.nextInt(); 

		System.out.print("Gallons used: ");
		int gallonsused = zoe.nextInt(); 

		double gasmileage  = (milesdriven/gallonsused);
		System.out.println("The gas mileage of your vehicle is " +  gasmileage);


		if (gasmileage == 0); {System.out.print("Your engine will knock soon");}

	}
}