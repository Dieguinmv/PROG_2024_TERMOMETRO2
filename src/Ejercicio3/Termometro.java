package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Termometro {
	
	
	
	private int temperaturas[];
	private int contador;
	
	
	public Termometro() {
		
		contador = 0;
		temperaturas = new int[7];
	}
	
	
	
	public void addTemp(int valor) {
		
		temperaturas[contador] = valor;
		contador++;
		
		if(contador==temperaturas.length) {
			contador=0;
		}
	}
	
	public int buscarUltimo(int valor) {
		
		int posicion = -1;
		for (int i = 0; i < temperaturas.length; i++) {
			
			if(temperaturas[i]==valor) {
				posicion= i;
			}
		}
		return posicion;
	}
	
	public int buscarPrimero(int valor) {
		int posicion = -1;
		int i =0;
		boolean encontrado = false;
		while((i<temperaturas.length) && (!encontrado)) {
			
			if(temperaturas[i]==valor) {
				posicion = i;
				encontrado = true;
			}
			
			i++;
		}
		
		return posicion;
	}
		
	
	public float getTemperaturaDia(char dia) {
		
		switch(dia) {
			
		case 'L','l': return temperaturas[0];
		case 'M','m': return temperaturas[1];
		case 'X','x': return temperaturas[2];
		case 'J','j': return temperaturas[3];
		case 'V','v': return temperaturas[4];
		case 'S','s': return temperaturas[5];
		case 'D','d': return temperaturas[6];
		default: return temperaturas[0];
		}
	}
	
	
	
	
	public String toString() {
		return Arrays.toString(temperaturas);
	}
	
	
	
	
	
	
	
}
