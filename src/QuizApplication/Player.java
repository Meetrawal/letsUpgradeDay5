package QuizApplication;

import java.util.Scanner;

public class Player {
	String name;
	int score = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public void getDetails()
	{
		System.out.println("Enter Your Name : ");
		name = sc.nextLine();
	}

}
