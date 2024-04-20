package hexlet.code.games;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOrOdd {
    private static final Scanner scanner = new Scanner(System.in);
    private String userName;

    public EvenOrOdd(String userName) {
        this.userName = userName;
    }

    public void loop() {
        var count = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        while (count < 3) {
            var randomNumber = getRandomNumber();

            askUser(randomNumber);
            var userAnswer = scanner.next();
            System.out.println();

            var correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            if (correctAnswer.equals(userAnswer)) {
                count += 1;
                System.out.println("Correct!");
            } else {
                printWrongMessage(userAnswer, correctAnswer);
                return;
            }
        }

        System.out.println("Congratulations, " + userName);
        scanner.close();
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    private static void askUser(int num) {
        System.out.println("Question: " + num);
        System.out.print("Your answer: ");
    }

    private void printWrongMessage(String userAnswer, String correctAnswer) {
        System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
        System.out.println("Let's try again, " + userName);
    }
}
