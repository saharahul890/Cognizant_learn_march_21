package exercises;

import java.util.Arrays;
import java.util.Scanner;
public class Fibbonaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Which term of the Fibbonaci Series You Want to Print");
		int num=sc.nextInt();
		String str=generateFibbonaci(num).toString();
		String[] strArray=str.split(" ");
		int lastNumber=Integer.parseInt(strArray[strArray.length-1]);
		System.out.println(num+" th term of the fibbonaci series is : "+lastNumber);
		}
	
	public static StringBuilder generateFibbonaci(int num) {
		
		int firstNumber=0,secondNumber=1,sum;
		StringBuilder FibbonaciSeries=new StringBuilder();
		FibbonaciSeries.append(firstNumber);
		FibbonaciSeries.append(" ");	
		FibbonaciSeries.append(secondNumber);
		
		for(int i=0;i<num-2;i++) {
			sum=firstNumber+secondNumber;
			firstNumber=secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			FibbonaciSeries.append(" ");
			FibbonaciSeries.append(sum);
		}
		return FibbonaciSeries;
		}
	}

