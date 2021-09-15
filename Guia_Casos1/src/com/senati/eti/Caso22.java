package com.senati.eti;

import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alu = "";
		
		System.out.print("Ingrese el nombre del alumno: ");
		alu = sc.nextLine();
		
		System.out.print("Ingrese primera nota: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Ingrese segunda nota: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Ingrese tercera nota: ");
		float n3 = sc.nextFloat();
		
		float pro = ((n1 * 20 / 100) + (n2 * 30 / 100) + (n3 * 50 / 100)) / 3;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Promedio del alumno: " + alu + " es " + pro);
	}

}
