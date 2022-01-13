package Logical_Programs;

public class FibonacciSerious {

	public static void main(String[] args) {
		
		//Fibonacci Serious
		short a=0,b=1,sum=0;
		System.out.print(a+" "+b+" ");
		for(short i=a;i<=10;i++)
		{
			sum = (short) (a+b);
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}

}
