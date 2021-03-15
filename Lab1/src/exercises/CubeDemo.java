package exercises;

import java.util.Scanner;
public class CubeDemo {

	public static int cubeSum(int num1) {
		int num=num1;
		
		int n1,sum=0;
		while(num>0) {
			n1=num%10;
			sum=sum+(n1*n1*n1);
			num=num/10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		System.out.println("Sum of the cube of the digits of your given number is: "+cubeSum(num));
	
		}

	}
