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
            System.out.print("Игрок " + playerOne.getName() + " введите число от 1 до 100 - ");
            int playerOneNum = scanner.nextInt();
            if (playerOneNum == guessNum) {
                System.out.println("Победил игрок - " + playerOne.getName() + "!");
                break;
            } else if (playerOneNum < guessNum) {
                System.out.println(playerOne.getName() + " ваше число " + playerOneNum + " меньше чем загадал компьютер!");
            } else if (playerOneNum > guessNum) {
                System.out.println(playerOne.getName() + " ваше число " + playerOneNum + " больше чем загадал компьютер!");
            }

            System.out.print("Игрок " + playerTwo.getName() + " введите число от 1 до 100 - ");
            int playerTwoNum = scanner.nextInt();
            if (playerTwoNum == guessNum) {
                System.out.println("Победил игрок - " + playerTwo.getName() + "!");
                break;
            } else if (playerTwoNum < guessNum) {
                System.out.println(playerTwo.getName() + " ваше число " + playerTwoNum + " меньше чем загадал компьютер!");
            } else if (playerTwoNum > guessNum) {
                System.out.println(playerTwo.getName() + " ваше число " + playerTwoNum + " больше чем загадал компьютер!");
            }
        }
    }
}