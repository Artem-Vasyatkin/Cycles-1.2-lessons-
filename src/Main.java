public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //test 1
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
        //test 2
        System.out.println("\n");

        int salary3 = 65535;
        int total3 = 0;
        for (; total3 < 1_000_000; ) {
            total3 = total3 + total3 / 100;
            total3 = total3 + salary3;
            System.out.println(total3);
        }
        //test 3
        System.out.println("\n");

        int salary2 = 65535;
        int total2 = 0;
        while (total2 < 1_000_000) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            System.out.println(total2);
        }
        //test 4.1
        System.out.println("\n");

        int days = 10;

        if (days == 0) {
            System.out.println("Желаем приятной поездки.");
        } else {
            while (days > 0) {
                days--;
                System.out.println("До конца поездки "
                        + days + " дней.");
            }
            System.out.println("Путеществие окончено. " +
                    "Пора возвращаться домой.");
        }
        //test 4.2
        System.out.println("\n");

        int days1 = 10;
        if (days1 == 0) {
            System.out.println("Желаем приятной поездки.");
        } else {
            for (int i = 10; i >= 0; i--) {
                System.out.println("До конца поездки "
                        + i + " дней.");
            }
            System.out.println("Путеществие окончено. " +
                    "Пора возвращаться домой.");
        }
        //test 5
        System.out.println("\n");

        int salary1 = 65535;
        int total1 = 0;
        int z = 0;
        for (; total1 < 1_000_000; z++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            if (z % 5 == 0) {
                System.out.println("Месяц " + z +
                        " Итого " + total1);
            }
        }
        System.out.println(total2);

        //test 6
        System.out.println("\n");

        int start1 = 5;
        do {
            System.out.println(start1);
            start1 = start1 - 1;
        }
        while (start1 > 0);

        //test 7
        System.out.println("\n");

        int userWantsContinue = 1;
        int level = 1;
        do {
            System.out.println("Завершен уровень "
                    + level);
            System.out.println("Хотете продолжить?");
            level++;
        } while (userWantsContinue == 1 && level <= 5);

        //test 8
        System.out.println("\n");

        int points = 10;

        do {
            System.out.println("Осталось " + points +
                    " баллов.");
            points--;
        } while (points >= 0);

        System.out.println("Игра окнченна!");

        System.out.println("\nHomework!");
        System.out.println("Task №1");

        int salary = 0;
        int total = 1;
        while (salary < 2_459_000) {
            salary += 15000;
            System.out.println("Месяц " + total + " сумма накоплений " +
                    "равна " + salary + " рублей.");
            total++;
        }

        System.out.println("\nTask №2");

        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(x + " ");
        }
        System.out.println();
        for (; x > 0; x--) {
            System.out.print(x + " ");
        }

        System.out.println("\nTask №3");

        int populationY = 12_000_000;
        int fertility;
        int mortality;
        for (int a = 1; a <= 10; a++) {
            fertility = populationY / 1000 * 17;
            mortality = populationY / 1000 * 8;
            populationY = populationY + fertility - mortality;
            System.out.println("Год " + a + " численность населения составляет " + populationY);
        }

        System.out.println("\nTask №4");

        int vasyaMoney = 15000;
        for (int i = 1; vasyaMoney < 12_000_000; i++) {
            vasyaMoney = (int) (vasyaMoney * 1.07);
            System.out.println("За " + i + " месяц Вася накопил " + vasyaMoney);
        }

        System.out.println("\nTask №5");

        int vasyaMoney2 = 15000;
        for (int f = 1; vasyaMoney2 < 12_000_000; f++) {
            vasyaMoney2 = (int) (vasyaMoney2 * 1.07);
            if (f % 6 == 0) {
                System.out.println("За " + f + " месяц Вася накопил " + vasyaMoney2);
            }
        }

        System.out.println("\nTask №6");

        int vasyaMoney3 = 15000;
        int nineYearsMonths = 9 * 12;
        for (int b = 1; b <= nineYearsMonths; b++) {
            vasyaMoney3 = (int) (vasyaMoney3 * 1.07);
            if (b % 6 == 0) {
                System.out.println("За " + b + " месяц Вася накопил " + vasyaMoney3);
            }
        }

        System.out.println("\nTask №7");

        int firstFriday = 1;
        for (int s = 1; s < 31; s += 7) {
            System.out.println("Сегодня пятница " + s + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("\nTask №8");

        int currentYear = 2024;
        int begin = currentYear - 200;
        int end = currentYear + 100;

        for (int m = 0; m < end; m += 79) {
            if (m >= begin) {
                System.out.println(m);
            }
        }
    }
}