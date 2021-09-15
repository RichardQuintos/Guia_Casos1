package com.senati.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Precio de venta: ");
		float v = sc.nextFloat();

		float iv = v * 142 / 100;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Incremento de venta del 42%: S/." + iv);
	}

}
