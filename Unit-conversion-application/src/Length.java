import java.util.Scanner;

public class Length {
    public void unitsPerTypes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 : Meter\n"
                + "2 : Kilometer\n"
                + "3 : Centimeter\n"
                + "4 : Millimeter\n"
                + "5 : Micrometer\n");
        System.out.print("Select from unit : ");
        int typeFrom = sc.nextInt();
        System.out.println("Enter the number : ");
        Float number = sc.nextFloat();
        if(typeFrom == 1){
            double meterToKM = typeFrom % 1000;
            double meterToCM = typeFrom * 100;
            double meterToMM = typeFrom * 1000;
            double meterToMC = typeFrom * 1000000;
            System.out.println("All Possible units : \n" + "Meter to Km - "+meterToKM +"\n"+  "Meter to CM - "+meterToCM +"\n"+ "Meter to MM - "+meterToMM +"\n"+ "Meter to MC - "+ meterToMC);
        }else if(typeFrom == 2){
            double KMToM = typeFrom * 1000;
            double KMToCM = typeFrom * 100000;
            double KMToMM = typeFrom * 1000000;
            double KMToMC = typeFrom * 1000000000;
            System.out.println("All Possible units : \n" + "KM to M - "+KMToM +"\n"+  "KM to CM - "+KMToCM +"\n"+ "KM to MM - "+KMToMM +"\n"+ "KM to MC - "+ KMToMC);
        }else if(typeFrom == 3){
            double CMToM = typeFrom * 0.01;
            double CMToKM = typeFrom * 0.00001;
            double CMToMM = typeFrom * 10;
            double CMToMC = typeFrom * 10000;
            System.out.println("All Possible units : \n" + "CM to M - "+CMToM +"\n"+  "CM to KM - "+ CMToKM +"\n"+ "CM to MM - "+CMToMM +"\n"+ "CM to MC - "+ CMToMC);
        }else if(typeFrom == 4){
            double MMToM = typeFrom * 0.001;
            double MMToKM = typeFrom % 1000000;
            double MMToCM = typeFrom % 10;
            double MMToMC = typeFrom * 1000;
            System.out.println("All Possible units : \n" + "MM to M - "+MMToM +"\n"+  "MM to KM - "+ MMToKM +"\n"+ "MM to CM - "+MMToCM +"\n"+ "MM to MC - "+ MMToMC);

        }else if(typeFrom == 5){
            double MCToM = typeFrom % 1000000;
            double MCToKM = typeFrom % 1000000000;
            double MCToCM = typeFrom % 10000;
            double MCToMM = typeFrom % 1000;
            System.out.println("All Possible units : \n" + "MC to M - "+MCToM +"\n"+  "MC to KM - "+ MCToKM +"\n"+ "MC to CM - "+MCToCM +"\n"+ "MC to MM - "+ MCToMM);

        }

    }
}
