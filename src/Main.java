import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("█████████████████████████████████████████████████████████████████████████████████████");
        System.out.println("█████████████████* VEHICLE REGISTRATION/REGISTRO DE AUTOMOVILES *████████████████████");
        System.out.println("█████████████████████████████████████████████████████████████████████████████████████");

        char opcion;
        Scanner opcionX = new Scanner(System.in);
        do {
            metodo01 pruebaInvoc = new metodo01();
            pruebaInvoc.userInput();
            pruebaInvoc.monitorMetod01();
            System.out.println("█N° registration/registro: " + metodo01.ID);
            System.out.println("█Enter another vehicle (y/n) [use lower case]█Ingresar otro vehiculo (s/n) [utilice minúsculas]");
            opcion = opcionX.next().charAt(0);
        } while (opcion !='n');

    }
}