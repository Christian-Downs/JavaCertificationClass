package Assigments;

import java.util.Scanner;

public class OddNumberMaker {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int range = Integer.parseInt(scan.nextLine());
		
		for(int currentNumber = 0; currentNumber<=range;currentNumber++)
		{
			if(currentNumber%2==1)
			{
				System.out.println(currentNumber);
			}
		}
	}

}
