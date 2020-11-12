package snakesandladders;

import java.util.Scanner;

import static snakesandladders.SnakeAndLadder.*;

public class App {

    public static void main(String[] args) {
            SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
            int player1 =0;
            int currentPlayer=1;
            Scanner s = new Scanner(System.in);
            String roll;

            int diceValue =0;
            do
            {
                System.out.print("Enter 'roll' to play or 'quit' to exit the game: ");
                roll=s.next();

                if (roll.equals("roll")){
                    diceValue = snakeAndLadder.rollADice();

                    if (currentPlayer == 1) {
                        player1 = snakeAndLadder.getCurrentPosition(player1, diceValue);
                        if (snakeAndLadder.winPosition(player1)) {
                            System.out.println("You win!!");
                            return;
                        }

                    }
                    currentPlayer = -currentPlayer;
                } else if(roll.equals("quit")) {
                    System.out.println("You have exited the game!!!");
                    System.exit(0);
                }else{
                    System.out.println("Please enter a valid command:");
                    System.out.println("                              ");
                    System.out.println("enter 'roll' to continue playing");
                    System.out.println("enter 'quit' to exit the game");
                    System.out.println("                               ");
                    continue;
                }

            }
            while(true);
    }
}
