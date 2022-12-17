import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 System.out.println("Welcome to the Capital Quiz! Good luck!");
		 System.out.println(); 
		
		
		String q1 = "What is the capital of Ohio?\n"
				  + "(a)Cleveland\n(b)Columbus\n(c)Cincinnati\n(d)Dallas\n";
		
		String q2 = "What is the capital of Nigeria?\n"
				  + "(a)Moscow\n(b)Lagos\n(c)Abuja\n(d)London\n";
		
		String q3 = "What is the capital of Japan?\n"
				  + "(a)Tokyo\n(b)Chicago\n(c)Dayton\n(d)Miami\n";
		
		String q4 = "What is the capital of Georgia?\n"
				  + "(a)Houston\n(b)Los Angeles\n(c)Athens\n(d)Atlanta\n";
		
		String q5 = "What is the capital of India?\n"
				  + "(a)Baghdad\n(b)New Dehli\n(c)Mumbai\n(d)Rome\n";
		
		Question [] questions = {
				new Question(q1, "b"),
				new Question(q2, "c"),
				new Question(q3, "a"),
				new Question(q4, "d"),
				new Question(q5, "b")
		};
		
		takeTest(questions); 

	}
	
	public static void takeTest(Question [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
				
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)) {
			 score ++;
			}
			
		}
		System.out.println("You got " + score + "/" + questions.length);
		System.out.println();
		
	   
	   System.out.println("Try again if you would like to!");
	
	}

}
