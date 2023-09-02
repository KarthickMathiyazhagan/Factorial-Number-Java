package practice;
import java. util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numb=new Scanner(System.in);
		System.out.println("Enter your number:");
		int number =numb.nextInt(); 
		
		int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		  
/*		int num=1234;
		int rem=0;
		rem=rem*10+num%10;
		num=num/10;
	rem=rem*10+num%10;
	num=num/10;
	rem=rem*10+num%10;
	num=num/10;
	rem=rem*10+num%10;
	num=num/10;
		System.out.println(rem);
		*/
		
	}

}
