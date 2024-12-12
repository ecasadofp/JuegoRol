public class Ternario {

//Ejemplo uso operador ternario

    public static void main(String[] args) {

Personaje miPersonaje = Math.random() < 0.5?new Guerrero("Maolote", 3,5):new Mago("Buenísimo", 65, 2);

        System.out.println("Te ha tocado " + miPersonaje);


    }
}
