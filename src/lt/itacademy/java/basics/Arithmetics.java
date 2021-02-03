package lt.itacademy.java.basics;

public class Arithmetics {

    static void calcCube(int x) {
        int cubeSideNumber = 12;
        int cubesPerimeter = cubeSideNumber * x;
        int cubesVolume = x * x * x;
        System.out.println("Cube’s volume: " + cubesVolume + "cm3.");
        System.out.println("Cube’s perimeter: " + cubesPerimeter + "cm.");

    }

    static void convertIncFoot(float x, float y) {
        float covertedToCm = (x + (y * 12)) * 2.54f;
        System.out.println(x + " feet and " + y + " inches = " + covertedToCm + " cm");
    }
}
