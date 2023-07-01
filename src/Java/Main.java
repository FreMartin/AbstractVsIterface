package Java;
// Es necesario importar ya que se encuentran en distintos paquetes
// No se puede crear objetos directamente de las clases abstractas y las interfaces
import entidades.*;
public class Main {
    public static void main(String[] args) {
        Desarrollador dev = new Desarrollador();
        dev.nombre="Martin";
        dev.verNombre();
        dev.verNombre("Farfán");
        Gato michi = new Gato();
        michi.verNombre();
        System.out.println("Mi edad es: "+michi.verEdad()+" soy "+Gato.nombre+" "+Animal.nombre);
    }
}
