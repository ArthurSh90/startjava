class MyFirstGame {
    public static void main(String[] args) {
        int player = 76;
        int guessNum = 76;
        for (int i = 1; i <= 100; i++) {
            if (player == guessNum) {
                System.out.println("Вы победили!");
                break;
            } else if (player > guessNum) {
                System.out.println("Число " + player + " больше того, что загадал компьютер.");
                player--;
            } else if (player < guessNum) {
                System.out.println("Число " + player + " меньше того, что загадал компьютер.");
                player++;
            }
        }
    }
}