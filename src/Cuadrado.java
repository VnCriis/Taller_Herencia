public class Cuadrado extends Regulares{
    public Cuadrado(String nombre) {
        super(nombre);
    }

    public Cuadrado(String nombre, int base, int altura) {
        super(nombre, base, altura);
    }
    public void tipoCuadrado(){
        System.out.println("Un Ejemplo de Figura Regular es es: ");
        System.out.println(this.nombre);
        System.out.println("El area del cuadrado es: ");
        System.out.println(this.base*this.altura);
    }
}
