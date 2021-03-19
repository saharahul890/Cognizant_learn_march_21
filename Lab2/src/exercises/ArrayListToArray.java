/**
 * Name: Rahul Saha
 * Description : Arraylist to array (Lab 2: Ex.4)
 * Date: 17/3/2021
 */


package exercises;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element you want to store in arraylist");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+"th Element");
			int element=sc.nextInt();
			arrayList.add(i, element);
		}
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=arrayList.get(i);
		}
		
		
	    System.out.println("Array is"+Arrays.toString(arr));
	   
		
		
	}

}
