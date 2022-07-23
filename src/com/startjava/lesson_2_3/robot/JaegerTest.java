package com.startjava.lesson_2_3.robot;

class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1.98f);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        System.out.println("Model name: " + jaegerOne.getModelName() + "\n" +
                "Mark: " + jaegerOne.getMark() + "\n" +
                "Origin: " + jaegerOne.getOrigin() + "\n" +
                "Height: " + jaegerOne.getHeight() + " m\n" +
                "Weight: " + jaegerOne.getWeight() + " tons\n" +
                "Strength: " + jaegerOne.getStrength() + "\n" +
                "Armor: " + jaegerOne.getArmor() + "\n");

        System.out.println("Drift: " + jaegerOne.drift());
        jaegerOne.move();
        System.out.println(jaegerOne.scanKaiju());
        jaegerOne.useAbility();

        System.out.println("\n+----------------------------+\n");

        Jaeger jaegerTwo = new Jaeger("Gipsy Avenger", "Mark-6", "USA", 81.77f, 2.004f, 9, 7);

        System.out.println("Model name: " + jaegerTwo.getModelName() + "\n" +
                "Mark: " + jaegerTwo.getMark() + "\n" +
                "Origin: " + jaegerTwo.getOrigin() + "\n" +
                "Height: " + jaegerTwo.getHeight() + " m\n" +
                "Weight: " + jaegerTwo.getWeight() + " tons\n" +
                "Strength: " + jaegerTwo.getStrength() + "\n" +
                "Armor: " + jaegerTwo.getArmor() + "\n");

        System.out.println("Drift: " + jaegerTwo.drift());
        jaegerTwo.move();
        System.out.println(jaegerTwo.scanKaiju());
        jaegerTwo.useAbility();
    }
}