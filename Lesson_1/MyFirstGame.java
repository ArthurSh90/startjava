class MyFirstGame {
    public static void main(String[] args) {
        int playerNum = 76;
        int guessNum = 76;
        for (int i = 1; i <= 100; i++) {
            if (playerNum == guessNum) {
                System.out.println("Вы победили!");
                break;
            } else if (playerNum > guessNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер.");
                playerNum--;
            } else if (playerNum < guessNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер.");
                playerNum++;
            }
        }
    }
}