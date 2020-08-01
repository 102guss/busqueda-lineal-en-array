
package cola;

public class Cola {
   private Object [] colaArr;                //Arreglo que contiene los elementos de la cila
   private int tamanoMax;                    //Guarda el tamaño maximo del arreglo
   private int frente;                       //apunta al primer elemen to de la cola
   private int fin;                          //apunta añ ultimo elemento de la cola
   private int numElems;                      //lleva el control dek numero de ele men tod en la cola
 //....................................................................................................................
 //constructor - inicializa valores  de la cola

    public Cola(int tamano) {
        
    tamanoMax = tamano;
    colaArr = new Object [tamanoMax];        // inatancia arreglo que guarda elementos de la cola
    fin = -1;                                //la vsriable fin la inicializa mos a -1;
    frente = 0;                              // la variable frente la inicializamos a 0;
    numElems = 0;                            // numElems se inicializa a 0; (la cola esta vacia , sin argumentos)
        
    }
   
   
    
    
}
