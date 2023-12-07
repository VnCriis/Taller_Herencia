public class Rectangulo extends Irregulares {
    public Rectangulo(String nombre) {
        super(nombre);
    }

    public Rectangulo(String nombre, int base, int altura) {
        super(nombre, base, altura);
    }

    public void tipoRectangulo() {
        System.out.println("Un Ejemplo de Figura Irregular es es: ");
        System.out.println(this.nombre);
        System.out.println("El area del Rectangulo es: ");
        System.out.println(this.base * this.altura);
    }
}