/**prompt the user for letters,
store it 
display the letters
**/

import java.util.Scanner;
public class CountLetters
{
	public static void main(String...args){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Type a word: ");
		String word = scan.nextLine();

		System.out.print(word.length());
		}

}