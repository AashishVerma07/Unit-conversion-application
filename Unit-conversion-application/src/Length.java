import java.util.Scanner;

public class Length {
    public void unitsPerTypesLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 : Meter\n"
                + "2 : Kilometer\n"
                + "3 : Centimeter\n"
                + "4 : Millimeter\n"
                + "5 : Micrometer\n");
        System.out.print("Select from unit : ");
        int typeFrom = sc.nextInt();
        System.out.print("Enter the number : ");
        long number = sc.nextLong();

        if (typeFrom == 1) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();

            if (typeTo == 1) {
                System.out.printf("Meter to Meter : %.10f" , number);
            } else if (typeTo == 2) {
                double meterToKM = number * 0.001;
                System.out.printf("Meter to KM : %.5f",  meterToKM);
            } else if (typeTo == 3) {
                double meterToCM = number * 100;
                System.out.printf("Meter to CM : %.10f" , meterToCM);
            } else if (typeTo == 4) {
                double meterToMM = number * 1000;
                System.out.printf("Meter to MM : %.10f" , meterToMM);
            } else if (typeTo == 5) {
                double meterToMC = number * 1000000;
                System.out.printf("Meter to MC : %.10f" , meterToMC);
            }else{
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 2) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double KMToM = number * 1000;
                System.out.printf("KM to Meter : %.10f" , KMToM);
            } else if (typeTo == 2) {
                System.out.printf("KM to KM : %.10f " , number);
            } else if (typeTo == 3) {
                double KMToCM = number * 100000;
                System.out.printf("KM to CM : %.10f" , KMToCM);
            } else if (typeTo == 4) {
                double KMToMM = number * 1000000;
                System.out.printf("KM to MM : %.10f" , KMToMM);
            } else if (typeTo == 5) {
                double KMToMC = number * 1000000000;
                System.out.printf("KM to MC : %.10f" , KMToMC);
            }else{
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 3) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double CMToM = number * 0.01;
                System.out.printf("CM to Meter : %.10f" , CMToM);
            } else if (typeTo == 2) {
                double CMToKM = number * 0.00001;
                System.out.printf("CM to KM : %.10f" , CMToKM);
            } else if (typeTo == 3) {
                System.out.printf("CM to CM : %.10f" , number);
            } else if (typeTo == 4) {
                double CMToMM = number * 10;
                System.out.printf("CM to MM : %.10f" , CMToMM);
            } else if (typeTo == 5) {
                double CMToMC = number * 10000;
                System.out.printf("CM to MC : %.10f" , CMToMC);
            }else{
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 4) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double MMToM = number * 1000;
                System.out.printf("MM to Meter : %.10f" , MMToM);
            } else if (typeTo == 2) {
                double MMToKM = number * 0.000001;
                System.out.printf("MM to KM : %.10f" , MMToKM);
            } else if (typeTo == 3) {
                double MMToCM = number * 0.1;
                System.out.printf("MM to CM : %.10f" , MMToCM);
            } else if (typeTo == 4) {
                System.out.printf("MM to MM : %.10f" , number);
            } else if (typeTo == 5) {
                double MMToMC = number * 1000;
                System.out.printf("MM to MC : %.10f" , MMToMC);
            }else{
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 5) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double MCToM = (number * 0.000001 );
                System.out.printf("MC to Meter : %.10f", MCToM);
            } else if (typeTo == 2) {
                double MCToKM = number * 0.000000001;
                System.out.printf( "MC to KM : %.10f" , MCToKM);
            } else if (typeTo == 3) {
                double MCToCM = number * 0.0001;
                System.out.printf("MC to CM : %.10f" , MCToCM);
            } else if (typeTo == 4) {
                double MCToMM = number * 0.001;
                System.out.printf("MC to MM : %.10f" , MCToMM);
            } else if (typeTo == 5) {
                System.out.printf("MC to MC : %.10f" , number);
            }else{
                System.out.println("Invalid Option!!!");
            }
        }else{
            System.out.println("Invalid Option!!!");
        }

    }
}
