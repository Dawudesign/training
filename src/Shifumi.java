import java.util.Random;
import java.util.Scanner;

public class Shifumi {

    public static int player() {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choice : (1) Rock, (2) Paper, (3) Scissor");
            System.out.println(" Make your selection");
            choice = scan.nextInt();
        } while (choice > 3 || choice < 1);
        return choice;
    }

    public static int opponent() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static String choice(int choice ){
        String weapon = null;
        switch (choice) {
            case 1 :
                weapon = "Rock";
                break;
            case 2 :
                weapon = "Paper";
                break;
            case 3 :
                weapon = "Scissor";
                break;
        }
        return weapon;
    }

    public static int round(int playerChoice, int opponentChoice) {
        int result = 0;
        System.out.println("Your choice is : " + choice(playerChoice));
        System.out.println("Choice of opponent : " + choice(opponentChoice));

        if (
                   playerChoice == 1 && opponentChoice == 3
                || playerChoice == 2 && opponentChoice == 1
                || playerChoice == 3 && opponentChoice == 2
        ){
            System.out.println("You win this round");
            result = 1;
        } else if (playerChoice == opponentChoice ){
            System.out.println("It's a draw ! No winner ");
        } else {
            System.out.println("Opponent win !");
            result = 2;
        }
        return result;
    }

    public static void main(String[] args) {

        int playerScores = 0;
        int opponentScore = 0;

        do {
            switch (round(player(), opponent())) {
                case 1:
                    playerScores++;
                    break;
                case 2:
                    opponentScore++;
                    break;
                default:
                    System.out.println("No scores");
            }
        } while (playerScores != 3 && opponentScore != 3 );
        System.out.println("Player scores: " + playerScores);
        System.out.println("Opponent scores : " + opponentScore);
    }
}
