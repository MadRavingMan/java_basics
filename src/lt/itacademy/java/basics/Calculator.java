package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static int aSide, bSide, cSide = 0;
    static int perimeter = 0;
    static int area = 0;

    static void calcFigurePerimeterArea() {

        boolean isLooper = true;

        while (isLooper) {

            System.out.println("Choose figure(Triangle, Rectangle or Square) or type exit");
            String figure = scanner.nextLine().toLowerCase();

            switch (figure) {

                case "triangle":
                    calcTriangle();
                    break;

                case "rectangle":
                    calcRectangle();
                    break;

                case "square":
                    calcSquare();
                    break;

                case "exit":
                    isLooper = false;
                    break;

                default:
                    System.out.println("Could not understand command " + figure + ". Please repeat.");
            }

        }

    }

    public static void calcTriangle() {
        System.out.print("enter A side length: ");
        aSide = scanner.nextInt();
        System.out.print("enter B side length: ");
        bSide = scanner.nextInt();
        System.out.print("enter C side length: ");
        cSide = scanner.nextInt();

        if (aSide == 0 || bSide == 0 || cSide == 0) {
            System.out.println("Triangle line value can't be 0");
        } else if (aSide < 0 || bSide < 0 || cSide < 0) {
            System.out.println("Triangle line value can't be negative");
        } else
            perimeter = aSide + bSide + cSide;
        double s = perimeter / 2.0;
        double abs = s * (s - aSide) * (s - bSide) * (s - cSide);
        double Tarea = Math.round(Math.sqrt(abs) * 1000.0) / 1000.0;

        System.out.println("Triangle perimeter is " + perimeter + " and area is " + Tarea);
    }

    public static void calcRectangle() {
        System.out.print("enter A side length: ");
        aSide = scanner.nextInt();
        System.out.print("enter B side length: ");
        bSide = scanner.nextInt();

        if (aSide == 0 || bSide == 0) {
            System.out.println("Rectangle line value can't be 0");
        } else if (aSide < 0 || bSide < 0) {
            System.out.println("Rectangle line value can't be negative");
        } else {
            perimeter = (aSide + bSide) * 2;
            area = aSide * bSide;
            System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
        }
    }

    public static void calcSquare() {
        System.out.print("enter A side length: ");
        aSide = scanner.nextInt();

        if (aSide == 0) {
            System.out.println("Rectangle line value can't be 0");
        } else if (aSide < 0) {
            System.out.println("Rectangle line value can't be negative");
        } else {
            perimeter = aSide * 4;
            area = aSide * aSide;
            System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
        }
    }


//    private static boolean isNumeric(String strNum) {
//        if (strNum == null) {
//            return false;
//        }
//        try {
//            int numb = Integer.parseInt(strNum);
//            if (numb == 0) {
//                return false;
//            }
//        } catch (NumberFormatException nfe) {
//            return false;
//        }
//        return true;
//    }

}