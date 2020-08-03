package cola;

public class Cola {

    private Object[] colaArr;                //Arreglo que contiene los elementos de la cila
    private int tamanoMax;                    //Guarda el tamaño maximo del arreglo
    private int frente;                       //apunta al primer elemen to de la cola
    private int fin;                          //apunta al ultimo elemento de la cola
    private int numElems;                      //lleva el control dek numero de ele men tod en la cola
    //....................................................................................................................
    //constructor - inicializa valores  de la cola

    public Cola(int tamano) {

        tamanoMax = tamano;
        colaArr = new Object[tamanoMax];        // inatancia arreglo que guarda elementos de la cola
        fin = -1;                                //la vsriable fin la inicializa mos a -1;
        frente = 0;                              // la variable frente la inicializamos a 0;
        numElems = 0;                            // numElems se inicializa a 0; (la cola esta vacia , sin argumentos)

    }
    //.......................................................................................................................
    // inserta elemsnto al final de la cola

    public void insertar(Object elemento) {
        if (fin == tamanoMax - 1) {
            fin = -1;                               // hace que la cola sea circular

        }
        fin++;                                      // mueve el apuntador fin al siguiemte indice en colaArr   
        colaArr[fin] = elemento;                   //inserta el elemento en la posicion final del arreglo
        numElems++;                                // aumenta en uno el numero de elementos

    }//estamos asumiendo que el arreglo  nunca esta lleno pero podemos hacer exepciones pero lo primero seria comprobar si la pila esta vacia
 //.........................................................................................................................................
//retira el elemento que se encuentra en el frente de la cola
public Object quitar(){
    
Object temp = colaArr[frente];                      //optiene el elemento del frente de la cola y lo asigna a una variable temporal
frente +=1;                                       //se mueve frente a una posicion para que apunten al siguiente indice de la cola
    if (frente == tamanoMax) {
        frente = 0;                                //hace que la cola sea circular
    }
    numElems --;                                   //se reduce en uno el numero de elementos en la cola
    return temp;                                   //retornamos el elemento de la cabeza de la cola                                                 
}
//-------------------------------------------------------------------------------------------------------------------------------------------
	// devuelve el elemento que se encuentra al frente o primero en la cola
	public Object frenteCola() {
		return colaArr[frente];								// retorna elemento que esta en la cabeza de la cola
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------
	// devuelve true si la cola esta vacia (no tiene elementos)
	public boolean colaVacia() {
		return (numElems==0);								// retorna valor booleano dependiendo si la cola esta o no vacia
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------
	// devuelve true si la cola esta llena
	public boolean colaLLena() {
		return (numElems==tamanoMax);						// compara los valores del numero de elementos del arreglo con el tamaño del arreglo
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------
	// devuelve el numero de elementos que tiene la cola
	public int tamanoCola() {
		return numElems;									// retorna valor de la variable numElems
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------	
}
   









