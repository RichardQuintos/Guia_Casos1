package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa el radio de la circunferencia: ");
		float radio = sc.nextFloat();
		
		float area =radio * radio * 3.1416f;
		float perimetro = (radio * 2) * 3.1416f;
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Área del círculo: " + area);
		System.out.println("Perímetro....: " + perimetro);

	}

}
