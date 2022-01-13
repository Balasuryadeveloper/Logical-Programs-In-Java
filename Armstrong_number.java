package Logical_Programs;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		
		int n,temp,sum=0,r;
		System.out.println("Enter The value of n :");
		Scanner nval=new Scanner(System.in);
		n=nval.nextInt();
		temp=n;
		if(n <=0)
		{
			System.out.println("Please Enter The Value Above 1 :");
			System.out.println("Please , Run again the Program");
		}
		else
		{
			while(n>0)
			{
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
		    if(temp == sum)
		    {
		    	System.out.println("The number is Armstrong");
		    }
		    else
		    {
		    	System.out.println("The number is not Armstrong");
		    }
		}
		

	}

}
