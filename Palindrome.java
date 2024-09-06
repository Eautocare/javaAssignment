import java.util.Scanner;
public class Palindrome 
{
	public static void main(String...args) 
	{
	
	Scanner zoe = new Scanner(System.in);

	System.out.print("Enter a digit: ");
	int num = zoe.nextInt();	

	int reversedNum = 0; int remainder =0; int originalNum = num;
	while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num = num /10;
 				   }
    
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
   							 }
    else	 {
      System.out.println(originalNum + " is not Palindrome.");}
    	}
  }