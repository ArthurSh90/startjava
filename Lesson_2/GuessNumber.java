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
            String playerOneName = playerOne.getName();
            System.out.print("Игрок " + playerOneName + " введите число от 1 до 100 - ");
            int num = scanner.nextInt();
            if (num == guessNum) {
                System.out.println("Победил игрок - " + playerOneName + "!");
                break;
            }
            if (num < guessNum) {
                System.out.println(playerOneName + " ваше число " + num + " меньше чем загадал компьютер!");
            } else if (num > guessNum) {
                System.out.println(playerOneName + " ваше число " + num + " больше чем загадал компьютер!");
            }

            String playerTwoName = playerTwo.getName();
            System.out.print("Игрок " + playerTwoName + " введите число от 1 до 100 - ");
            num = scanner.nextInt();
            if (num == guessNum) {
                System.out.println("Победил игрок - " + playerTwoName + "!");
                break;
            }
            if (num < guessNum) {
                System.out.println(playerTwoName + " ваше число " + num + " меньше чем загадал компьютер!");
            } else if (num > guessNum) {
                System.out.println(playerTwoName + " ваше число " + num + " больше чем загадал компьютер!");
            }
        }
    }
}