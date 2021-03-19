/**
 * Name : Rahul Saha
 * Description : A Java Program to sort array of string.in final array,
 *               all left index string should be in uppper case and right index strings are should be lower case
 *               based on size of the array. 
 * Date : 17/3/2021
 */

package exercises;

import java.util.Scanner;

public class StringObjects {


		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int size;
			System.out.println("Enter size of the array: ");
			size = sc.nextInt();
			String[] unsortedStrings = new String[size];
			
			for(int i=0; i<size; i++) {
				System.out.println("Enter "+i+" th position string");
				unsortedStrings[i] = sc.next();
			}
			String[] sortedString = sortStrings(unsortedStrings);
			
			for(String elem : sortedString) {
				System.out.print(elem + " ");
			}
			
		}


		private static String[] sortStrings(String[] unsortedString) {
			String temp="";
			int index;
			/**
			 * Sorting of strings by lexicographic comparison.
			 */
			
			for(int i=0; i< unsortedString.length; i++) {
				for(int j=i+1; j<unsortedString.length; j++) {
					if(unsortedString[i].compareTo(unsortedString[j])>0) { // This compareTo method comparing this two strings lexicographically.
						                                               
						temp = unsortedString[i];
						unsortedString[i] = unsortedString[j];
						unsortedString[j] = temp;
					}
				}
			}
			
			if(unsortedString.length%2==0) {
			
				index = unsortedString.length/2;
				
			}
			else {
				index = (unsortedString.length+1)/2;
			}
			
			for(int k=0; k<index+1; k++) {
			
			 unsortedString[k]=unsortedString[k].toUpperCase();
			}
			for(int j=index; j<unsortedString.length; j++) {
				 unsortedString[j]=unsortedString[j].toLowerCase();
			}
			return unsortedString;
		}

	}


