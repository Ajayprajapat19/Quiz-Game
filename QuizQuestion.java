import java.util.Scanner;
public class QuizQuestion {
    Scanner sc = new Scanner(System.in);
    Question[] questions = new Question[5];
    
    QuizQuestion(){
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2, "What is the capital of Germany?", "Paris", "London", "Berlin", "Madrid", "Berlin");
        questions[2] = new Question(3, "What is the capital of Spain?", "Paris", "London", "Berlin", "Madrid", "Madrid");           
        questions[3] = new Question(4, "What is the capital of Italy?", "Rome", "London", "Berlin", "Madrid", "Rome");
        questions[4] = new Question(5, "What is the capital of UK?", "Paris", "London", "Berlin", "Madrid", "London");
        
    }
    
    public void Playquiz(){
        int count=0;
        for(Question q : questions){

            System.out.println("Question ID :" + q.getId() + "\n" + q.getQuestion() + "\n" + "Option 1 : " + q.getOpt1() + "\n" + "Option 2 : " + q.getOpt2() + "\n" + "Option 3 : " + q.getOpt3() +"\n" + "Option 4 : " + q.getOpt4() );
            System.out.println();
            System.out.println("Enter your answer: ");
            String userAnswer = sc.nextLine();
            if(userAnswer.equalsIgnoreCase(q.getAns())){

                System.out.println("Correct answer ");
                count++;
            }else{
                System.out.println("Wrong answer");
            }
        }

        System.out.println("Your Total score is :" + count + "/"+ questions.length);
    }
}
