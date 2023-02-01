import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            Length l = new Length();
            Weight h = new Weight();
            Temperature t = new Temperature();
            Volume v = new Volume();

            // Start
            System.out.print("******** Unit Converter ********\n"
                    + "1 : Length\n"
                    + "2 : Weight\n"
                    + "3 : Temperature\n"
                    + "4 : Volume\n"
                    + "5 : Exit\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose the unit : ");
            int unit = scanner.nextInt();

            if (unit == 1) {
                l.unitsPerTypesLength();

            } else if (unit == 2) {
                System.out.println("Weight");
                h.unitsPerTypesWeight();

            } else if (unit == 3) {
                t.unitsPerTypesTemperature();

            } else if (unit == 4) {
                System.out.println("Volume");
                v.unitsPerTypesVolume();

            } else if (unit == 5) {
                break;

            } else {
                System.out.println("Invalid Option!");
            }
        }
    }
}
