class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задача №1. Подсчет суммы четных и нечетных чисел\n");
        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10; 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\nЗадача №2. Вывод чисел в интервале между (max и min)\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if (num1 > num2) {
            maxNum = num1;
            minNum = num2;
        } else {
            maxNum = num2;
            minNum = num1;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        } else if (num3 < minNum) {
            minNum = num3;
        }
        System.out.print("Числа в интервале (" + maxNum + ", " + minNum + ") - ");
        for (i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача №3. Вывод реверсивного числа и суммы его цифр\n");
        int srcNum = 1234;
        int reverseNum = 0;
        int sumDigits = 0;
        while (srcNum != 0) {
            int digit = srcNum % 10;
            sumDigits += digit;
            reverseNum = reverseNum * 10 + digit;
            srcNum = srcNum / 10;
        }
        System.out.println("Исходное число в обратном порядке - " + reverseNum + ". Сумма его цифр - " +
                sumDigits);

        System.out.println("\nЗадача №4. Вывод чисел на консоль в несколько строк\n");
        int stringLenght = 5;
        for (i = 1; i < 24; i += 2) {
            stringLenght--;
            System.out.format("%3d", i);
            if (stringLenght == 0) {
                System.out.println();
                stringLenght = 5;
            }
        }
        for (i = stringLenght; i > 0; i--) {
            System.out.format("%3d", i - i);
        }

        System.out.print("\n\nЗадача №5. Проверка количества единиц на четность\n\n");
        srcNum = 3141591;
        int numberUnits = 0;
        System.out.print("Число " + srcNum + " содержит ");
        while (srcNum != 0) {
            int digit = srcNum % 10;
            if (digit == 1) {
                numberUnits += digit;
            }
            srcNum = srcNum / 10;
            if (srcNum == 0) {
                if (numberUnits % 2 != 0) {
                    System.out.print(numberUnits + " не четное");
                } else {
                    System.out.print(numberUnits + " четное");
                }
            }
        }
        System.out.println(" количество единиц.");
        
        System.out.print("\nЗадача №6. Отображение фигур в консоли\n\n");
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        i = 5;
        while (i != 0) {
            int j = i;
            while (j != 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i--;
        }
        
        System.out.println();
        i = 5;
        do {
            int j = 0;
            if (i > 2) {
                j = i;
            }
            if (i == 2) {
                j = 4;
            }
            if (i == 1) {
                j = 5;
            }
            do {
                System.out.print("$");
                j++;
            } while (j < 6);
            System.out.println();
            i--;
        } while(i != 0);

        System.out.print("\nЗадача №7. Отображение ASCII-символов\n\n");
        System.out.println("DEC CHAR");
        for (i = 0; i < 127; i++) {
            if (i >= 1 && i <= 47 && i % 2 != 0) {
                System.out.format("%3d", i);
                System.out.format("%5c%n", i);
            }
            if (i >= 97 && i <= 122 && i % 2 == 0) {
                System.out.format("%3d", i);
                System.out.format("%5c%n", i);
            }
        }

        System.out.print("\nЗадача №8. Проверка, является ли число палиндромом\n\n");
        int num = 1234321;
        srcNum = num;
        System.out.print("Число " + srcNum);
        reverseNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }
        if (srcNum == reverseNum) {
            System.out.println(" является палиндромом.");
        } else {
            System.out.println(" не является палиндромом.");
        }

        System.out.print("\nЗадача №9. Определение, является ли число счастливым\n\n");
        srcNum = 333441;
        int leftSum = 0;
        int rightSum = 0;
        for (i = 0; i < 2; i++) {
            int abc = 0;
            int sum = 0;
            if (i == 0) {
                abc = srcNum / 1000;
            }
            if (i == 1) {
                abc = srcNum % 1000;
            }
            System.out.print("Сумма цифр " + abc + " = ");
            while (abc != 0) {
                int digit = abc % 10;
                sum += digit;
                abc = abc / 10;
            }
            if (i == 0) {
                leftSum = sum;
            }
            if (i == 1) {
                rightSum = sum;
            }
            System.out.print(sum + ". ");
        }
        if (leftSum == rightSum) {
            System.out.println("Число счастливое.");
        } else {
            System.out.println("Число не счастливое.");
        }

        System.out.print("\nЗадача №10. Вывод таблицы умножения Пифагора\n\n");
        for (i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("   |");
            } else {
                System.out.print(i + "  |");
            }
            for (int j = 2; j < 10; j++) {
                System.out.format("%3d", j * i);
            }
            if (i == 1) {
                System.out.print("\n----------------------------");
            }
            System.out.print('\n');
        }
    }
}