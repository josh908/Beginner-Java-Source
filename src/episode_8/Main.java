package episode_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int age;
		
		age = scanner.nextInt();
		
		if(age >= 65)
			System.out.println("You're a senior!");
		else if(age >= 18)
			System.out.println("You're an adult!");
		else if (age >= 0)
			System.out.println("You're a child");
		else
			System.out.println("Invalid input: Negative age.");
		
		scanner.close();
	}
}
