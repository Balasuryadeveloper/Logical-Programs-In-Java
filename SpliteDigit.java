package Logical_Programs;
import java.util.Scanner;
public class SpliteDigit {

	public static void main(String[] args) {
		
		String val;
		System.out.println("Enter The Number");
		Scanner sc=new Scanner(System.in);
		val=sc.nextLine();
		
		
		
		for(byte i=0;i<val.length();i++)
		{
			System.out.print(val.charAt(i)+" ");
		}
	}

}
