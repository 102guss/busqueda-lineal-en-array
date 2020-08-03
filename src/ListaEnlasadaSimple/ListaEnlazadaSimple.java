
package ListaEnlasadaSimple;

public class ListaEnlazadaSimple {
    // variables de instancia
	private Nodo primero;							// referencia al primer nodo de la lista enlazada
//--------------------------------------------------------------------------------------------------------
	// constructor
	public ListaEnlazadaSimple() {
		primero = null;								// creamos lista enlazada vacia (sin elementos)
	}
//--------------------------------------------------------------------------------------------------------
	// verifica si la lista enlazada simple esta vacia
	public boolean vacia() {
		return (primero == null);					// comprueba si la variable primero apunta a null (lista vacia)
	}
//--------------------------------------------------------------------------------------------------------
	// inserta nodo en la cabeza de la lista enlazada simple
	public void insertarCabezaLista(Object d) {
		Nodo nuevoNodo = new Nodo(d);				// creamos un nuevo nodo
		nuevoNodo.siguiente = primero;				// enlazamos el nuevo nodo con el nodo en la cabeza de
													// la lista enlazada simple
		primero = nuevoNodo;						// el nuevo nodo es la nueva cabeza de la lista enlazada
	}
//----------------------------------------------------------------------------------------------------------
	// elimina nodo de la cabeza de la lista enlazada simple (asume que la lista enlazada no esta vacia)
	public Nodo eliminarCabezaLista() {
		Nodo temp = primero;						// guarda referencia al primer nodo en la variable temp
		primero = primero.siguiente;				// cambiamos referencia de la variable primero para que
													// apunte al segundo nodo (borramos primer nodo)
		return temp;								// retorna nodo eliminado (primer nodo)
	}
//----------------------------------------------------------------------------------------------------------	
	// imprime el contenido de los nodos de la lista enlazada simple
	public void mostrarLista() {
		System.out.print("Lista(primero -> ultimo):");			// recorremos lista enlazada desde el primero hasta el ultimo nodo
		Nodo nodoActual = primero;								// comenzamos en el primer nodo de la lista enlazada simple
		
		while(nodoActual!=null) {								// mientras no se llegue al final de la lista enlazada simple
			nodoActual.mostrarNodo();							// imprimimos el valor del campo dato del nodo actual
			nodoActual = nodoActual.siguiente;					// nos movemos al siguiente nodo de la lista enlazada simple
		}
		
		System.out.println("");									// dejamos linea en blanco
	}
//-----------------------------------------------------------------------------------------------------------
	// busca nodo con el dato del parametro pasado al metodo (asume una lista enlazada no vacia)
	public Nodo buscarLista(Object dato) {
		Nodo nodoActual = primero;								// iniciamos busqueda en el primer nodo de la lista enlazada simple
		
		while(!nodoActual.dato.equals(dato)) {					// mientras no se encuentre nodo con el dato buscado
			if(nodoActual.siguiente == null) {					// si llegamos al final de la lista enlazada simple
				return null;									// no se encontro dato buscado
			} else {											// no es el final de la lista enlazada simple
				nodoActual = nodoActual.siguiente;				// nos movemos al siguiente nodo
			}			
		}
		return nodoActual;										// retornamos nodo con dato buscado
	}
//-----------------------------------------------------------------------------------------------------------
	// borra nodo que contiene el objeto dato ingresado como parametro en el metodo (asume una lista enlazada no vacia)
	public Nodo eliminar(Object dato) {
		Nodo nodoActual = primero;								// iniciamos nodoActual para que apunte al primer nodo de la lista
		Nodo nodoAnterior = primero;							// iniciamos nodoAnterior para que apunte al primer nodo de la lista
		
		while(!nodoActual.dato.equals(dato)) {					// bucle itera mientras no se encuentre nodo con el valor de dato
			if(nodoActual.siguiente == null) {					// hemos llegado al final de la lista enlazada simple
				return null;									// no se encontro nodo con el valor de dato, metodo retorna null
			} else {											// no hemos llegado todavia al final de la lista enlazada simple
				nodoAnterior = nodoActual;						// desplazamos la variable nodoAnterior al siguiente nodo
				nodoActual = nodoActual.siguiente;				// desplazamos la variable nodoActual al siguiente nodo
			}			
		}
		
		// se encontro nodo a borrar
		if(nodoActual == primero) {								// si nodo a borrar es el primer nodo de la lista enlazada simple
			primero = primero.siguiente;						// eliminamos el primer nodo
		} else {												// si nodo a borrar no es el primer nodo de la lista enlazada simple
			nodoAnterior.siguiente = nodoActual.siguiente;		// borramos el nodo referenciado por la variable nodoActual
		}
		
		return nodoActual;										// metodo retorna el nodo eliminado
	}
//--------------------------------------------------------------------------------------------------------------
	/*
	 inserta nodo con parametro valorNuevo despues del nodo que contiene el valor del parametro valorExistente,
	 metodo retorna el nodo insertado, caso contrario de no poderse insertar nodo retorna null (metodo asume una
	 lista enlazada no vacia)
	*/
	public Nodo insertar(Object valorExistente, Object valorNuevo) {
		Nodo nuevoNodo = new Nodo(valorNuevo);					// creamos nuevo nodo con valorNuevo
		Nodo nodoActual = primero;								// iniciamos busqueda del nodo con valorExistente en
																// el primer nodo de la lista enlazada simple
		while(!nodoActual.dato.equals(valorExistente)) {		// bucle itera hasta encontrar nodo con valorExistente
			if(nodoActual.siguiente == null) {					// si llegamos al final de la lista enlazada
				return null;									// metodo retorna null (no se encontro nodo con valorExistente)
			} else {											// seguimos buscando nodo que contenga valorExistente
				nodoActual = nodoActual.siguiente;				// nos movemos al siguiente nodo para seguir buscando
			}
		}
		
		nuevoNodo.siguiente = nodoActual.siguiente;				// enlazamos el nuevo nodo con el nodo siguiente al nodo encontrado
		nodoActual.siguiente = nuevoNodo;						// enlazamos nodo encontrado con nuevo nodo creado
		
		return nuevoNodo;										// retornamos nuevo nodo insertado en la lista enlazada simple
	}	
//---------------------------------------------------------------------------------------------------------------
    
}
//*********************************************************************************************************
