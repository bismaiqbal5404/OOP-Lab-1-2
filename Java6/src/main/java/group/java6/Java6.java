
package group.java6;

import java.util.Scanner;

public class Java6 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Pulley Speed Calculation");
        System.out.print("Enter diameter of first pulley: ");
        double diameter1 = scanner.nextDouble();

        System.out.print("Enter diameter of second pulley: ");
        double diameter2 = scanner.nextDouble();

        System.out.print("Enter RPM of first pulley: ");
        double RPM1 = scanner.nextDouble();

        double RPM2 = (diameter1 / diameter2) * RPM1;

        System.out.println("The RPM of the second pulley (RPM2) is: " + RPM2);

        System.out.println("\nPulley Weight Lift Calculation");
        System.out.print("Enter the force exerted : ");
        double forceExerted = scanner.nextDouble();

        System.out.print("Enter the number of up ropes: ");
       int numberOfUpRopes = scanner.nextInt();

        double weightLifted = forceExerted * numberOfUpRopes;

        System.out.println("The weight lifted by the pulley system is: " + weightLifted + " Newtons");
    }
}
   
