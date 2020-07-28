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
    //metodo que inserta una lemeto en la cima de la pila
    public void insertar(Object elemento){
    
    cima += 1;                                         //incrementa el valor de la cima en 1                 
    arregloPila[cima]= elemento;                       //inserta elemento en la cima de la pila   
    }
   //.................................................................................................................................
   //metodo que retira ele elemento que se encuentra en la cima de la pila y retorna este elemento eliminado
    public Object quitar(){
    Object temp = arregloPila[cima];                  //guardamos en variable temp el elemento de la cima de la pila
    cima -=1;                                         //decrementamos el vaor de cima en 1     
    return temp;                                      //retorna ele elemento eliminado
    }
 //,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..............................................................................................
//metodo que devuelve ele emelemeto que se enecunentra en la cima de la pila
   public Object cimaPila(){
   return arregloPila[cima];
   } 
  //....................................................................................................................................  


//metodo que verifica si la pila esta vacia(no tienen elementos)
    public boolean pilaVacia(){
    
    return cima == -1;
    }
    
   //..................................................................................................................................
  //metodo qeu¡¡ue verifica si la pila esta llena(comprueba sila cima es tamanoPila-1 )
   public boolean pilaLLena(){
   
   return cima ==tamanoPila-1;
   } 
  //....................................................................................................................................
  //metodo que ddevuelce el numero actual de delementos den la pila
   public int tamano(){
   
   return cima +1;
   }
  //.....................................................................................................................................
 //metodo que imprime todos los elementos de la pila
   public void MoatrarElementosPila(){
   
       for (int i = 0; i < tamano(); i++) {
           System.out.print(arregloPila[i]);
           System.out.print(" ");
       }
       
   }
        
        
        
        
    
    
    
    
}
