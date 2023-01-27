import java.util.Scanner;

public class Weight {
    public void unitsPerTypesWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 : Kilogram\n"
                + "2 : Gram\n"
                + "3 : Milligram\n"
                + "4 : Pound\n"
                + "5 : Carat\n");
        System.out.print("Select from unit : ");
        int typeFrom = sc.nextInt();
        System.out.print("Enter the number : ");
        long number = sc.nextLong();

        if (typeFrom == 1) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();

            if (typeTo == 1) {
                System.out.print("Kilogram to Kilogram : " + number);
            } else if (typeTo == 2) {
                double KtoG = number * 1000;
                System.out.printf("Kilogram to Gram : %.5f", KtoG);
            } else if (typeTo == 3) {
                double KtoM = number * 1000000;
                System.out.printf("Kilogram to Milligram : %.10f", KtoM);
            } else if (typeTo == 4) {
                double KtoP = number * 2.2;
                System.out.printf("Kilogram to Pound : %.10f", KtoP);
            } else if (typeTo == 5) {
                double KtoC = number * 5000;
                System.out.printf("Kilogram to Carat : %.10f", KtoC);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 2) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double GtoK = number / 1000;
                System.out.printf("Gram to Kilogram : %.10f", GtoK);
            } else if (typeTo == 2) {
                System.out.print("Gram to Gram : " + number);
            } else if (typeTo == 3) {
                double GtoM = number * 1000 ;
                    System.out.printf("Gram to Milligram : %.10f", GtoM);
            } else if (typeTo == 4) {
                double GtoP = number * 0.0022;
                    System.out.printf("Gram to Pound : %.10f", GtoP);
            } else if (typeTo == 5) {
                double GtoC = number * 5;
                System.out.printf("Gram to Carat : %.10f", GtoC);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 3) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double MtoK = number / 1000000;
                System.out.printf("Milligram to Kilogram : %.10f", MtoK);
            } else if (typeTo == 2) {
                double MtoG = number /1000;
                System.out.printf("Milligram to Gram : %.10f", MtoG);
            } else if (typeTo == 3) {
                System.out.print("Milligram to Milligram : " + number);
            } else if (typeTo == 4) {
                double MtoP = number / 453592.37;
                System.out.printf("Milligram to Pound : %.10f", MtoP);
            } else if (typeTo == 5) {
                double MtoC = number / 200;
                System.out.printf("Milligram to Carat : %.10f", MtoC);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 4) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double PtoK = number * 0.45359237 ;
                System.out.printf("Pound to Kilogram : %.10f", PtoK);
            } else if (typeTo == 2) {
                double PtoG = number * 453.592;
                System.out.printf("Pound to Gram : %.10f", PtoG);
            } else if (typeTo == 3) {
                double PtoM = number * 453592.37;
                System.out.printf("Pound to Milligram : %.10f", PtoM);
            } else if (typeTo == 4) {
                System.out.print("Pound to Pound : " + number);
            } else if (typeTo == 5) {
                double PtoC = number * 2267.96185;
                System.out.printf("Pound to Carat : %.10f", PtoC);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 5) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double MCToM = (number * 5000);
                System.out.printf("Carat to Kilogram : %.10f", MCToM);
            } else if (typeTo == 2) {
                double CtoG = number / 5 ;
                System.out.printf("Carat to Gram : %.10f", CtoG);
            } else if (typeTo == 3) {
                double CtoM = number * 200;
                System.out.printf("Carat to Milligram : %.10f", CtoM);
            } else if (typeTo == 4) {
                double CtoP = number * 0.000441;
                System.out.printf("Carat to Pound : %.10f", CtoP);
            } else if (typeTo == 5) {
                System.out.print("Carat to Carat : " + number);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else {
            System.out.println("Invalid Option!!!");
        }

    }
}

