
package ListaEnlasadaSimple;


public class Nodo {
    
    // variables de instancia
	public Object dato;										// referencia campo dato
	public Nodo siguiente;									// referencia al siguiente nodo en la lista enlazada
//----------------------------------------------------------------------------------------------------------------------
	// constructor
	public Nodo(Object d) {
		dato = d;											// guarda dato del nodo
		siguiente = null;									// siguiente apunta a null (no sabemos que nodo sigue)
	}
//-----------------------------------------------------------------------------------------------------------------------
	// metodo que imprime el valor del campo dato
	public void mostrarNodo() {
		System.out.print("{" + dato + "}");					// imprime valor del campo dato
	}
//------------------------------------------------------------------------------------------------------------------------
    
}
//************************************************************************************************************************