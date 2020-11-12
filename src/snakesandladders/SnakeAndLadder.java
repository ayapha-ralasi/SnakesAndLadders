package snakesandladders;

import java.util.HashMap;
import java.util.Map;

public class SnakeAndLadder {
     int diceRoll;
     int currentPosition;
     final int WINNER=100;
     Map<Integer, Integer> snake = new HashMap<Integer, Integer>();
     Map<Integer,Integer>ladder = new HashMap<Integer, Integer>();

     public SnakeAndLadder(){
         snake.put(20, 2);
         snake.put(43, 6);
         snake.put(87, 27);
         snake.put(52, 45);
         snake.put(99, 23);

         ladder.put(4, 73);
         ladder.put(11, 33);
         ladder.put(30, 51);
         ladder.put(38, 80);
         ladder.put(55, 82);
     }

     public SnakeAndLadder(Object snake, Object ladder){

     }

    public  int rollADice(){
        int min = 1;
        int max = 6;
        int range = max - min +1;
        for (int i = 0; i<= 6; i++){
            diceRoll = (int)(Math.random()*range)+min;
        }
        System.out.println("You have rolled a: " + diceRoll);
        return diceRoll;
    }

    public  int getCurrentPosition(int playerPosition, int diceValue){
//        diceValue= rollADice();

        playerPosition = playerPosition +diceValue;

        if(playerPosition > WINNER)
        {
            playerPosition = playerPosition - diceValue;
            return playerPosition;
        }

        if(snake.get(playerPosition) != null)
        {
            System.out.println("oopsie!! You have been swallowed by a snake");
            playerPosition= snake.get(playerPosition);
        }

        if(ladder.get(playerPosition)!=null)
        {
            System.out.println("Hooray!! Up the ladder you go!!");
            playerPosition= ladder.get(playerPosition);
        }
        System.out.println("You are on position: " + playerPosition);
        return playerPosition;
    }

    public  boolean winPosition(int player)
    {
        return WINNER == player;
    }



}
