package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задача №1. Создание переменных и вывод их значений на консоль.\n");
        byte ram = 16;
        short ssd = 512;
        int cpuCore = 6;
        long cpuThreads = 12;
        float baseClockSpeed = 3.3f;
        double boostCloackSpeed = 4.2d;
        char manufacturerCPU1 = 97;
        char manufacturerCPU2 = 109;
        char manufacturerCPU3 = 100;
        boolean isLaptop = true;
        System.out.println("Характеристики ПК:\n" +
                "Оперативная память - " + ram + " Гб\n" +
                "Объем SSD - " + ssd + " Гб\n" +
                "Количество ядер процессора - " + cpuCore + "\n" +
                "Количество поток процессора - " + cpuThreads + "\n" +
                "Базовая частота процессора - " + baseClockSpeed + " ГГц\n" +
                "Максимальная частота процессора - " + boostCloackSpeed + " ГГц\n" + 
                "Производитель процессора - " + manufacturerCPU1 + "" + manufacturerCPU2 + "" + manufacturerCPU3 + "\n" +
                "Это ноутбук? - " + isLaptop);

        System.out.println("\nЗадача №2. Расчет стоимости товара со скидкой.\n");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        float discountAmount = (priceGoodsX + priceGoodsY) * 0.11f;
        float discountPrice = priceGoodsX + priceGoodsY - discountAmount;
        System.out.println("Сумма скидки - " + discountAmount + " руб\n" + 
                "Общая стоимость товаров со скидкой - " + discountPrice + " руб");

        System.out.println("\nЗадача №3. Вывод на консоль слова JAVA.\n");
        char charJ = 'J';
        char charA = 'a';
        char charV = 'v';
        char charUppercaseV = 'V';
        System.out.println("   " + charJ + "    " + charA + "  " + charV + "     " +
                charV + "  " + charA + "   " + "\n" +
                "   " + charJ + "   " + charA + " " + charA + "  " + charV + "   " +
                charV + "  " + charA + " " + charA + "  \n" +
                charJ + "  " + charJ + "  " + charA + charA + charA + charA
                + charA + "  " + charUppercaseV + " " + charUppercaseV + "  " + charA + charA +
                charA + charA + charA + " \n" +
                " " + charJ + charJ + "  " + charA + "     " + charA + "  " + charUppercaseV +
                "  " + charA + "     " + charA);

        System.out.println("\nЗадача №4. Отображение min и max значений числовых типов данных.\n");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("byte\nПервоначальное значение - " + maxByte + "\nЗначение после инкремента - "
                + ++maxByte + "\nЗначение после декремента - " + --maxByte +
                "\nshort\nПервоначальное значение - " + maxShort + "\nЗначение после инкремента - "
                + ++maxShort + "\nЗначение после декремента - " + --maxShort + 
                "\nint\nПервоначальное значение - " + maxInt + "\nЗначение после инкремента - "
                + ++maxInt + "\nЗначение после декремента - " + --maxInt + 
                "\nlong\nПервоначальное значение - " + maxLong + "\nЗначение после инкремента - "
                + ++maxLong + "\nЗначение после декремента - " + --maxLong);

        System.out.println("\nЗадача №5. Перестановка значений переменных.\n");
        double num1 = 1.1d;
        double num2 = 2.2d;
        System.out.println("Перестановка значений переменных с помощью третьей переменной.\n" +
                "Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        double tmp;
        tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2 +
                "\nПерестановка значений переменных с помощью арифметических операций.\n" +
                "Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2 +
                "\nПерестановка значений переменных с помощью побитовой операции.\n" +
                "Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        int intNum1 = (int) num1;
        double fractNum1 = num1 - intNum1;
        int intNum2 = (int) num2;
        double fractNum2 = num2 - intNum2;
        intNum1 = intNum1 ^ intNum2;
        intNum2 = intNum1 ^ intNum2;
        intNum1 = intNum1 ^ intNum2;
        tmp = fractNum1;
        fractNum1 = fractNum2;
        fractNum2 = tmp;
        num1 = intNum1 +fractNum1;
        num2 = intNum2 +fractNum2;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\nЗадача №6. Вывод символов и их кодов.\n");
        int char35 = 35;
        int char38 = 38;
        int char64 = 64;
        int char94 = 94;
        int char95 = 95;
        System.out.println("Код символа: " + char35 + " - символ из ASCII-таблицы: " + (char) char35 +
                "\nКод символа: " + char38 + " - символ из ASCII-таблицы: " + (char) char38 +
                "\nКод символа: " + char64 + " - символ из ASCII-таблицы: " + (char) char64 +
                "\nКод символа: " + char94 + " - символ из ASCII-таблицы: " + (char) char94 +
                "\nКод символа: " + char95 + " - символ из ASCII-таблицы: " + (char) char95);

        System.out.println("\nЗадача №7. Произведение и сумма цифр числа.\n");
        int scrNum = 345;
        int digitOne = scrNum / 100;
        int digitTwo = (scrNum / 10) % 10;
        int digitThree = scrNum % 10;
        System.out.println("Сумма цифр числа - " + scrNum + " = " + (digitOne + digitTwo + digitThree) +
                "\nпроизведение цифр числа - " + scrNum + " = " + (digitOne * digitTwo * digitThree));

        System.out.println("\nЗадача №8. Вывод на консоль ASCII-арт Дюка.\n");
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char openBracket = '(';
        char closeBracket = ')';
        char space = ' ';
        String firstLine = "" + space + space + space + space + slash + backslash + space + space + space + space;
        String secondLine = "\n" + space + space + space + slash + space + space + backslash + space + space + space;
        String thirdLine = "\n" + space + space + slash + underline + openBracket + space + closeBracket + backslash + space + space;
        String fourLine = "\n" + space + slash + space + space + space + space  + space + space + backslash + space;
        String fiveLine = "\n" + slash + underline + underline + underline + underline + slash + backslash + underline + underline +backslash;
        System.out.println(firstLine + secondLine + thirdLine + fourLine + fiveLine);

        System.out.println("\nЗадача №9. Отображение количества сотен, десятков и единиц числа.\n");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = (srcNum % 100) / 10;
        int ones = srcNum % 10;
        System.out.println("Число " + srcNum + " содержит: \n" +
                hundreds + " сотню\n" +
                tens + " десятка\n" + 
                ones + " единицы");

        System.out.println("\nЗадача №10. Преобразование секунд.\n");
        int scrSec = 86399;
        int hour = scrSec / 3600;
        int min = (scrSec % 3600) / 60;
        int sec = (scrSec % 3600) % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}