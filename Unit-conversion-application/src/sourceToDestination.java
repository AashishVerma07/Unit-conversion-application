import java.util.Scanner;

public class sourceToDestination  extends Length{
    public void sourceToDestination(double destinationUnit, double convertNumber) {

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
