/**
 * Name : Rahul Saha
 * Description:  check whether a string is positive or not
 * Date: 17/03/2021
 */
package exercises;
import java.util.Scanner;
public class PositiveString {

	public static void main(String[] args) {
	     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		boolean b=checkPositiveStringOrNot(str);
		if(b) {
			System.out.println("Your entered String is a Positive String ");
		}
		else
			System.out.println("Your entered String is a Negative String ");

	}

	private static boolean checkPositiveStringOrNot(String str) {
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=1;i<ch.length;i++){
			 
				if((int)(ch[i])>(int)(ch[i-1])){
				   count++;
				}
	}
		if(count==(ch.length-1)) {
			return true;
		}
		else
             return false;
	}
}
