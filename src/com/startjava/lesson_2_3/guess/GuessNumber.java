package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        int guessNum = (int) (Math.random() * 100 + 1);
        System.out.println("Компьютер загадал число - " + guessNum);
        while (true) {
            String name = playerOne.getName();
            System.out.print("Игрок " + name + " введите число от 1 до 100 - ");
            int num = scanner.nextInt();
            if (num == guessNum) {
                System.out.println("Победил игрок - " + name + "!");
                break;
            }
            if (num < guessNum) {
                System.out.println(name + " ваше число " + num + " меньше чем загадал компьютер!");
            } else if (num > guessNum) {
                System.out.println(name + " ваше число " + num + " больше чем загадал компьютер!");
            }

            name = playerTwo.getName();
            System.out.print("Игрок " + name + " введите число от 1 до 100 - ");
            num = scanner.nextInt();
            if (num == guessNum) {
                System.out.println("Победил игрок - " + name + "!");
                break;
            }
            if (num < guessNum) {
                System.out.println(name + " ваше число " + num + " меньше чем загадал компьютер!");
            } else if (num > guessNum) {
                System.out.println(name + " ваше число " + num + " больше чем загадал компьютер!");
            }
        }
    }
}