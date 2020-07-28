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
        
       
        
        
        
    }
}
