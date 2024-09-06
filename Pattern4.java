import java.util.Scanner;
public class Pattern4 {
	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);


		System.out.print("Enter digit: ");
		int number = scan.nextInt();

		displayPattern(number);
		
	}


	public static void displayPattern(int n){
		for(int i =1; i <= n; i++) {
			System.out.print("  " + displayPattern2(i));
			System.out.println();
		}
 	}


	public static int displayPattern2(int n){
		int num = 0;
		for(int j =1; j < n; j++) {
			//System.out.print("  " +j);
			num = j;
		}
		return num; 
	}


}