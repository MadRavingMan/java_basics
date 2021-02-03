package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    static void calcFigurePerimeterArea() {
        Scanner scanner = new Scanner(System.in);
        boolean isLooper = true;

        while (isLooper) {

            System.out.println("Choose figure(Triangle, Rectangle or Square) or type exit");
            String figure = scanner.nextLine().toLowerCase();
            int aSide = 0;
            int bSide = 0;
            int cSide = 0;
            int perimeter = 0;
            int area = 0;
            boolean isValid = true;

            switch (figure) {
                case "triangle":
                    while (isValid) {
                        System.out.print("enter A side length: ");
                        String firstInput = scanner.nextLine();
                        if (isNumeric(firstInput)) {
                            aSide = Integer.parseInt(firstInput);
                        } else {
                            System.out.println("triangle Line lenth can't be: " + firstInput);
                            continue;
                        }

                        System.out.print("enter B side length: ");
                        String secondInput = scanner.nextLine();
                        if (isNumeric(secondInput)) {
                            bSide = Integer.parseInt(secondInput);
                        } else {
                            System.out.println("triangle Line lenth can't be: " + secondInput);
                            continue;
                        }

                        System.out.print("enter C side length: ");
                        String thirdInput = scanner.nextLine();
                        if (isNumeric(thirdInput)) {
                            cSide = Integer.parseInt(thirdInput);
                        } else {
                            System.out.println("triangle Line lenth can't be: " + thirdInput);
                            continue;
                        }

                        isValid = false;

                    }

                    perimeter = aSide + bSide + cSide;

                    double s = perimeter / 2.0;
                    double abs = s * (s - aSide) * (s - bSide) * (s - cSide);
                    double Tarea = Math.round(Math.sqrt(abs) * 1000.0) / 1000.0;

                    System.out.println("Triangle perimeter is " + perimeter + " and area is " + Tarea + ".");
                    break;

                case "rectangle":
                    while (isValid) {
                        System.out.print("enter A side length: ");
                        String firstInput = scanner.nextLine();
                        if (isNumeric(firstInput)) {
                            aSide = Integer.parseInt(firstInput);
                        } else {
                            System.out.println("rectangle Line lenth can't be: " + firstInput);
                            continue;
                        }

                        System.out.print("enter B side length: ");
                        String secondInput = scanner.nextLine();
                        if (isNumeric(secondInput)) {
                            bSide = Integer.parseInt(secondInput);
                        } else {
                            System.out.println("rectangle Line lenth can't be: " + secondInput);
                            continue;
                        }
                        isValid = false;
                    }

                    perimeter = (aSide + bSide) * 2;
                    area = aSide * bSide;

                    System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
                    break;

                case "square":
                    while (isValid) {
                        System.out.print("enter side length: ");
                        String firstInput = scanner.nextLine();
                        if (isNumeric(firstInput)) {
                            aSide = Integer.parseInt(firstInput);
                        } else {
                            System.out.println("square Line lenth can't be: " + firstInput);
                            continue;
                        }
                        isValid = false;
                    }

                    perimeter = aSide * 4;
                    area = aSide * aSide;

                    System.out.println("Square perimeter is " + perimeter + " and area is " + area + ".");
                    break;
                case "exit":
                    isLooper = false;
//                    System.exit(0);
                    break;
                default:
                    System.out.println("Could not understand command " + figure +". Please repeat.");
            }


        }

    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int numb = Integer.parseInt(strNum);
            if (numb == 0) {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}