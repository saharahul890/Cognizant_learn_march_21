 /** Name : Rahul Saha
 * Description: Lab3 (Ex.5) Count of character,words in a given text
 * Date: 17/3/2021
 */

package exercises;

import java.util.Scanner;
public class CountOfCharacterLineWord {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a text");
           String text=sc.nextLine();
           System.out.println("Number of character in this text is : "+countCharacter(text));
           System.out.println("Number of words in this text is : "+countWord(text));
           

	}

	private static int countWord(String text) {
		
		String[] strArr=text.split(" ");
		return strArr.length;
	}

	private static int countCharacter(String text) {
		int count=0;
		char[] chArr=text.toCharArray();
		for(char ch:chArr) {
			if(ch!=' ') {
				count++;
			}
		}
		
		return count;
		}
	

}