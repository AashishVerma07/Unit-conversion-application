import java.util.Scanner;

public class Length {

    public static void unitsPerTypesLength() {


        System.out.print("Length\n"
                + "1 : Meter\n"
                + "2 : Kilometer\n"
                + "3 : Centimeter\n"
                + "4 : Millimeter\n"
                + "5 : Micrometer\n");

        double convertNumber = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Source unit : ");
        int sourceUnit = sc.nextInt();
        convertToBase(sourceUnit, convertNumber);


    }

    public static void convertToBase(int sourceUnit, double convertNumber) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        if (sourceUnit == 1) {
            convertNumber = number;
            sc.nextLine();

        } else if (sourceUnit == 2) {
            convertNumber = number * 1000;
            sc.nextLine();

        } else if (sourceUnit == 3) {
            convertNumber = number * 0.01;
            sc.nextLine();

        } else if (sourceUnit == 4) {
            convertNumber = number * 1000;
            sc.nextLine();

        } else if (sourceUnit == 5) {
            convertNumber = (number / 1e+6);
            sc.nextLine();

        } else {
            System.out.println("Invalid Option!!!");
            sc.nextLine();
            unitsPerTypesLength();
        }

        System.out.print("Destination unit : ");
        long destinationUnit = sc.nextLong();
        sourceToDestination(destinationUnit, convertNumber);
    }

    public static void sourceToDestination(double destinationUnit, double convertNumber) {

        Scanner sc = new Scanner(System.in);
        double convertedValue;
        if (destinationUnit == 1) {
            System.out.printf("converted to Meter : %.15f" ,convertNumber);
            sc.nextLine();

        } else if (destinationUnit == 2) {
            convertedValue = (convertNumber * 0.001);
            System.out.printf("converted to KiloMeter : %.15f", convertedValue);
            sc.nextLine();

        } else if (destinationUnit == 3) {
            convertedValue = (convertNumber * 100);
            System.out.printf("converted to CentiMeter : %.15f", convertedValue);
            sc.nextLine();

        } else if (destinationUnit == 4) {
            convertedValue = (convertNumber * 1000);
            System.out.printf("converted to MilliMeter : %.15f", convertedValue);
            sc.nextLine();

        } else if (destinationUnit == 5) {
            convertedValue = (convertNumber * 1000000);
            System.out.printf("converted to MicroMeter : %.15f", convertedValue);
            sc.nextLine();

        } else {
            System.out.println("Invalid Option!!!");
            sc.nextLine();
            unitsPerTypesLength();
        }
    }
}
