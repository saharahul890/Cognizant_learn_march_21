/**
 * Name: Rahul Saha
 * Description: Display all integers and their sum using stringTkenizer class
 * Date : 17/3/2021
 */


package exercises;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DisplaySumOfIntegers {
	public static int sumOfNumbers(String inputNumbers) {
		int sum=0;
		StringTokenizer str= new StringTokenizer(inputNumbers,",");
		while(str.hasMoreTokens()) {
			int number= Integer.parseInt(str.nextToken());
			sum+=number;
		}
		return sum;
	}
	public static String displayNumbers(String inputNumbers) {
		StringTokenizer str1= new StringTokenizer(inputNumbers,",");
		StringBuffer sb= new StringBuffer();
		while(str1.hasMoreTokens()) {
			sb.append(str1.nextToken()).append(" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers with separate with (,)");
		String inputNumbers= scanner.next();
		System.out.println("Input integers are : "+displayNumbers(inputNumbers));
		System.out.println("Sum of input integers is : "+sumOfNumbers(inputNumbers));
	}
}