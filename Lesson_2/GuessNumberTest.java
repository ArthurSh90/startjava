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
        String playerResponse;

        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playerResponse = scanner.next().toLowerCase();
            } while(!(playerResponse.equals("yes") || playerResponse.equals("no")));
        } while(playerResponse.equals("yes"));
    }
}