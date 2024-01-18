package Ejercicio3;

import java.util.Arrays;

public class Termometro {
	
	private int semana[];
	private int contador;
	
	public Termometro() {
		
		contador = 0;
		semana = new int[7];
	}
	
	
	
	public void addTemp(int temperatura) {
		
		semana[contador] = temperatura;
		contador++;
		
		if(contador==semana.length) {
			contador=0;
		}
	}
	
	public int buscar(int temperatura) {
		
		int posicion = -1;
		for (int i = 0; i < semana.length; i++) {
			
			if(semana[i]==temperatura) {
				posicion= i;
			}
		}
		return posicion;
	}
	public String toString() {
		return Arrays.toString(semana);
	}
	
	
	
	
	
	
	
}
