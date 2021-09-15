package com.senati.eti;

import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese horas trabajadas: ");
		float horas = sc.nextFloat();
		
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = sueldo * 5 / 100;
		float total = sueldo + bono;
		float td = total / 3.24f;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Bono: " + bono);
		System.out.println("Total: " + total);
		System.out.println("Total en dólares: " + td);
	}

}
