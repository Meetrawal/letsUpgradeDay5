package QuizApplication;

public class Game {
	Question questions[] = new Question[3];
	
	public void initialize() 
	{
		for (int i = 0 ; i<questions.length;i++)
		{
			questions[i] = new Question(); 
		}
		
		questions[0].question="Who is known as father of Java Programming Language?";
		questions[0].option1="James Gosling";
		questions[0].option2="M. P Java";
		questions[0].option3="Charel Babbage";
		questions[0].option4="Blais Pascal";
		questions[0].correctAns=1;
			
		questions[1].question="Java language was initially called as ________";
		questions[1].option1="Sumatra";
		questions[1].option2="Oak";
		questions[1].option3="J++";
		questions[1].option4="Pine";
		questions[1].correctAns=2;
		
		questions[2].question="What is the full form of JVM ?";
		questions[2].option1="Java Very Large Machine";
		questions[2].option2="Java Virtual Machine";
		questions[2].option3="Java Verified Machine";
		questions[2].option4="Java Very Small Machine";
	    questions[2].correctAns=2;

	       
	}
	
	Player  p1 = new Player();
	
	public void start()
	{
		p1.getDetails();
		System.out.println();
		for (int i =0 ; i<questions.length;i++)
		{
			System.out.print(i+1+") ");
			boolean check=questions[i].askQuestion();
			if(check == true)
			{
				System.out.println("CORRECT");
				p1.score = p1.score+5;
			}
			else
			{
				System.out.println("INCORRECT");
				System.out.println("Answer : "+questions[i].correctAns);
			}
			System.out.println("===========================================");
		}
		System.out.println("\n"+p1.name+" your score is "+p1.score);
		
	}

}
