package entidades;
/* Las interfaces contienen UNICAMENTE métodos y atributos ABSTRACTOS
que son constantes y públicos, su declaración puede ser implícita */
public interface Animal {

    String nombre = "Teodoro";

    /* Los métodos abstractos no llevan cuerpo, es decir terminan en punto y coma
y su funcionlidad se define en la clase hija*/

    void verNombre();
    int verEdad();
}
