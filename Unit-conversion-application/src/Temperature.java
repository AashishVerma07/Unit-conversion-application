import java.util.Scanner;

public class Temperature {
    public static void unitsPerTypesTemperature() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperature\n"
                + "1 : Celsius\n"
                + "2 : Kelvin\n"
                + "3 : Fahrenheit\n");

        double convertNumber = 0;

        System.out.print("Source unit : ");
        int sourceUnit = sc.nextInt();
        sourceToBase(sourceUnit, convertNumber);

    }


    public static void sourceToBase(int sourceUnit, double convertNumber) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        if (sourceUnit == 1) {
            convertNumber = number;
            sc.nextLine();

        } else if (sourceUnit == 2) {
            convertNumber = number - 273.15;
            System.out.println(convertNumber);
            sc.nextLine();

        } else if (sourceUnit == 3) {
            convertNumber =  ((number - 32) * 1.8);
            System.out.println(convertNumber);
            sc.nextLine();

        }else {
            System.out.println("Invalid Option!!!");
            sc.nextLine();
            unitsPerTypesTemperature();
        }

        System.out.print("Destination unit : ");
        long destinationUnit = sc.nextLong();
        basToDestination(destinationUnit, convertNumber);
    }

    public static void basToDestination(double destinationUnit, double convertNumber) {

        Scanner sc = new Scanner(System.in);
        double convertedValue = 0;

        if (destinationUnit == 1) {
            System.out.print("converted to Celsius : " + convertNumber);
            sc.nextLine();

        } else if (destinationUnit == 2) {
            convertedValue = (convertedValue + 273.15);
            System.out.printf("converted to Kelvin : %.5f", convertedValue);
            sc.nextLine();

        } else if (destinationUnit == 3) {
            convertedValue = ((convertedValue * 1.8) + 32);
            System.out.printf("converted to Fahrenheit : %.10f", convertedValue);
            sc.nextLine();

        }else {
            System.out.println("Invalid Option!!!");
            sc.nextLine();
            unitsPerTypesTemperature();
        }
    }
}



