public class Regulares extends DosD{
    public Regulares(String nombre) {
        super(nombre);
    }

    public Regulares(String nombre, int base, int altura) {
        super(nombre, base, altura);
    }
    public void tipoRegular(){
        System.out.println("El tipo de figura 2D es: ");
        System.out.println(this.nombre);
    }
}
