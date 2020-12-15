package Assigments;


import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What would you like to check?");
		
		String word = scn.nextLine();
		
		boolean valid =true;
		
		for(int beginningIndex =0,
			endingIndex = word.length()-1;
				beginningIndex < endingIndex;
				beginningIndex++,endingIndex--)
		{
			if(Character.compare(word.charAt(beginningIndex), word.charAt(endingIndex))!=0)
			{
				valid = false;
				
			}
		}
		
		if(valid)
		{
			System.out.println(new String(word) + " is a palindrome");
		}
		else {
			System.out.println(new String(word) + " is not a palindrome");
		}
	}
}
