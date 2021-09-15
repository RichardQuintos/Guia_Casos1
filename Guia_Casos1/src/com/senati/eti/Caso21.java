package com.senati.eti;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Gasto: ");
		float g = sc.nextFloat();
		
		float dg = g * 88 / 100;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Total del gasto: " + dg);
	}

}
