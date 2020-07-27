package pila;
//implementacion de la clase pila con Arreglo encapsulado. El arreglo se encargara de guardar los elementos de la pila

public class Pila {

    private Object[] arregloPila;                      //arreglo que contiene los elementos de la pila
    private int tamanoPila;                            //tamaño del arreglo arregloPila           
    private int cima;                                  //variable que contiene el valor del indice de la cima de la pila         
    //.............................................................................................................................
    //constructor

    public Pila(int tamano) {
        this.tamanoPila = tamano;                      //establece el tamaño del arreglo arregloPila         
        cima = -1;                                     //el valor cima -1 indica que la pila esta vacia(no elementos)
        arregloPila = new Object[tamanoPila];          //creacion del arreglo que contedra los elementos de la pila       
    }

    //-------------------------------------------------------------------------------------------------------------------------.....
    public void insertar(Object elemento){
    
    cima += 1;                                         //incrementa el valor de la cima en 1                 
    arregloPila[cima]= elemento;                       //inserta elemento en la cima de la pila   
    }
   //.................................................................................................................................  
}
