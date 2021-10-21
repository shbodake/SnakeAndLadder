package com.blp.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder program");
        int position = 0;
        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("The Starting Position of Player is : " + position);
        System.out.println("Player Roll the Dice and get DiceNumber : " + diceNumber);
    }
}
