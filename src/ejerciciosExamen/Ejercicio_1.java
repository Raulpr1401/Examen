package ejerciciosExamen;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de segundos: ");
		int seg = input.nextInt();
		int horas = seg/3600;
		int min = (seg%3600)/60;
		int segRest = ((seg%3600)%60);
		
		System.out.println(seg + " segundos son: " + horas + "h, " + min + "min, " + segRest + "s.");
		
		if (horas>=24) {
			System.out.println("Es mas de un dia.");
		} else {
			System.out.println("No es mas de un dia.");
		}
		
		input.close();
	}

}
