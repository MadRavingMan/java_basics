package lt.itacademy.java.basics;

public class Loops {
    static void calcHoursMinsInYear(int days) {
        int hours = 0;
        int minutes = 0;
        for (int i = 0; i < days; i++) {
            hours += 24;
            minutes += 1440;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    static void calcHoursMinsInYearWhleLoop(int days) {
        int hours = 0;
        int minutes = 0;
        int i = 0;

        while (i < days) {
            hours += 24;
            minutes += 1440;
            ++i;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");

    }

    static void calcFactionalNo(int number) {
        int factionalNumber = 1;
        int i = 1;

        while (i <= number) {
            factionalNumber *= i;
            ++i;
        }

        System.out.println("Factorial of number " + number + " is " + factionalNumber + ".");
    }
}
