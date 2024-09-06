import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String...args){
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter digit: ");
		int number = scan.nextInt();
		
		int reverse = 0;
		for(; number != 0; number = number/10) {
		int remainder = number %10;
		reverse = reverse * 10 +  remainder;}
		System.out.print("The reverse of the given number is: "+  reverse);//you can't use comma here that's why i use + instead,. cause the reverse a string can't be assigned to an integer,  thats why i need to concatenate it with the plus sign 

		//reverse();
		
		
		}


	/**public static void reverse(int number){
		
		System.out.print(reverse);}**/			
		
								

 }

	