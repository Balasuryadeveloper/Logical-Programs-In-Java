package Logical_Programs;
import java.util.Scanner;

public class Rev_string {

	public static void main(String[] args) {

		//Reverse String
		String word;
		String rev="";
		System.out.println("Enter The Word :");
		Scanner gword=new Scanner(System.in);
		word=gword.nextLine();
		for(int i=word.length()-1;i>=0;i--)
		{
			System.out.print(word.charAt(i));
			rev=rev+word.charAt(i);
		}
		
		if(word.equals(rev))
		{
			System.out.println("\nThe word is Palindrome");
		}
		else
		{
			System.out.println("\nThe word is not Palindrome");
		}
	}

}
