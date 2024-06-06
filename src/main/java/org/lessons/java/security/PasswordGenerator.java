package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//serie di input
		System.out.println("Inserire nome utente: ");
		String firstName = sc.nextLine();
		
		System.out.println("Inserire cognome utente: ");
		String lastName = sc.nextLine();
		
		System.out.println("Inserire colore preferito: ");
		String color = sc.nextLine();
		
		System.out.println("Inserire data di nascita nel formato gg/mm/aaaa: ");
		String date = sc.nextLine();
		
		sc.close();

		//qui si splitta la stringa con la data con separatore '/'
		String[] datef = date.split("/");
		//poi si convertono le tre parti dell'array risultante in intero, facendo la somma
        int sum = Integer.parseInt(datef[0]) + Integer.parseInt(datef[1]) + Integer.parseInt(datef[2]);
   
        //concatenazione di ogni parte
        String password = firstName + "-" + lastName + "-" + color + "-" + sum;
        
        //output
        System.out.printf("La password risultante è: %s", password);
		
	}

}
