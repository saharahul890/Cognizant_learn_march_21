/**
 * Name : Rahul Saha
 * Description:  Modification of a number
 * Date: 3/16/2021
 */
package exercises;
import java.util.Scanner;
public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you want to modify");
		int number=sc.nextInt();
		System.out.println("Modified Number is :"+modifyNumber(number));

	}

	private static int modifyNumber(int num) {
		String numStr=String.valueOf(num);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<(numStr.length()-1);i++) {
			char ch=numStr.charAt(i);
			int num1=Character.getNumericValue(ch);
			char ch1=numStr.charAt(i+1);
			int num2=Character.getNumericValue(ch1);
			int substraction=Math.abs((num2-num1));
			sb.append(substraction);
				
		}
		
         sb.append(numStr.charAt(numStr.length()-1));
         int num1=Integer.parseInt(sb.toString());
		return num1;
	}

}