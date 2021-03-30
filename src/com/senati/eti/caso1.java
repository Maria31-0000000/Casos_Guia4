package com.senati.eti;

public class caso1 {

	public static void main(String[] args) {
		String[] nombre = new String [4];
		
		nombre[0] = "Maria Rodriguez";
		nombre[1] = "Jose Cardenas";
		nombre[2] = "Charito Ttito";
		nombre[3] = "Liam Gonzales";
		
		for (int i = 0; i < nombre.length; i++)
		System.out.println("Nombre " + (i + 1) + ": " + nombre[i]);

	}

}
