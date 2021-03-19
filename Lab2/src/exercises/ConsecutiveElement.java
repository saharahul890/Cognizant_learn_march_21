/**
 * Name : Rahul Saha
 * Description : Finding longest consecutive element sequence from a given unsorted array of integers
 * Date:17/3/2021
 */
package exercises;

import java.util.Scanner;

public class ConsecutiveElement {

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter size of the array: ");
          int size=sc.nextInt();
          
          //Declaring the unsorted array.
          int[] unsortedArray=new int[size];
          
          // Taking input from keyboard and storing elements into array.
          for(int i=0;i<unsortedArray.length;i++) {
        	  System.out.println("Enter "+i+"th element of the array");
        	  unsortedArray[i]=sc.nextInt();
          }
          
          //function for sorting array elements.
          sortIntegers(unsortedArray);
          
          int longestLength=checkLongestSequence( sortIntegers(unsortedArray));
          
          System.out.println("Longest consecutive sequence of the array is: "+longestLength);
          
          
          
	}

	private static int[] sortIntegers(int[] unsortedArray) {

		int[] sortedArray=new int[unsortedArray.length]; 
        int temp;
		 for (int i = 0; i < unsortedArray.length; i++) {     
	            for (int j = i+1; j < unsortedArray.length; j++) {     
	               if(unsortedArray[i] > unsortedArray[j]) {    
	                   temp = unsortedArray[i];    
	                   unsortedArray[i] = unsortedArray[j];    
	                   unsortedArray[j] = temp;    
	               }     
	            }     
	        }
		 for(int i=0;i<unsortedArray.length;i++) {
			 sortedArray[i]=unsortedArray[i];
		 }
		
		return sortedArray;
		
		}
	private static int checkLongestSequence(int[] sortedArray) {
		int length = 0;
		int current = 1;
		for(int i=1;i<sortedArray.length;i++){
            if (sortedArray[i] != sortedArray[i-1])
                if (sortedArray[i] - sortedArray[i-1] == 1) {
                	current ++;
                }
               
              length=current;
               
            }
        
		return length;
	}
	
	
}
