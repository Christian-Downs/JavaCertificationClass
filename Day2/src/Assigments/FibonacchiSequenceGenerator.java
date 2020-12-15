package Assigments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacchiSequenceGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many times do you wanna do this sequence?");
		
		int end = Integer.parseInt(sc.nextLine());
		if(end>2)
		{
			List<Integer> intList = new ArrayList<Integer>() {{
				add(0);
				add(1);
			}};
			System.out.println("0");
		
			for(int i =1;i<end;i++)
			{
				intList.add(intList.get(i)+intList.get(i-1));
				System.out.println(intList.get(i));
			}
		}
		else
		{
			System.out.println("0\n1");
		}
		
	}
}
