package ejerciciosExamen;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe una palabra: ");
		String palabra = input.nextLine();
		System.out.println(palabra.substring(0,9));
		System.out.println(palabra.substring(0,8));
		System.out.println(palabra.substring(0,7));
		System.out.println(palabra.substring(0,6));
		System.out.println(palabra.substring(0,5));
		System.out.println(palabra.substring(0,4));
		System.out.println(palabra.substring(0,3));
		System.out.println(palabra.substring(0,2));
		System.out.println(palabra.substring(0,1));
		
		
		input.close();
	}

}
