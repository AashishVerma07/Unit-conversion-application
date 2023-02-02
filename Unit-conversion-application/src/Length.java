import java.util.Scanner;

public class Length {

    public static void unitsPerTypesLength() {
    sourceToBase SB = new sourceToBase();

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
        SB.convertToBase(sourceUnit, convertNumber);

    }
}
