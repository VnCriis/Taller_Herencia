import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion, opcion2, opcion3;

        System.out.println("FIGURAS GEOMETRICAS Y SUS VARIACIONES");
        System.out.println("Menú");
        System.out.println("1. 2D");
        System.out.println("2. 3D");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la opción: ");
        opcion = entrada.nextInt();
        if (opcion == 1){
            System.out.println("1. Regulares");
            System.out.println("2. Irregulares");
            System.out.println("Ingrese la opcion: ");
            opcion2 = entrada.nextInt();
            if (opcion2 == 1) {
                System.out.println("Binevenido");
                System.out.println("Ingrese el valor de la base: ");
                int base = entrada.nextInt();
                System.out.println("Ingrese el valor de la altura: ");
                int altura = entrada.nextInt();
                Cuadrado C1 = new Cuadrado("Cuadrado",base,altura);
                C1.tipoCuadrado();
            }
        }

    }
}

