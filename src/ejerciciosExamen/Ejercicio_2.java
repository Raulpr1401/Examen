package ejerciciosExamen;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce tu nombre completo: ");
		String nom = input.nextLine();
		
		System.out.println("Caracteres totales: " + nom.length());
		System.out.println("Primera letra: " + nom.charAt(0));
		
		input.close();
	}

}
