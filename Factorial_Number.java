package Logical_Programs;
import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {

		//factorial Of N Numbers
		int n,fact=1;
		System.out.println("Enter The Value Of N : ");
		Scanner nval=new Scanner(System.in);
		n=nval.nextInt();
		if(n <= 0)
		{
			System.out.println("Please Enter The Value Above 1");
			System.out.println("Try Again!");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
		}
		
	}

}
