package Assignment;

import java.util.Scanner;

public class customMain {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		customeCheckedException ce = new customeCheckedException();
		System.out.print("Please enter a capitalized word: ");
		
		try 
		{
			if(ce.isCapitalised(scn.next()))
			{
				System.out.println("Good Job");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
