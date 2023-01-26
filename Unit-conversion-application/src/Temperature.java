import java.util.Scanner;

public class Temperature {
    public void unitsPerTypesTemperature() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 : Celsius\n"
                + "2 : Kelvin\n"
                + "3 : Fahrenheit\n");
        System.out.print("Select from unit : ");
        int typeFrom = sc.nextInt();
        System.out.print("Enter the number : ");
        long number = sc.nextLong();

        if (typeFrom == 1) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();

            if (typeTo == 1) {
                System.out.printf("Celsius to Celsius : %.10f", number);
            } else if (typeTo == 2) {
                double CtoK = number + 273.15;
                System.out.printf("Celsius to Kelvin : %.5f", CtoK);
            } else if (typeTo == 3) {
                double CtoF = (number * 1.8) + 32;
                System.out.printf("Celsius to Fahrenheit : %.10f", CtoF);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 2) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double KtoC = number - 273.15;
                System.out.printf("Kelvin to Celsius : %.10f", KtoC);
            } else if (typeTo == 2) {
                System.out.printf("Kelvin to Kelvin : %.10f ", number);
            } else if (typeTo == 3) {
                double KtoF = ((number - 273.15) * 1.8) + 32;
                System.out.printf("Kelvin to Fahrenheit : %.10f", KtoF);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else if (typeFrom == 3) {
            System.out.print("Select to unit : ");
            long typeTo = sc.nextLong();
            if (typeTo == 1) {
                double FtoC =  ((number-32)*5)/9;
                System.out.printf("Fahrenheit to Celsius : %.10f", FtoC);
            } else if (typeTo == 2) {
                double FtoK =  ((number - 32) / 1.8) + 273.15;
                System.out.printf("Fahrenheit to Kelvin : %.10f", FtoK);
            } else if (typeTo == 3) {
                System.out.printf("Fahrenheit to Fahrenheit : %.10f", number);
            } else {
                System.out.println("Invalid Option!!!");
            }
        } else {
            System.out.println("Invalid Option!!!");
        }

    }
}



