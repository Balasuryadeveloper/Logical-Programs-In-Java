package Logical_Programs;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		//Prime Number
		int n,flag=0,r;
		System.out.println("Enter Value of N : ");
		Scanner nval=new Scanner(System.in);
		n=nval.nextInt();
		for(int i=2;i<n;++i)
		{
			r=n%i;
			if(r == 0)
			{
				flag++;
			}
		}
		if(flag == 0)
		{
			System.out.println("the Number is Prime");
		}
		else
		{
			System.out.println("The Number is not Prime");
		}
		
	}

}
