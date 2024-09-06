import java.util.Scanner;
public class GasMileage
{
	public static void main(String...args) {
		
		double sum = 0;
	{
		Scanner zoe = new Scanner(System.in);

		for(int userinput = 1; userinput<4; userinput++ ) {

		System.out.println("Miles driven: ");
		int milesdriven = zoe.nextInt(); 

		System.out.println("Gallons used: ");
		int gallonsused = zoe.nextInt(); 

		double gasmileage  = (milesdriven/gallonsused);
		sum = sum + gasmileage;
		System.out.println("The gas mileage of your vehicle is " +  gasmileage);

		
		if (gasmileage == 0); {System.out.println("Your engine will knock soon");}}

		System.out.println(sum);

	}}
}