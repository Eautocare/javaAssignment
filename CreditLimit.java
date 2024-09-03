import java.util.Scanner;
public class CreditLimit
{
	public static void main(String...args)
	{
		Scanner zoe = new Scanner(System.in);

		System.out.print( "Enter an account number: ");
		int acctnumber = zoe.nextInt();

		System.out.print("Enter balance at the beginning of the month: ");
		int balance = zoe.nextInt();

		System.out.print("total of all items charged by the customer this month: ");
		int totalitems = zoe.nextInt();

		System.out.print("total of all credits applied to the customer's this month: ");
		int charges = zoe.nextInt();

		System.out.print("credit limit: ");
		int credit = zoe.nextInt();

		int newbalance = (balance + charges - credit);
		System.out.printf("Your credit limit is %d", newbalance);

		if(newbalance > credit) {System.out.print(" Credit limit exceededs");}


	}

}