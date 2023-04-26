package main;

import java.util.Scanner;

import cola.ColaEstatica;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("INGRESE N:");
		int n = scan.nextInt();
		ColaEstatica cola = new ColaEstatica(n);
		//INSERCION DE DATOS
		System.out.println("INGRESE LOS ELEMENTOS DE LA COLA");
		while(!cola.full()) {
			int datos = scan.nextInt();
			cola.push(datos);
		}
		System.out.println("INGRESE K");
		int k = scan.nextInt();
		System.out.println("EL RESULTADO ES:");
		while(!cola.empty()) {
			int resultado = cola.pop() * k;
			System.out.print(resultado + " ");
		}
		
		
	}

}
