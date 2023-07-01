package Java;

import entidades.Persona;
/* En ciertos casos es necesario importar la clase manualmente ya que
* se encuentra en otra clase, generalmente se importa automáticamente*/
/* Las clases abstractas solo se pueden usar a traves de la HERENCIA en su clase hija empleando
* la palabra EXTENDS*/
public class Desarrollador extends Persona {
    public Desarrollador() {
    }

    @Override
    public void verNombre(String apellido) {
        System.out.println("Mi nombre es: "+this.nombre+" mi apellido es : "+apellido);
    }
}
