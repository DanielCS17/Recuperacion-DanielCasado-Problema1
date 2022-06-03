import javax.print.Doc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean control = true;
        int opcion;

        Printer myPrinter = new Printer(false);

        while (control == true){

            System.out.println("");
            System.out.println("Seleccione una opción:");
            System.out.println("    1. Encender impresora");
            System.out.println("    2. Apagar impresora");
            System.out.println("    3. Añadir trabajo");
            System.out.println("    4. Ver lista de trabajos");
            System.out.println("    5. Imprimir");
            System.out.println("    6. Salir");
            System.out.print(": ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            switch (opcion){
                case 1:
                    myPrinter.turnOnPrinter();
                    break;

                case 2:
                    myPrinter.turnOffPrinter();
                    break;

                case 3:
                    System.out.println("Introduzca el nombre de su documento");
                    String name = sc.nextLine();
                    System.out.println("Introduzca el tamaño de su documento");
                    String size = sc.nextLine();

                    myPrinter.addDocument(name, size);
                    break;

                case 4:
                    myPrinter.showDocs();
                    break;

                case 5:
                    myPrinter.print();
                    break;

                case 6:
                    control = false;
                    System.out.println("Saliendo de la App...");
                    break;

                default:
                    System.out.println("ERROR! Opción inválida.");
                    break;
            }
        }
    }
}
