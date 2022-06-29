class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Female";
        wolfOne.nickname = "Blood";
        wolfOne.weight = 12.4f;
        wolfOne.age = 4;
        wolfOne.color = "White";
        System.out.println("Gender of the wolf - " + wolfOne.gender +
                "\nWolf nickname - " + wolfOne.nickname +
                "\nWolf weight - " + wolfOne.weight + " kg" +
                "\nAge of the wolf - " + wolfOne.age +
                "\nWolf color - " + wolfOne.color + "\n");

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunting();
    }

}