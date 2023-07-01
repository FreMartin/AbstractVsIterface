package Java;

import entidades.Animal;

/* Las interfaces se pueden usar a traves del POLIMORFISMO en su clase hija empleando
 * la palabra IMPLEMENTS*/
public class Gato implements Animal {
    @Override
    public void verNombre() {
        System.out.println("Mi nombre es: "+ Animal.nombre+" "+Gato.nombre);
    }

    @Override
    public int verEdad() {
        return 10;
    }
}
