
package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main() {
        Scanner szkn = new Scanner(System.in);
        System.out.print("Kérem írja be hogy hány kilógramm ön:");
    }
    private static void bmimeres(float kimenet) {
        if(kimenet < 18.5) {
            System.out.println("Ön levan fogyva");
        }else if (kimenet < 25) {
            System.out.println("Ön normál");
        }else if (kimenet < 30) {
            System.out.println("Túlsúlyos");
        }else {
            System.out.println("Dagadék");
        }
    }
    public static void szamit() {
        Scanner szkn = new Scanner(System.in);
        float suly = szkn.nextFloat();
        System.out.print("Kérem írja be hány centiméter: ");
        float mag = szkn.nextFloat();
        float bmi = (100*100*suly)/(mag*mag);
        System.out.println("Az ön BMI értéke: "+bmi);
        bmimeres(bmi);
    }
}
