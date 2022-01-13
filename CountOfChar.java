package Logical_Programs;
import java.util.Scanner;
public class CountOfChar {

	public static void main(String[] args) {
		
		String word;
		char character;
		byte count=0;
		System.out.println("Enter The Word :");
		Scanner gval=new Scanner(System.in);
		word=gval.nextLine();
		System.out.println("Enter The Letter To Find A Count :");
		character=gval.next().charAt(0);
		
		for(byte i=0;i<word.length();i++)
		{
			if(character == word.charAt(i))
			{
				count++;
			}
		}
		System.out.println("The Letter "+character+" Repeated "+count+" Time");
		
	}

}
