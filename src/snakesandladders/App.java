package snakesandladders;

import java.util.Scanner;

import static snakesandladders.SnakeAndLadder.*;

public class App {

    public static void main(String[] args) {
SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
            int player1 =0;
            int currentPlayer=1;
//            Scanner s = new Scanner(System.in);
//            String roll;

            int diceValue =0;
            do
            {
//                System.out.println("Enter 'roll' to play");
//                roll = s.next();
                diceValue = snakeAndLadder.rollADice();

                if(currentPlayer == 1)
                {
                    player1 = snakeAndLadder.getCurrentPosition(player1,diceValue);
                    if(snakeAndLadder.winPosition(player1))
                    {
                        System.out.println("You win!!");
                        return;
                    }
                    else{

                    }
                }
                currentPlayer = currentPlayer;

            }
            while(true);
    }
}
