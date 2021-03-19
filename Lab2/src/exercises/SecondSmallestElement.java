/**
 * Name: Rahul Saha
 * Description : Finding Second smallest element of array(lab2)
 * Date: 17/3/2021
 */
package exercises;
import java.util.*;
public class SecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of the array");
         int size=sc.nextInt();
         int[] arr=new int[size];
         System.out.println("Enter "+size+" elements");
         for(int i=0;i<size;i++) {
        	 arr[i]=sc.nextInt();
         }

		
		int[] arrayAfterSort=getSecondSmallest(arr);
		
		System.out.println("Second smallest element is: "+arrayAfterSort[1]); 
		
			
	
	}

	public static int[] getSecondSmallest(int[] arr) {
		
		int[] sortedArray=new int[arr.length]; 
         int temp;
		 for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }
		 for(int i=0;i<arr.length;i++) {
			 sortedArray[i]=arr[i];
		 }
		
		
		
	    return sortedArray;
	}
}