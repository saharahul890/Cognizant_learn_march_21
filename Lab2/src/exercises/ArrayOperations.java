/**
 * Name: Rahul Saha
 * Description : count of positive,negative,odd,even,0s in an array
 * Date: 17/3/2021
 */
package exercises;

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 20 integers");
		 int[] arr=new int[20];
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int noOfPositiveInt=countPositiveInt(arr);
		 int noOfNegativeInt=countNegativeInt(arr);
		 int noOfOddInt=countOddInt(arr);
		 int noOfEvenInt=countEvenInt(arr);
		 int noOfZero=countZero(arr);
		 
		 System.out.println("No of positive integer is "+noOfPositiveInt);
		 System.out.println("No of negative integer is "+noOfNegativeInt);
		 System.out.println("No of odd integer is "+noOfOddInt);
		 System.out.println("No of Even integer is "+noOfEvenInt);
		 System.out.println("No of 0s is "+noOfZero);
		 
	}
	public static int countPositiveInt(int[] arr) {
		int count=0;
		 for(int i=0;i<arr.length;i++) {
			
			 if(arr[i]>0) {
				count++;
		 }
			
		 }
		 return count;

     }
	
	public static int countNegativeInt(int[] arr) {
		int count=0;
		 for(int i=0;i<arr.length;i++) {
			
			 if(arr[i]<0) {
				count++;
		 }
			
		 }
		 return count;

     }
	
	public static int countOddInt(int[] arr) {
		int count=0;
		 for(int i=0;i<arr.length;i++) {
			
			 if(arr[i]%2!=0) {
				count++;
		 }
			
		 }
		 return count;

     }
	public static int countEvenInt(int[] arr) {
		int count=0;
		 for(int i=0;i<arr.length;i++) {
			
			 if(arr[i]%2==0) {
				count++;
		 }
			
		 }
		 return count;

     }
	public static int countZero(int[] arr) {
		int count=0;
		 for(int i=0;i<arr.length;i++) {
			
			 if(arr[i]==0) {
				count++;
		 }
			
		 }
		 return count;

     }
	
	
}