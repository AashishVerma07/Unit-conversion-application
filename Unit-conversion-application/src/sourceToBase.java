import java.util.Scanner;

public class sourceToBase extends Length {
    public void convertToBase(int sourceUnit, double convertNumber) {
        sourceToDestination s = new sourceToDestination();


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
        s.sourceToDestination(destinationUnit, convertNumber);
    }
}
