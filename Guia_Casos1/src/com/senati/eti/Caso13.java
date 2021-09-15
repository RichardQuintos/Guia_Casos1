package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apellido = "";
		
		System.out.print("Ingrese el nombre: ");
		nombre = sc.nextLine();
		
		System.out.print("Ingrese el apellido: ");
		apellido = sc.nextLine();
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Área del círculo: " + nombre + " " + apellido);
	}

}
