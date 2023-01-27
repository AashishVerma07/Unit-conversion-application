import java.util.Scanner;

public class Volume {
        public void unitsPerTypesVolume() {
            Scanner sc = new Scanner(System.in);
            System.out.print("1 : Cubic Meter\n"
                    + "2 : Cubic Kilometer\n"
                    + "3 : Cubic Centimeter\n"
                    + "4 : Liter\n"
                    + "5 : Millimeter\n");
            System.out.print("Select from unit : ");
            int typeFrom = sc.nextInt();
            System.out.print("Enter the number : ");
            long number = sc.nextLong();

            if (typeFrom == 1) {
                System.out.print("Select to unit : ");
                long typeTo = sc.nextLong();

                if (typeTo == 1) {
                    System.out.print("Cubic Meter to Cubic Meter : " + number);
                } else if (typeTo == 2) {
                    double CMtoCK = number * 1000000000;
                    System.out.printf("Cubic Meter to Cubic Kilometer : %.5f",  CMtoCK);
                } else if (typeTo == 3) {
                    double CMtoCC = number * 1000000 ;
                    System.out.printf("Cubic Meter to Cubic Centimeter : %.10f" , CMtoCC);
                } else if (typeTo == 4) {
                    double CMtoL = number * 1000;
                    System.out.printf("Cubic Meter to Liter : %.10f" , CMtoL);
                } else if (typeTo == 5) {
                    double CMtoM = number * 1000000;
                    System.out.printf("Cubic Meter to Millimeter : %.10f" , CMtoM);
                }else{
                    System.out.println("Invalid Option!!!");
                }
            } else if (typeFrom == 2) {
                System.out.print("Select to unit : ");
                long typeTo = sc.nextLong();
                if (typeTo == 1) {
                    double CKtoCM = number * 1000000000;
                    System.out.printf("Cubic Kilometer to Cubic Meter : %.10f" , CKtoCM);
                } else if (typeTo == 2) {
                    System.out.print("Cubic Kilometer to Cubic Kilometer : " + number);
                } else if (typeTo == 3) {
                    double CKtoCC = number * 1.0E+15;
                    System.out.printf("Cubic Kilometer to Cubic Centimeter : %.10f" , CKtoCC);
                } else if (typeTo == 4) {
                    double CKtoL = number / 0.000000000001;
                    System.out.printf("Cubic Kilometer to Liter : %.10f" , CKtoL);
                } else if (typeTo == 5) {
                    double CKtoM = number * 1.0E+15;
                    System.out.printf("Cubic Kilometer to Millimeter : %.10f" , CKtoM);
                }else{
                    System.out.println("Invalid Option!!!");
                }
            } else if (typeFrom == 3) {
                System.out.print("Select to unit : ");
                long typeTo = sc.nextLong();
                if (typeTo == 1) {
                    double CMToM = number * 0.000001;
                    System.out.printf("Cubic Centimeter to Cubic Meter : %.10f" , CMToM);
                } else if (typeTo == 2) {
                    double CCtoCK = number * 0.000000000000001;
                    System.out.printf("Cubic Centimeter to Cubic Kilometer : %.10f" , CCtoCK);
                } else if (typeTo == 3) {
                    System.out.print("Cubic Centimeter to Cubic Centimeter :  " + number);
                } else if (typeTo == 4) {
                    double CCtoL = number * 0.001;
                    System.out.printf("Cubic Centimeter to Liter : %.10f" , CCtoL);
                } else if (typeTo == 5) {
                    double CCtoM = number * 1000;
                    System.out.printf("Cubic Centimeter to Millimeter : %.10f" , CCtoM);
                }else{
                    System.out.println("Invalid Option!!!");
                }
            } else if (typeFrom == 4) {
                System.out.print("Select to unit : ");
                long typeTo = sc.nextLong();
                if (typeTo == 1) {
                    double LtoCM = number * 0.001;
                    System.out.printf("Liter to Cubic Meter : %.10f" , LtoCM);
                } else if (typeTo == 2) {
                    double LtoCk = number * 1.0E-12;
                    System.out.printf("Liter to Cubic Kilometer : %.15f" , LtoCk);
                } else if (typeTo == 3) {
                    double LtoCC = number * 1000;
                    System.out.printf("Liter to Cubic Centimeter : %.10f" , LtoCC);
                } else if (typeTo == 4) {
                    System.out.print("Liter to Liter :  " + number);
                } else if (typeTo == 5) {
                    double LtoM = number * 1000;
                    System.out.printf("Liter to Millimeter : %.10f" , LtoM);
                }else{
                    System.out.println("Invalid Option!!!");
                }
            } else if (typeFrom == 5) {
                System.out.print("Select to unit : ");
                long typeTo = sc.nextLong();
                if (typeTo == 1) {
                    double MtoCM = (number / 1e+6);
                    System.out.printf("Millimeter to Cubic Meter : %.10f", MtoCM);
                } else if (typeTo == 2) {
                    double MtoCK = number / 1e+15;
                    System.out.printf( "Millimeter to Cubic Kilometer : %.10f" , MtoCK);
                } else if (typeTo == 3) {
                    double MtoCC = number * 1;
                    System.out.printf("Millimeter to Cubic Centimeter : %.10f" , MtoCC);
                } else if (typeTo == 4) {
                    double MtoL = number / 1000;
                    System.out.printf("Millimeter to Liter : %.10f" , MtoL);
                } else if (typeTo == 5) {
                    System.out.print("Millimeter to Millimeter : " + number);
                }else{
                    System.out.println("Invalid Option!!!");
                }
            }else{
                System.out.println("Invalid Option!!!");
            }

        }
    }


