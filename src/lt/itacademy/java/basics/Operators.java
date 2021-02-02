package lt.itacademy.java.basics;

public class Operators {
    static void typeOfTriangle(int x, int y, int z){
        if (x == y && x == z && y==z){
            System.out.println("Triangle is Equilateral. Sides: "+x +" "+y +" "+z);
        }else if (x != y && x != z && y != z ){
            System.out.println("Triangle is Scalene. Sides: "+x +" "+y +" "+z);
        }else {
            System.out.println("Triangle is Isosceles. Sides: "+x +" "+y +" "+z);

        }
    }

    static void carFuelEffi(int disToDest, int fuelInTank, int fuelPerKm, double pricePerLiter){

        double distanceWithCurrFuel = fuelInTank / (fuelPerKm * 0.01);
        double litersLeft = fuelInTank - (fuelPerKm * disToDest * 0.01);

        if (distanceWithCurrFuel > disToDest){
            System.out.println("Destination is in " + disToDest + "km. Car is able to reach the destination. " +
                    "It will have " + litersLeft + " liters of fuel left.");
        } else {
            double litersNeed = litersLeft * (-1);
            double neededFuelCost = litersNeed*pricePerLiter;
            System.out.println("Destination is in " + disToDest + "km. Car is not able to reach the destination. It needs " + litersNeed + " liter of fuel more. It will cost " + neededFuelCost + ".");

        }

    }
}
