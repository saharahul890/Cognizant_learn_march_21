/**
 * Name : Rahul Saha
 * Description : A Java Program to test if an array contains any specific value
 * Date : 17/3/2021
 */
package exercises;

import java.util.Scanner;

public class SpecificValue {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	    System.out.println("Enter the size of your array");
	    int size=sc.nextInt();
	  
	    int[] arr=new int[size];
	    
	    for(int i=0;i<size;i++) {
	    	System.out.println("Enter "+i+" th element");
	    	arr[i]=sc.nextInt();
	    }
	    int value;
	    boolean condition = checkASpecificValue(arr);
	    
	    if(condition) {
	    	System.out.println("Value you are searching for is present in array.");
	    }
	    else
	    	System.out.println("Value you are searching for is not present in array.");
	    

	}

	private static boolean checkASpecificValue(int[] arr) {
	     
		System.out.println("Enter a specific value you want to search");
		int value=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				flag=true;
			}
			
		}
		
		return flag;
	}

	

}
