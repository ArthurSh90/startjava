package com.startjava.lesson_2_3.animal;

class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Male");
        wolfOne.setNickname("Starkiller");
        wolfOne.setWeight(14.2f);
        wolfOne.setAge(9);
        wolfOne.setColor("Black");

         System.out.println("Gender of the wolf - " + wolfOne.getGender() + "\n" +
                "Wolf nickname - " + wolfOne.getNickname() + "\n" +
                "Wolf weight - " + wolfOne.getWeight() + " kg" + "\n" +
                "Age of the wolf - " + wolfOne.getAge() + " years" + "\n" +
                "Wolf color - " + wolfOne.getColor() + "\n");

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunting();
    }

}