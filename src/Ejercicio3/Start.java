package Ejercicio3;

public class Start {

	public static void main(String[] args) {

		
		Termometro termometro = new Termometro();
		
		termometro.addTemp(20);
		termometro.addTemp(22);
		termometro.addTemp(15);
		termometro.addTemp(-23);
		termometro.addTemp(5);
		termometro.addTemp(34);
		termometro.addTemp(13);
		
		
		
		
		System.out.println(termometro);
		System.out.println(termometro.buscarPrimero(22));
		System.out.println(termometro.buscarUltimo(5));
		System.out.println(termometro.getTemperaturaDia('m'));
	}

}
