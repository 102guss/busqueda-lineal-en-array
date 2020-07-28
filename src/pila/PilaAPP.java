package pila;

public class PilaAPP {

    public static void main(String[] args) {
        //insetar eneros a la pila
        Pila pila = new Pila(5);
        pila.insertar(10);
        pila.insertar(20);
        pila.insertar(30);
        pila.insertar(40);
        pila.insertar(50);
        System.out.println("ELEMENTOS INSERTADOS EN LA PILA");
        pila.MoatrarElementosPila();

        System.out.println("");
        System.out.println("");
        System.out.println("ELEMENTO EN LA CIMA DE LA PILA: " + pila.cimaPila());

        System.out.println("");
        System.out.println("");
        System.out.println("Pila llena? " + pila.pilaLLena());  //comprueba si la pila esta llena

        System.out.println("");
        System.out.println("");
        System.out.println("Elementos eliminados de la pila");
        while (!pila.pilaVacia()) {                                              //mientras las pila no este vacia
            Object valor = pila.quitar(); //el ultimo en entrar ese ele primero en salir
            System.out.println("vaor eliminado " + valor);
        }
        //como la pila ya esta vacia, insertaremos nuevos elementos
        System.out.println("");
        // inserta nuevos elementos del tipo String a la pila
        pila.insertar("Perro");
        pila.insertar("Gato");
        pila.insertar("Raton");

        System.out.println("Elementos nuevos en la pila: ");
        pila.MoatrarElementosPila();
        
           System.out.println("");
              System.out.println("");
                 System.out.println("Cantidad de elementos en la pila: " +pila.tamano() );

    }
}
