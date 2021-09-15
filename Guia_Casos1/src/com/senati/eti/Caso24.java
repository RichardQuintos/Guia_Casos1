package com.senati.eti;

import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer monto: ");
		float m1 = sc.nextFloat();
		
		System.out.print("Segundo monto: ");
		float m2 = sc.nextFloat();
		
		System.out.print("Tercer monto: ");
		float m3 = sc.nextFloat();
		
		float su = m1 + m2 + m3;
		float r1 = (m1 / 5) + (m2 * 20/100);
		float r2 = (m3 * 160 / 100) / 2;
		float r3 = su * 92 / 100;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Respuesta 1....: " + r1);
		System.out.println("Respuesta 2....: " + r2);
		System.out.println("Respuesta 3....: " + r3);
	}

}
