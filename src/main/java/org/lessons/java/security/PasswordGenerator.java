package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserire nome utente: ");
		String firstName = sc.next();
		
		System.out.println("Inserire cognome utente: ");
		String lastName = sc.next();
		
		System.out.println("Inserire colore preferito: ");
		String color = sc.next();

		System.out.println("Inserire giorno di nascita: ");
		int day = sc.nextInt();
		
		System.out.println("Inserire mese di nascita: ");
		int month = sc.nextInt();
		
		System.out.println("Inserire anno di nascita: ");
		int year = sc.nextInt();
		
        int sum = day + month + year;
        
        String password = firstName+lastName+color+sum;
        
        System.out.printf("La password risultante è: %s", password);
		
	}

}
