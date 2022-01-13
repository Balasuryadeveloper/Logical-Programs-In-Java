package Logical_Programs;
import java.util.Scanner;
public class Rev_Number {

	public static void main(String[] args) {
		int n,sol=0,r,temp;
		System.out.println("Enter The Number : ");
		Scanner nval=new Scanner(System.in);
		n=nval.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sol=sol*10+r;
			n=n/10;
		}
		if(sol == temp)
		{
			System.out.println("The Number is Palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
		}
	}

}
