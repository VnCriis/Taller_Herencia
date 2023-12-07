public class Cilindro extends Cuerpos_redondos{
    public Cilindro(String nombre, double altura, String clasificación_figuras3d, String tipo, double radio, double pi) {
        super(nombre, altura, clasificación_figuras3d, tipo, radio, pi);
    }
    public void resultado(){
        System.out.println("El perímetro del cilindro es:"+(getRadio()*2*getPi())+getAltura()*2);
        System.out.println("El volúmen del cilindro es:"+(Math.pow(getRadio(), 2)*getPi()*getAltura()));
        /*System.out.println("El perímetro del cilindro es:"+(this.radio*2*this.pi)+this.altura*2);
        System.out.println("El volúmen del cilindro es:"+Math.pow(this.radio, 2)*this.pi*this.altura);*/
    }
}
