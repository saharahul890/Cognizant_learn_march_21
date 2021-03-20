/**
 * Name : Rahul Saha
 * Description:  Mirror Image of a word
 * Date: 17/3/2021
 */
package exercises;
import java.util.Scanner;
public class MirrorImage {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a string of which you want mirror image");
	       String word=sc.next();
	       sc.close();
	       System.out.println(word+"|"+getImage(word));
		}

		
		 public static StringBuffer getImage(String word) {
			 StringBuffer sb=new StringBuffer();
			 sb.append(word);
			 sb.reverse();
			 return sb;
			 
		 }

}