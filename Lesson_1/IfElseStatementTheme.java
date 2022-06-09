public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Задача №1. Перевод псевдокода на язык Java\n");
        int age = 21;
        if (age > 20) {
            System.out.println("Доступ разрешен!");
        } else {
            System.out.println("Доступ Запрещен!");
        }
        char male = 'f';
        boolean isMaleGender = male == 'm';
        if (!isMaleGender) System.out.println("Вы женщина");
        double manHeight = 1.75d;
        if (manHeight < 1.80) {
            System.out.println("Вы ниже 180 см");
        } else {
            System.out.println("Вы выше 180 см");
        }
        String name = "Mark";
        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква вашего имени - " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква вашего имени - " + firstLetterName);
        } else {
            System.out.println("Какая-то другая буква");
        }

        System.out.println("\nЗадача №2. Поиск max и min числа\n");
        int num1 = 1;
        int num2 = 2;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " максимальное. Число " + num2 + " минимальное.");
        } else {
            System.out.println("Число " + num2 + " максимальное. Число " + num1 + " минимальное.");
        }

        System.out.println("\nЗадача №3. Работа с числом\n");
        int num = -3;
        if (num == 0) {
            System.out.println("Число = " + num);
        } else {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " четное");
            } else {
                System.out.println("Число " + num + " нечетное");
            }
            if (num > 0) {
                System.out.println("Число " + num + " положительное");
            } else {
                System.out.println("Число " + num + " отрицательное");
            }
        }

        System.out.println("\nЗадача №4. Поиск одинаковых цифр в числах\n");
        int numN = 443;
        int aNumN = numN / 100;
        int bNumN = (numN % 100) / 10;
        int cNumN = numN % 10;
        int numM = 133;
        int aNumM = numM / 100;
        int bNumM = (numM % 100) / 10;
        int cNumM = numM % 10;
        if (aNumN == aNumM && bNumN == bNumM && cNumN == cNumM) {
            System.out.println("В числах " + numN + " и " + numM + " цифры: " + aNumN + ", " + bNumN + ", " + cNumN +
                    " состоят в 1, 2, 3 разрядах.");
        } else if (aNumN == aNumM && bNumN == bNumM) {
            System.out.println("В числах " + numN + " и " + numM + " цифры: " + aNumN + ", " + bNumN +
                    " состоят в 1, 2 разрядах.");
        } else if (bNumN == bNumM && cNumN == cNumM) {
            System.out.println("В числах " + numN + " и " + numM + " цифры: " + bNumN + ", " + cNumN +
                    " состоят во 2 и 3 разрядах.");
        } else if (aNumN == aNumM && cNumN == cNumM) {
            System.out.println("В числах " + numN + " и " + numM + " цифры: " + aNumN + ", " + cNumN +
                    " состоят в 1 и 3 разрядах.");
        } else if (aNumN == aNumM) {
            System.out.println("В числах " + numN + " и " + numM + " цифра: " + aNumN +
                    " состоят в 1 разряде.");
        } else if (bNumN == bNumM) {
            System.out.println("В числах " + numN + " и " + numM + " цифра: " + bNumN +
                    " состоят во 2 разряде.");
        } else if (cNumN == cNumM) {
            System.out.println("В числах " + numN + " и " + numM + " цифра: " + cNumN +
                    " состоят в 3 разряде.");
        } else {
            System.out.println("Нет совпадений");
        }

        System.out.println("\nЗадача №5. Определение буквы, числа или символа по их коду\n");
        char charW = '\u0057';
        if (charW >= '\u0041' && charW <= '\u005A' || charW >= '\u0061' && charW <= '\u007A') {
            System.out.println("Маленькая (большая) буква");
        } else if (charW >= '\u0030' && charW <= '\u0039') {
            System.out.println("Это число");
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\nЗадача №6. Определение суммы вклада и начисленных банком %\n");
        int depositAmount = 300000;
        if (depositAmount < 100000) {
            double percentAccrued = depositAmount * 0.05;
            System.out.println("Сумма вклада = " + depositAmount + ", начисленный процент = " +
                 percentAccrued + ", итоговая сумма = " + (depositAmount + percentAccrued));
        } else if (depositAmount >= 100000 && depositAmount < 300000) {
            double percentAccrued = depositAmount * 0.07;
            System.out.println("Сумма вклада = " + depositAmount + ", начисленный процент = " +
                 percentAccrued + ", итоговая сумма = " + (depositAmount + percentAccrued));
        } else if (depositAmount >= 300000) {
            double percentAccrued = depositAmount * 0.1;
            System.out.println("Сумма вклада = " + depositAmount + ", начисленный процент = " +
                 percentAccrued + ", итоговая сумма = " + (depositAmount + percentAccrued));
        }

        System.out.println("\nЗадача №7. Определение оценки по предметам\n");
        int historyGrade = 59;
        int grade1 = 0;
        if (historyGrade <= 60) {
            grade1 = 2;
        } else if (historyGrade > 60 && historyGrade <= 73) {
            grade1 = 3;
        } else if (historyGrade > 73 && historyGrade <= 91) {
            grade1 = 4;
        } else if (historyGrade > 91) {
            grade1 = 5;
        }
        int programmingGrade = 91;
        int grade2 = 0;
        if (programmingGrade <= 60) {
            grade2 = 2;
        } else if (programmingGrade > 60 && programmingGrade <= 73) {
            grade2 = 3;
        } else if (programmingGrade > 73 && programmingGrade <= 91) {
            grade2 = 4;
        } else if (programmingGrade > 91) {
            grade2 = 5;
        }
        System.out.println(grade1 + " по истории, " + grade2 + " по программированию. Средний бал оценок по предметам - " +
                ((grade1 + grade2) / 2) + ". Средний % по предметам - " + ((historyGrade + programmingGrade) / 2) + "%");

        System.out.println("\nЗадача №8. Расчет прибыли\n");
        int roomRent = 5000;
        int revenueAverage = 13000;
        int costGoods = 9000;
        int profitYear = (revenueAverage - (roomRent + costGoods)) * 12;
        if (profitYear > 0) {
            System.out.println("+" + profitYear);
        } else {
            System.out.println(profitYear);
        }

        System.out.println("\nЗадача №9. Подсчет количества банкнот\n");
        int amount = 567;
        int denomination1 = 1;
        int denomination10 = 10;
        int denomination100 = 100;
        int selectDenomination = 10;
        if (selectDenomination == denomination1) {
            int numberBanknotes1 = amount / denomination1;
            System.out.println("Номинал банкнот - " + denomination1 + "$, требуемое количество банкнот - " + numberBanknotes1 +
                    ", исходная сумма - " + (numberBanknotes1 * denomination1) + "$");
        } else if (selectDenomination == denomination10) {
            int balanceBanknotes10 = 5;
            int numberBanknotes100 = (amount - (denomination10 * balanceBanknotes10)) / 100;
            int numberBanknotes1 = ((amount - (denomination10 * balanceBanknotes10)) % 100) / denomination1;
            System.out.println("Номинал банкнот - " + denomination10 + "$, требуемое количество банкнот - " + balanceBanknotes10 +
                ", номинал банкнот - " + denomination100 + "$, требуемое количество банкнот - " + numberBanknotes100 + 
                ", номинал банкнот - " + denomination1 + "$, требуемое количество банкнот - " + numberBanknotes1 +
                ". Исходная сумма - " + ((numberBanknotes1 * denomination1) + (numberBanknotes100 * denomination100) + (balanceBanknotes10 * denomination10)) + "$");
        } else if (selectDenomination == denomination100) {
            int numberBanknotes100 = amount / 100;
            int numberBanknotes1 = (amount % 100) / denomination1;
            System.out.println("Номинал банкнот: " + denomination100 + "$ требуемое количество банкнот - " + numberBanknotes100 +
                    ", номинал банкнот: " + denomination1 + "$ требуемое количество банкнот - " + numberBanknotes1 + ". Исходная сумма - " +
                    ((denomination1 * numberBanknotes1) + (denomination100 * numberBanknotes100)) + "$");
        }
    }
}