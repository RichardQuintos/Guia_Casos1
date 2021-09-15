package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		float a = 17 * 2 + 9 - 6;
		float b = a / 5;
		float c = 4.7f - (1.2f * 2);
		float d = 2 * c;
		float e = b - d;
		
		System.out.println("----------");
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("resultado: " + df.format(e));

	}

}
