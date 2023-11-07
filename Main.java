import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    int questionNumber;
    String[] questions = {"C", "Answer 2"};
    String[] answers = {"A: If the should is wide enough to accomodate your vechile. \nB: If the vehicle ahead of you is tunring left. \nC: Under no circumstances.", "A: 1   \nB: 2 \nC: 3   \nD: 4"};
    char[] correctAnswerId = {'A', 'B', 'C'};
    int i;
    int questionsleft = 2;

    for (i = 0; i < questionsleft; i++) {
        System.out.println(Colors.ORANGE() + "Question " + (i + 1) + ": " + questions[i] + "?" + Colors.RESET() + "\n" + answers[i] + Colors.ORANGE());
        char userAnswer = input.next().charAt(0);
        if(correctAnswerId[i] == userAnswer){
            System.out.println(Colors.GREEN() + "Correct!" + Colors.RESET());
        } else {
            System.out.println(Colors.RED() + "Sorry, Incorrect!" + Colors.RESET());
        }
    }
    }
}
