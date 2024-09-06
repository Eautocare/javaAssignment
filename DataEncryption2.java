import java.util.Scanner;
public class DataEncryption2
{
	public static void main(String...args)
	{
		Scanner zoe = new Scanner(System.in);

		System.out.print("Enter four digits: ");

		int userinput = zoe.nextInt();

		int firstNumber = (userinput/1000);
		int secondNumber = (userinput/100); 
		int thirdNumber = (userinput/10); 
		int fourthNumber = (userinput/1); 

		int firstDigit = (firstNumber + 7)%10; 
		int secondDigit = (secondNumber + 7)%10;
		int thirdDigit = (thirdNumber + 7)%10;
		int fourthDigit = (fourthNumber + 7)%10; 

		int firstEncryptedDigit =  thirdDigit ;
		int secondEncryptedDigit = fourthDigit ;
		int thirdEncryptedDigit = firstDigit ;
		int fourthEncryptedDigit = secondDigit ;

		System.out.printf("Encrypted New Four Digits are: %d %d %d %d ", firstEncryptedDigit, secondEncryptedDigit, thirdEncryptedDigit, fourthEncryptedDigit );

		}
}
		

		
		

	
		 
		

		
		

		