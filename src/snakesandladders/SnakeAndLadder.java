import java.util.HashMap;
import java.util.Map;

public class SnakeAndLadder {
    static int diceRoll;
    static int currentPosition;
    static final int WINNER=100;
    static Map<Integer, Integer> snake = new HashMap<Integer, Integer>();

    {
        snake.put(20, 2);
        snake.put(43, 6);
        snake.put(87, 27);
        snake.put(52, 45);
        snake.put(99, 23);
    }
    static Map<Integer,Integer>ladder = new HashMap<Integer, Integer>();

    {
        ladder.put(4, 73);
        ladder.put(11, 33);
        ladder.put(30, 51);
        ladder.put(38, 80);
        ladder.put(55, 82);
    }

    public static int rollADice(){
        int min = 1;
        int max = 6;
        int range = max - min +1;
        for (int i = 0; i<= 6; i++){
            diceRoll = (int)(Math.random()*range)+min;
        }
        System.out.println("You have rolled a: " + diceRoll);
        return diceRoll;
    }

    public static int getCurrentPosition(int playerPosition, int diceValue){
        diceValue= rollADice();

        playerPosition = playerPosition +diceValue;

        if(playerPosition > WINNER)
        {
            playerPosition = playerPosition - diceValue;
            return playerPosition;
        }

        if(null!= snake.get(playerPosition))
        {
            System.out.println("oopsie!! You have been swallowed by a snake");
            playerPosition= snake.get(playerPosition);
        }

        if(null!=ladder.get(playerPosition))
        {
            System.out.println("Hooray!! Up the ladder you go!!");
            playerPosition= ladder.get(playerPosition);
        }
        System.out.println("You are on position " + playerPosition);
        return playerPosition;
    }




}
