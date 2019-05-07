package Model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BisnisServis.crudMetode;

public class GlavnaKlas {

	public static void main(String[] args) {
		
	
		Scanner ucitaj=new Scanner(System.in);
		
		System.out.println("Unesite naziv marke");
		String nazivMarke=ucitaj.nextLine();
		System.out.println("Unesite zemlju");
		String zemlja=ucitaj.nextLine();
		System.out.println("Unesite ulicu");
		String ulica=ucitaj.nextLine();
		
		System.out.println("Unesite grad");
		String grad=ucitaj.nextLine();
		//int idMarke=Integer.parseInt(ucitaj.nextLine());
		
		//System.out.println("Ukucaj zemlju");
		
		//String zemlja=ucitaj.next();
	
		ucitaj.close();
		
		crudMetode metode=new crudMetode();
		metode.ubaciMarku(nazivMarke, zemlja, grad, ulica);
		
		
		
		
	}

}
