package com.senati.eti;

public class caso6 {

	public static void main(String[] args) {
		String [][] datos = { {"Rosita Sanchez", "Lucho Ruiz", "Maria Rodriguez"},
				{"San Juan de Lurigancho", "Comas", "Callao"} };
		
		//MPRESION DE VALORES POR FILES
		
		for( int f = 0; f < datos.length; f++ ) {
			for ( int c = 0; c < datos[0].length; c++ )
				System.out.print(String.format("%- 20s", datos[f][c]) + "\t");
			
			System.out.println();
		}

	}

}
