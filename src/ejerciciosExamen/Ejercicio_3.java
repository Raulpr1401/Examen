package ejerciciosExamen;


import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 10: ");
		int num = input.nextInt();
		if (num>10) {
			System.out.println("Fuera de rango");
		 } else if (num<1){
			System.out.println("Fuera de rango");
		   }else {
			   for (int i = 0; i <= 10 ; i++) {
				   System.out.println(num + " x " + i + " = " + num*i);
			   }
			   
		    }	
			
		input.close();
	}

}
