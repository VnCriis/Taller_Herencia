public class Cuerpos_redondos extends TresD{
    public Cuerpos_redondos(String nombre, double altura, String clasificación_figuras3d, String tipo, double radio, double pi) {
        super(nombre, altura, clasificación_figuras3d);
    }
    String tipo;
    double radio;
    double pi=3.1416;
    /*public Cuerpos_redondos(String tipo, double radio, double pi) {
        super(tipo);
        this.tipo = tipo;
        this.radio = radio;
        this.pi = pi;
    }*/
    public Cuerpos_redondos(String tipo, double radio, double pi) {
        super(tipo, radio, String.valueOf(pi));
        this.tipo = tipo;
        this.radio = radio;
        this.pi = pi;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    public void datosTipo(){
        System.out.println("Tipo de figura 3D:"+getTipo());
    }
}
