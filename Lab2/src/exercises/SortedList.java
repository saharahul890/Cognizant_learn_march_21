/**
 * Name: Rahul Saha
 * Description : A Java Program to get sorted list of array elements
 * Date: 17/3/2021
 */
package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SortedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of your array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+"th element");
			arr[i]=sc.nextInt();
		}
		int[] finalSortedArray=sortedArray(arr);
		System.out.println("Sorted list of array is "+Arrays.toString(finalSortedArray));

	}

	private static int[] sortedArray(int[] arr) {
		int[] sortedArray=new int[arr.length];
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int k=0;k<arr.length;k++) {
				sortedArray[k]=arr[k];
			}
		
		return sortedArray;
	}

}
