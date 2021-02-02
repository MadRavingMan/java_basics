package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    static void calcFigurePerimeterArea(){
        Scanner scanner = new Scanner(System.in);


        while(true) {

            System.out.println("Choose figure(Triangle, Rectangle or Square) or type exit");
            String figure = scanner.nextLine().toLowerCase();
            int a = 0;
            int b = 0;
            int c = 0;
            int perimeter = 0;
            int area = 0;

            switch (figure) {
                case "triangle":
                    System.out.print("enter a side length: ");
                    a = Integer.parseInt(scanner.nextLine());
                    System.out.print("enter b side length: ");
                    b = Integer.parseInt(scanner.nextLine());
                    System.out.print("enter b side length: ");
                    c = Integer.parseInt(scanner.nextLine());

                    perimeter = a + b + c;

                    double s = perimeter/2.0;
                    double abs = s * (s - a) * (s - b) * (s - c);
                    double Tarea = Math.round(Math.sqrt(abs) * 1000.0) / 1000.0;

                    System.out.println("Triangle perimeter is " + perimeter + " and area is " + Tarea + ".");
                    break;

                case "rectangle":
                    System.out.print("enter a side length: ");
                    a = Integer.parseInt(scanner.nextLine());
                    System.out.print("enter b side length: ");
                    b = Integer.parseInt(scanner.nextLine());

                    perimeter = (a + b) * 2;
                    area = a * b;

                    System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
                    break;

                case "square":
                    System.out.print("enter a side length: ");
                    a = Integer.parseInt(scanner.nextLine());

                    perimeter = a * 4;
                    area = a * a;

                    System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please repeat");
            }


        }

    }

}
