/**
 *Name: Rahul Saha
 * Description: Method of replacing all consonant with its immediate consonant of a word
 * Date : 17/3/2021
 */
package exercises;
import java.util.Scanner;
public class ReplacingConsonants {

	public static void main(String[] args) {
	     
	      System.out.println("Enter a string in which you want to replace consonants ");
	      Scanner sc=new Scanner(System.in);
	      String word=sc.next();
	     
	      System.out.println("After replacing the word is : " + alterString(word));
		}

		private static String alterString(String word) {
			  char[] chArr=word.toCharArray();
			  StringBuffer sb=new StringBuffer();
			  
			  boolean flag=false;
		      for(char letter : chArr) {
		    	  if(letter=='a' || letter=='e' ||letter =='i' || letter=='o' ||letter=='u'
		    			  ||letter=='A' || letter=='B' ||letter =='I' || letter=='O' ||letter=='U') {
		    		  
		    		  sb.append(letter);
		    		  
		    	  }
		    	  else {
		    		  letter=(char)(letter+1);
		    		  sb.append(letter);
		      }
		}
		      String str=sb.toString();
		      return str;
		}
}
