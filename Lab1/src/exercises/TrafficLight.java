package exercises;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. Yellow");
	
		System.out.println("Select the light : ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
				
		if(choice==1) {
			System.out.println("Stop");
		}
		else if(choice==2) {
			System.out.println("Go");
			
		}
		else if(choice==3) {
			System.out.println("Ready");
		}
		

	}

}
