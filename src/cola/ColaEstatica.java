package cola;

public class ColaEstatica {
	
	public int inicio = 0;
	public int fin = 0;
	public int[] arregloCola;
	public int tamañoPorDefecto = 5;
	//CONSTRUCTOR
	public ColaEstatica() {
		arregloCola = new int[tamañoPorDefecto];
	}
	//SOBRECARGA DEL CONSTRUCTOR
	public ColaEstatica(int nuevoTamaño) {
		arregloCola = new int[nuevoTamaño];
	}
	
	public void push(int dato) {
		arregloCola[fin] = dato;
		fin++;
		//arregloCola[fin++] = dato;
	}
	
	public int pop() {
		int x = arregloCola[inicio];
		inicio = inicio + 1;
		return x;
		//return arregloCola[inicio++];
	}
	
	public boolean empty() {
		if(inicio == fin)
			return true;
		return false;
	}
	
	public boolean full() {
		if(fin == arregloCola.length)
			return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
}
