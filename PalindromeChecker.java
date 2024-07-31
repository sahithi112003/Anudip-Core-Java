package practice;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		/*creating object of scanner class*/
		Scanner sc = new Scanner(System.in);
		/*Input of data through keyboard*/
		System.out.println("Enter any number:");
		int num;
		num=sc.nextInt();
		int r,sum,temp;
		sum=0;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		/*Displaying whether given number is palindrome or not*/
		if(temp==sum)
		{
			System.out.println("It is a palindrome");
			
		}
		else
		{
			System.out.println("It is not a palindrome");
			
		}
	}
}
       