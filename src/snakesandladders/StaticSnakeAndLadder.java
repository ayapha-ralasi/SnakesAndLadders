package snakesandladders;

public class StaticSnakeAndLadder {
    public static void main(String[] args) {


       SnakeAndLadder snakeAndLadder = new SnakeAndLadder();

        int position = snakeAndLadder.getCurrentPosition(0,4);
        position = snakeAndLadder.getCurrentPosition(position,snakeAndLadder.rollADice());
        System.out.println(position);
    }
}
