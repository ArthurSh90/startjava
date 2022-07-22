import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра угадай число.");
        System.out.print("Первый игрок введите свое имя - ");
        Player playerOne = new Player(scanner.next());
        System.out.print("Второй игрок введите свое имя - ");
        Player playerTwo = new Player(scanner.next());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        String userResponse;

        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                userResponse = scanner.next();
            } while(!(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("no")));
        } while(userResponse.equalsIgnoreCase("yes"));
    }
}