// Quiz time
package quiz_app;

import java.util.Scanner;

public class Quiz_app {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("------------------------------------------Welcome to the Quiz App!-------------------------------------");
        System.out.print("Enter the quiz title: ");
        String quiz_title = scn.nextLine();

        System.out.print("\nHow many questions do you want to add? --> ");
        int num_ques = scn.nextInt();
        scn.nextLine(); // Consume newline

        // Initialize arrays to store questions, options, and correct answers
        String[] questions = new String[num_ques];
        String[][] options = new String[num_ques][4];
        char[] correct_answers = new char[num_ques];

        // Collect quiz data
        for (int i = 0; i < num_ques; i++) {
            System.out.println("\nQuestion " + (i + 1)+"-:");
            System.out.print("Enter the question---> ");
            questions[i] = scn.nextLine();

            System.out.println("Enter options (A, B, C, D):");
            for (int j = 0; j < 4; j++) {
                System.out.print((char) ('A' + j) + ": ");
                options[i][j] = scn.nextLine();
            }

            System.out.print("Enter the correct answer (A/B/C/D): ");
            correct_answers[i] = scn.nextLine().toUpperCase().charAt(0);
        }
        System.out.println("\n------------------------------------------Quiz saved successfully------------------------------------------");
        // Take the quiz
        System.out.println("--------------------------------------------Let's begin the quiz!!------------------------------------------");
        
        int score = 0;
        for (int i = 0; i < num_ques; i++) {
            System.out.println("\nQuestion " + (i + 1)+"-:"+ questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println((char) ('A' + j) + ". " + options[i][j]);
            }
            System.out.print("Your choice (A/B/C/D): ");
            char userAnswer = scn.nextLine().toUpperCase().charAt(0);
            if (userAnswer == correct_answers[i]) {
                score++;
            }
        }

        System.out.println("\n------------------------------------------Quiz completed!!!------------------------------------------");
        System.out.println("                                           Your score: " + score + "/" + num_ques);
        if (score == num_ques) {
            System.out.println("Bravo, you have answered all the questions correctly.");
        }
        else if(score == 0){
            System.out.println("Oops! all the answers are wrong.");
        }
        else{
            System.out.println("Nice try! but there is a scope of improvement.");
        }

    }
}

