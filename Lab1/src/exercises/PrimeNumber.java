package exercises;

import java.util.Scanner;

public class PrimeNumber {
      
   public static String getAllPrimeNumber(int number) {
	   String str="";
	   for( int i=2;i<=number;i++) {
		   boolean flag=true;
		   for(int j=2;j<i;j++) {
			   if(i%j==0) {
				   flag=false;
			   }
		   }
		   if(flag) {
			   str+=" "+String.valueOf(i);
		   }
	   }
	   return str;
   }
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter a number upto which you want to print prime number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("prime number between 1 and "+number+" are "+getAllPrimeNumber(number));

}
}

