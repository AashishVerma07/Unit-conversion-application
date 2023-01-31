import java.util.Scanner;

public class Length {

    public static void unitsPerTypesLength() {


        System.out.print("1 : Meter\n"
                + "2 : Kilometer\n"
                + "3 : Centimeter\n"
                + "4 : Millimeter\n"
                + "5 : Micrometer\n"
                + "6 : Exit\n");

        double convertNumber = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Source unit : ");
        int sourceUnit = sc.nextInt();

        System.out.print("Enter the number : ");
        long number = sc.nextLong();
        convertToBase(convertNumber, number, sourceUnit);


    }

    public static void convertToBase(double convertNumber, long number, int sourceUnit) {

        if (sourceUnit == 1) {
            convertNumber = number;
            System.out.println(convertNumber);
        } else if (sourceUnit == 2) {
            convertNumber = number * 1000;
            System.out.println(convertNumber);
        } else if (sourceUnit == 3) {
            convertNumber = number * 0.01;
            System.out.println(convertNumber);

        } else if (sourceUnit == 4) {
            convertNumber = number * 1000;
            System.out.println(convertNumber);

        } else if (sourceUnit == 5) {
            convertNumber = (number / 1e+6);
            System.out.println(convertNumber);

        } else {
            System.out.println("Invalid Option!!!");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Destination unit : ");
        long destinationUnit = sc.nextLong();
        sourceToDestination(destinationUnit, number, convertNumber);
    }

    public static void sourceToDestination(long number, double convertNumber, double destinationUnit){

        double convertedValue = 0;
        if (destinationUnit == 1) {
            if (destinationUnit == 1) {
                System.out.print("converted to Meter : " + number);
            } else if (destinationUnit == 2) {
                convertedValue = (convertNumber * 0.001);
                System.out.printf("converted to KiloMeter : %.15f", convertedValue);
            } else if (destinationUnit == 3) {
                convertedValue = (convertNumber * 100);
                System.out.printf("converted to CentiMeter : %.15f", convertedValue);
            } else if (destinationUnit == 4) {
                convertedValue = (convertNumber * 1000);
                System.out.printf("converted to MilliMeter : %.15f", convertedValue);
            } else if (destinationUnit == 5) {
                convertedValue = (convertNumber * 1000000);
                System.out.printf("converted to MicroMeter : %.15f", convertedValue);
            } else {
                System.out.println("Invalid Option!!!");
            }
        }
    }
}
