package calculo;

import java.util.Scanner;

/**
 *
 * @author GOMEZ AGUILAR 2
 */
public class Main {

    public static double Perimetro(double P) {
        double Perimetro = (Math.sqrt(2) * P) / 2;
        return Perimetro;
    }

    public static double Area(double A) {
        double Area = A / 2;
        return Area;
    }

    public static double Lado(double L) {
        double Lado = (L / 2) * Math.sqrt(2);
        return Lado;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Digite la medida del lado del cuadrado exterior: ");
        double L = leer.nextDouble();

        double A = L * L;
        double P = 4 * L;

//        System.out.println("Area y perimetro respectivamente: " + A + " - " + P);
        System.out.println("");

        double totalP = 0;
        double totalA = 0;

        for (int i = 0; i < 7; i++) {
            //Area de los cuadros
            System.out.println(A + " _");
            totalA = totalA + A;
            A = A - A / 2;
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < 7; i++) {
            //Perimetro de los cuadros
            System.out.println(P + " _");
            totalP = totalP + P;
            P = (Math.sqrt(2)*P)/2;
        }
        System.out.println(totalP);

        System.out.println("");
        System.out.println("La suma del área de todos los cuadros es: " + totalA);
        System.out.println("La suma de todos perímetros del cuadrado es: " + totalP);
    }

}
