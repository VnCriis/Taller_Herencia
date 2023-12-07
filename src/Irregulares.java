public class Irregulares extends DosD{
    public Irregulares(String nombre) {
        super(nombre);
    }

    public Irregulares(String nombre, int base, int altura) {
        super(nombre, base, altura);
    }
    public void tipoRegular(){
        System.out.println("El tipo de figura 2D es: ");
        System.out.println(this.nombre);
    }
}
