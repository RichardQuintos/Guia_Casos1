package com.senati.eti;

import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pro = "";
		
		System.out.print("Ingrese el nombre del producto: ");
		pro = sc.nextLine();
		
		System.out.print("Imgrese el precio: ");
		float p = sc.nextFloat();
		
		System.out.print("Ingrese cantidad: ");
		float c = sc.nextFloat();
		
		float ip = p * c;
		float igv = ip * 18 / 100;
		float des = ip * 3 / 100;
		float total = ip - des - igv;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Importe....: S/." + ip);
		System.out.println("IGV........: S/." + igv);
		System.out.println("Descuento..: S/." + des);
		System.out.println("Total......: S/." + total);
	}

}
