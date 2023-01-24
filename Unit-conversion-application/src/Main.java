import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Length l = new Length();
        Height h = new Height();
        Temperature t = new Temperature();
        Volume v = new Volume();

        // Start
        System.out.print("1 : Length\n"
                + "2 : Height\n"
                + "3 : Temperature\n"
                + "4 : Volune\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the unit : ");
        int unit = scanner.nextInt();

        if( unit == 1){
            l.unitsPerTypes();
        }
        else if( unit == 2){

        }
        else if (unit == 3) {

        }
        else if (unit ==4) {

        }else{
            System.out.println("Invalid Option!");
        }
    }
}
