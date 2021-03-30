package com.senati.eti;
import java.util.Scanner;
public class caso5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Rosita Sanchez", "Lucho Ruiz", "Maria Rodriguez", "Marco Figini"};
		int[] arrNota = {13, 12, 17, 8};
		
		System.out.println("BUSQUEDA DE DATOS");
		System.out.println("-----------------");
		System.out.print("Ingrese Codigo.....: ");
		String codigo = sc.nextLine();
			
		int p = -1;
		
		for (int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo[x])) {
				p = x;
				break;
			}
		}
		
		if(p == -1) {
			System.out.println("\n------------------");
			System.out.println("Codigo no encontrado");
			System.out.println("--------------------");
		}
		else {
			System.out.println("\n-----------------");
			System.out.println("Codigo resgistrado");
			System.out.println("-------------------");
			System.out.println("Codigo..........: " + arrCodigo[p]);
			System.out.println("Alumno..........: " + arrNombre[p]);
			System.out.println("Nota............: " + arrNota[p]);
			
			if (arrNota[p] >= 13)
				System.out.println("Estado..........: Aprobado");
			else System.out.println("Estado..........: Desaprobado");
			
			
		}

	}


}


