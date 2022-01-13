package Logical_Programs;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		
		//To find Perfect Number
		int n,sum=0,div=1;
		System.out.println("Enter The Value Of N :");
		Scanner nval=new Scanner(System.in);
		n=nval.nextInt();
		if(n <=0)
		{
			System.out.println("Please Enter The value Above 1");
			System.out.println("Try Again !");
		}
		else
		{
			for(int i=1;i<=n/2;i++)
			{
				div=n%i;
				if(div == 0)
				{
					sum=sum+i;
				}
			}
			if(n == sum)
			{
				System.out.println("This is Perfect Number");
			}
			else
			{
				System.out.println("The Number is not Perfect Number");
			}
		}
	}

}
