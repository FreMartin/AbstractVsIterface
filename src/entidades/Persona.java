package entidades;
// Las clases abstractas pueden contener métodos y atributos ABSTRACTOS y/o DINAMICOS
public abstract class Persona {
    public String nombre;
    public void verNombre(){
        System.out.println("Mi nombre es " +nombre);
    }
    /* Los métodos abstractos no llevan cuerpo, es decir terminan en punto y coma
    y su funcionlidad se define en la clase hija*/
    public abstract void verNombre(String apellido);
}
