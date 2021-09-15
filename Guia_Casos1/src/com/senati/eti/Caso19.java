package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el lado del triángulo: ");
		float lado = sc.nextFloat();
		
		float perimetro = lado * 3;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Perimetro del triangulo..: " + perimetro);
	}

}
