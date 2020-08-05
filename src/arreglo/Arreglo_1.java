package arreglo;

public class Arreglo_1 {

    private int[] arr;         // referencia a arreglo con elementos tipo long
    private int numElements;   //numero actual de elementos en arreglo

    //constructor
    public Arreglo_1(int tam) {
        arr = new int[tam];
        numElements = 0;     //se inicializa numero de elementos en "cero"
    }

    //---------------------------------------------------------------------
    //metodo que busa un valor especifico en un array
    //el argumento dato especifica el valor del elemento a buscar
    public boolean buscar(int dato) {
        int j;
        for (j = 0; j < numElements; j++) {

            if (arr[j] == dato) {
                break;
            }
        }

        if (j == numElements) { //quiere decir que se recoorio todos los elementos del array  
            return false;  //y retorna false porque no encontro el dato
        } else {
            return true;
        }

    }
    //-----------------------------------------------------
    //ahora vamos a crear el metodo insertar
    //se insertara al final de la celda del array

    public void insertar(int dato) { //se recibe un parametro

        arr[numElements] = dato;  //se inserta al final de todos los elementos del arreglo lineal
        numElements++;   //se incrementa el numero de elemento en uno

    }

    //definicion del metodo eliminar
    public boolean eliminar(int dato) {
//primero recorreremos el array y si el elemento = dato rompemos
        int j;
        for (j = 0; j < numElements; j++) {

            if (arr[j] == dato) {
                break;
            }
        }
        if (j == numElements) {
            return false;
        } else {

            for (int k = j; k < numElements; k++) {
                arr[k] = arr[k + 1];
            }
            numElements--;
            return true;
        }

    }

    //metodo mostrar elementos para la clase arreglo
    public void mostrarElementos() {

        for (int j = 0; j < numElements; j++) {

            System.out.print(arr[j] + " ");

        }
        System.out.println("");

    }
    
    //metodo que muestra el valor del elemento en la posicion "i" del arreglo
    
    public int mostrar(int i){
        return arr[i];
            
        }
    
    
    }


