import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Length l = new Length();
        Height h = new Height();
        Temperature t = new Temperature();
        Volume v = new Volume();

        // Start
        System.out.print("1 : Length\n"
                + "2 : Height\n"
                + "3 : Temperature\n"
                + "4 : Volume\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the unit : ");
        int unit = scanner.nextInt();

        if( unit == 1){
            System.out.println("Length");
            l.unitsPerTypes();
        }
        else if( unit == 2){
            System.out.println("Height");

        }
        else if (unit == 3) {
            System.out.println("Temperature");

        }
        else if (unit ==4) {
            System.out.println("Volume");

        }else{
            System.out.println("Invalid Option!");
        }
    }
}
