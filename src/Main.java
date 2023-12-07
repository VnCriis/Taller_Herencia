import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion, opcion2, opcion3;
        System.out.println("FIGURAS GEOMETRICAS Y SUS VARIACIONES");
        System.out.println("Menú");
        System.out.println("1. 2D");
        System.out.println("2. 3D");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la opción: ");
        opcion = entrada.nextInt();
        if (opcion == 1){
            System.out.println("1. Regulares");
            System.out.println("2. Irregulares");
            System.out.println("Ingrese la opcion: ");
            opcion2 = entrada.nextInt();
            opcion3 = entrada.nextInt();
            if (opcion2 == 1) {
                System.out.println("Bienvenido");
                System.out.println("Ingrese el valor de la base: ");
                int base = entrada.nextInt();
                System.out.println("Ingrese el valor de la altura: ");
                int altura = entrada.nextInt();
                Cuadrado C1 = new Cuadrado("Cuadrado", base, altura);
                C1.tipoCuadrado();
            } else   {
                System.out.println("Con gusto te ayudare:");
                System.out.println("Ingrese el valor de la base: ");
                int base = entrada.nextInt();
                System.out.println("Ingrese el valor de la altura: ");
                int altura = entrada.nextInt();
                Rectangulo R1 = new Rectangulo( "Rectangulo", base, altura);
                R1.tipoRectangulo();
            }
        } else{
            System.out.println("1. Poliedros");
            System.out.println("2. Cuerpos redondos");
            System.out.print("Ingrese la opción:");
            opcion3=entrada.nextInt();
            if (opcion3==1){
                System.out.println("Insertar código respectivo");
            } else{
                System.out.println("Figura 3D: cilindro");
                System.out.print("Ingrese el valor del radio:");
                double radio=entrada.nextDouble();
                System.out.print("Ingrese el valor de la altura:");
                double altura=entrada.nextDouble();
                Cilindro cilindro1=new Cilindro("Cilindro", altura, "Cuerpos redondos", "3D", radio, 3.1416);
                cilindro1.resultado();
            }
        }
    }
}