package com.senati.eti;

import java.util.Scanner;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero de aprobados: ");
		float ap = sc.nextFloat();
		
		System.out.print("N�meros de desaprobados: ");
		float dp = sc.nextFloat();

		System.out.print("N�mero de retirados: ");
		float rt = sc.nextFloat();
		
		float total = ap + dp + rt;
		float apro = ap * 100 / total;
		float desa = dp * 100 / total;
		float reti = rt * 100 / total;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Aprobados.....: " + apro + "%");
		System.out.println("Desaprobados..: " + desa + "%");
		System.out.println("Retirados.....: " + reti + "%");
	}

}
