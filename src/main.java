import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);
        int userInput1 = 0;
        int userInput2 = 0;
        int round = 0;
        int player1 = 0;
        int player2 = 0;
        int draws = 0;
        double player1Percentage = 0;
        double player2Percentage = 0;
        double drawPercentage = 0;

        System.out.println("How many rounds do you want to play");
        round = kb.nextInt();
        for(int i=1;i<=round;i++){
            System.out.println("\n");
            System.out.println("It is round " + i);
            int num = 1+rand.nextInt(10);
            while(num!= userInput1 && num != userInput2){
                System.out.println("Player 1: ");
                userInput1 = kb.nextInt();
                System.out.println("Player 2: ");
                userInput2 = kb.nextInt();
                if(num!=userInput1 && num!=userInput2){
                    System.out.println("They are both wrong");
                }
            }
            if(num==userInput1 && num!=userInput2){
                System.out.println(num + " is the right number");
                System.out.println("Player 1 won the round");
                player1++;
            }
            if(num==userInput2 && num!=userInput1){
                System.out.println(num + " is the right number");
                System.out.println("Player 2 won the round");
                player2++;
            }
            if(userInput1==userInput2){
                System.out.println(num + " is the right number");
                System.out.println("Draw");
                draws++;
            }
        }
        player1Percentage = ((double)player1/round)*100.00;
        player2Percentage = ((double)player2/round)*100.00;
        drawPercentage = ((double)draws/round)*100.00;
        System.out.println("\n");
        System.out.println("**************************************");
        System.out.println("After " + round + " rounds ");
        System.out.println("Player 1 Wins: " + player1);
        System.out.println("Player 2 Wins: " + player2);
        System.out.println("Draws: " + draws);
        System.out.printf("Player 1 Win Ratio: %2.2f Percentage\n", player1Percentage);
        System.out.printf("Player 2 Win Ratio: %2.2f Percentage\n", player2Percentage);
        System.out.printf("Draw Ratio: %2.2f Percentage\n", drawPercentage);
        System.out.println("**************************************");
    }
}
