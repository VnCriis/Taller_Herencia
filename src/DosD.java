public class DosD extends Figuras{
    int base;
    int altura;

    public DosD(String nombre) {
        super(nombre);
    }
    //metodo personalizado
    public void tipoFigura(){
        System.out.println("El tipo de figura es: ");
        System.out.println(this.nombre);
    }

    public DosD(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
