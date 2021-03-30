package com.senati.eti;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declarar el arreglo
		Integer [] numero = new Integer[5];
		
		System.out.println("INGRESE NUMEROS");
		System.out.println("---------------");
		
		
		//Leer los datos para el arreglo
		for( int x = 0; x < numero.length; x++) {
			System.out.print("Numero " + (x + 1) + ": ");
		    numero[x] = sc.nextInt();
		}
		    //ORDENAR DE FORMA ASCENDENTE
		Arrays.sort(numero);
		
		System.out.println("\nNUMEROS ORDENADOS ASCENDENTEMENTE");
		System.out.println("---------------------------------");
		for( int x = 0; x < numero.length; x++) 
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);
		
		    //ORDENAR DE FORMA ASCENDENTE
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("\nNUMEROS ORDENADOS DESCENDENTEMENTE");
		System.out.println("---------------------------------");
		for( int x = 0; x < numero.length; x++) 
			System.out.println("Numero " + (x + 1) + ": " + numero[x]);
		
		
		
		
		   

	}

}
