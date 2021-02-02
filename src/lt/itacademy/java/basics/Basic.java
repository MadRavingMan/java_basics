package lt.itacademy.java.basics;
import java.util.Scanner;

public class Basic {
    static void helloIAm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input name:");
        String name = scanner.nextLine();
        System.out.println("Please input surname:");
        String surname = scanner.nextLine();
        System.out.println("Please input age:");
        String age = scanner.nextLine();
        System.out.println("Hello I am " +name +" " +surname +", currently I am " +age +" years old and I am attending IT Academy 2021!");
    }

    static void helloWorldPrimitives(){
//        H3110 w0r1d 2.0 true
//        except long and double
        char charas = 'H';
        int skaicius = 3110;

        char charas1 = 'w';
        byte baitukas = 0;
        char charas2 = 'r';
        short shortas = 1;
        char charas3 = 'd';

        float floatas = 2.0f;

        boolean isBoolis = true;


        System.out.println(charas+skaicius+" "+charas1+baitukas+charas2+shortas+charas3+" "+floatas+" "+isBoolis);

    }

    static void printOperationsOfIntegers(int x, int y){
//        Write a Java method that accepts two integers and then prints the sum, the difference, the product, the
//        multiple, the distance (the difference between integer), the maximum (the larger of the two integers),
//        the minimum (smaller of the two integers).

        System.out.println("x + y =" + (x+y));
        System.out.println("x - y =" + (x-y));
        System.out.println("x * y =" + (x*y));

        if (x > y){
            System.out.println("yra didesnis skaicius" + x);
        }else if (x < y){
            System.out.println("yra didesnis skaicius" + y);
        }

        if (x < y){
            System.out.println("yra mazesnis skaicius " + x);
        }else if (x > y){
            System.out.println("yra mazesnis skaicius " + y);
        }

    }


}
