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
        int productOne = 100;
        int productTwo = 200;
        float discountAmount = (productOne + productTwo) * 0.11f;
        float totalAmountDiscount = productOne + productTwo - discountAmount;
        System.out.println("Сумма скидки - " + discountAmount + " руб\n" + 
                "Общая стоимость товаров со скидкой - " + totalAmountDiscount + " руб");

        System.out.println("\nЗадача №3. Вывод на консоль слова JAVA.\n");
        char symbolOne = 'J';
        char symbolTwo = 'a';
        char symbolThree = 'v';
        char symbolFour = 'V';
        System.out.println("   " + symbolOne + "    " + symbolTwo + "  " + symbolThree + "     " +
                symbolThree + "  " + symbolTwo + "   " + "\n" +
                "   " + symbolOne + "   " + symbolTwo + " " + symbolTwo + "  " + symbolThree + "   " +
                symbolThree + "  " + symbolTwo + " " + symbolTwo + "  \n" +
                symbolOne + "  " + symbolOne + "  " + symbolTwo + symbolTwo + symbolTwo + symbolTwo
                + symbolTwo + "  " + symbolFour + " " + symbolFour + "  " + symbolTwo + symbolTwo +
                symbolTwo + symbolTwo + symbolTwo + " \n" +
                " " + symbolOne + symbolOne + "  " + symbolTwo + "     " + symbolTwo + "  " + symbolFour +
                "  " + symbolTwo + "     " + symbolTwo);

        System.out.println("\nЗадача №4. Отображение min и max значений числовых типов данных.\n");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("byte\nПервоначальное значение - " + maxByte + "\nЗначение после инкремента - "
                + (maxByte + 1) + "\nЗначение после декремента - " + (maxByte - 1) +
                "\nshort\nПервоначальное значение - " + maxShort + "\nЗначение после инкремента - "
                + (maxShort + 1) + "\nЗначение после декремента - " + (maxShort - 1) + 
                "\nint\nПервоначальное значение - " + maxInt + "\nЗначение после инкремента - "
                + (maxInt + 1) + "\nЗначение после декремента - " + (maxInt - 1) + 
                "\nlong\nПервоначальное значение - " + maxLong + "\nЗначение после инкремента - "
                + (maxLong + 1) + "\nЗначение после декремента - " + (maxLong - 1));

        System.out.println("\nЗадача №5. Перестановка значений переменных.\n");
        double firstVar = 1.1d;
        double secondVar = 2.2d;
        System.out.println("Перестановка значений переменных с помощью третьей переменной.\n" +
                "Исходные значения переменных: firstVar = " + firstVar + ", secondVar = " + secondVar);
        double tmp;
        tmp = firstVar;
        firstVar = secondVar;
        secondVar = tmp;
        System.out.println("Новые значения переменных: firstVar = " + firstVar + ", secondVar = " + secondVar +
                "\nПерестановка значений переменных с помощью арифметических операций.\n" +
                "Исходные значения переменных: firstVar = " + firstVar + ", secondVar = " + secondVar);
        firstVar = firstVar + secondVar;
        secondVar = firstVar - secondVar;
        firstVar = firstVar - secondVar;
        System.out.println("Новые значения переменных: firstVar = " + firstVar + ", secondVar = " + secondVar +
                "\nПерестановка значений переменных с помощью побитовой операции.\n" +
                "Исходные значения переменных: firstVar = " + firstVar + ", secondVar = " + secondVar);
        firstVar = (int) firstVar ^ (int) secondVar;
        secondVar = (int) firstVar ^ (int) secondVar;
        firstVar = (int) firstVar ^ (int) secondVar;
        System.out.println("Новые значения переменных: firstVar = " + (firstVar + 0.2) + ", secondVar = " + (secondVar + 0.1));

        System.out.println("\nЗадача №6. Вывод символов и их кодов.\n");
        int firstChar = 35;
        int secondChar = 38;
        int thirdChar = 64;
        int fourChar = 94;
        int fiveChar = 95;
        System.out.println("Код символа: " + firstChar + " - символ из ASCII-таблицы: " + (char) firstChar +
                "\nКод символа: " + secondChar + " - символ из ASCII-таблицы: " + (char) secondChar +
                "\nКод символа: " + thirdChar + " - символ из ASCII-таблицы: " + (char) thirdChar +
                "\nКод символа: " + fourChar + " - символ из ASCII-таблицы: " + (char) fourChar +
                "\nКод символа: " + fiveChar + " - символ из ASCII-таблицы: " + (char) fiveChar);

        System.out.println("\nЗадача №7. Произведение и сумма цифр числа.\n");
        int scrNum = 345;
        int digitOne = 345 / 100;
        int digitTwo = (345 / 10) % 10;
        int digitThree = 345 % 10;
        System.out.println("Сумма цифр числа - " + scrNum + " = " + (digitOne + digitTwo + digitThree) +
                "\nпроизведение цифр числа - " + scrNum + " = " + (digitOne * digitTwo * digitThree));

        System.out.println("\nЗадача №8. Вывод на консоль ASCII-арт Дюка.\n");
        char rightSlash = 47;
        char leftSlash = 92;
        char bottomLine = 95;
        char leftParenthesis = 40;
        char rightParenthesis = 41;
        char space = ' ';
        String firstLine = "" + space + space + space + space + rightSlash + leftSlash + space + space + space + space;
        String secondLine = "\n" + space + space + space + rightSlash + space + space + leftSlash + space + space + space;
        String thirdLine = "\n" + space + space + rightSlash + bottomLine + leftParenthesis + space + rightParenthesis + leftSlash + space + space;
        String fourLine = "\n" + space + rightSlash + space + space + space + space  + space + space + leftSlash + space;
        String fiveLine = "\n" + rightSlash + bottomLine + bottomLine + bottomLine + bottomLine + rightSlash + leftSlash + bottomLine + bottomLine +leftSlash;
        System.out.println(firstLine + secondLine + thirdLine + fourLine + fiveLine);

        System.out.println("\nЗадача №9. Отображение количества сотен, десятков и единиц числа.\n");
        int num = 123;
        int hundredsNum = num - (num % 100);
        int unitsNum = num % 10;
        int tensNum = num - hundredsNum - unitsNum;
        System.out.println("Число " + num + " содержит: \n" +
                hundredsNum + " сотен\n" +
                tensNum + " десятков\n" + 
                unitsNum + " единиц.");

        System.out.println("\nЗадача №10. Преобразование секунд.\n");
        int scrSec = 86399;
        int hour = scrSec / 3600;
        int min = (scrSec % 3600) / 60;
        int sec = (scrSec % 3600) % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}