public class TresD extends Figuras{
    public TresD(String nombre) {
        super(nombre);
    }
    double altura;
    String clasificación_figuras3d;
    public TresD(String nombre, double altura, String clasificación_figuras3d) {
        super(clasificación_figuras3d);
        this.altura = altura;
        this.clasificación_figuras3d = clasificación_figuras3d;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getClasificación_figuras3d() {
        return clasificación_figuras3d;
    }
    public void setClasificación_figuras3d(String clasificación_figuras3d) {
        this.clasificación_figuras3d = clasificación_figuras3d;
    }
    public void clasificación(){
        System.out.println("Figura geométrica:"+getClasificación_figuras3d());
    }
}
