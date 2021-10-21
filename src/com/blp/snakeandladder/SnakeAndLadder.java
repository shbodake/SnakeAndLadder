package com.blp.snakeandladder;

public class SnakeAndLadder {
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder program");
        int position = 0;
        while (position < WINNING_POSITION) {
            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("DiceNumber is : " + diceNumber);
            System.out.println("The Starting Position of Player is : " + position);
            System.out.println("Player Roll the Dice and get DiceNumber : " + diceNumber);

            int option = (int) (Math.floor(Math.random() * 10) % 2 + 1);

            switch (option) {
                case IS_LADDER:
                    System.out.println("Ladder for the Player");
                    position = position + diceNumber;
                    if (position > WINNING_POSITION){
                        System.out.println("No play in the Current Position");
                    }
                    break;
                case IS_SNAKE:
                    System.out.println("Snake for the player");
                    position = position - diceNumber;
                    if (position < 0){
                        position = 0;
                    }
                    break;
                default:
                    System.out.println("No Play for the Player");
                    position = position;
                    break;
            }
            System.out.println("Position is :" + position);
        }
    }
}
