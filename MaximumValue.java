import java.util.Scanner;
public class MaximumValue{
	
	public static void main(String...args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter three digits: ");
		int digit1 = scan.nextInt();
		int digit2 = scan.nextInt();
		int digit3 = scan.nextInt();
		
		int result = maximum(digit1, digit2, digit3);
		System.out.print("The maximum number is: ", result);


		
		

}





}