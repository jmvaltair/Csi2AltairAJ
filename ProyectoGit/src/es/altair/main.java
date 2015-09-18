package es.altair;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		
		System.out.println("¿Cómo te llamas?");
		nombre = sc.next();
		
		sc.close();
	}

}
