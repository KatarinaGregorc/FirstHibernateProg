package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import BisnisServis.crudMetode;

public class GlavnaKlas {

	public static void main(String[] args) {
		
	
		/*Scanner ucitaj=new Scanner(System.in);
		
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
	
		ucitaj.close();*/
		
		/*crudMetode metode=new crudMetode();
		//metode.ubaciMarku(nazivMarke, zemlja, grad, ulica);
		metode.ubaciMarku("Moskvich", "SSSR","Moskva", "Staljinova");
		
		List<Adresa>ListaAdresa=new ArrayList<Adresa>();
		
		Adresa adresa1=new Adresa();
		adresa1.setZemlja("Srbija");
		adresa1.setGrad("Beograd");
		adresa1.setUlica("Knez Mihailova");
		
		ListaAdresa.add(adresa1);
		
		Adresa adresa2=new Adresa();
		adresa2.setZemlja("Srbija");
		adresa2.setGrad("Nis");
		adresa2.setUlica("Beogradska");
		
		ListaAdresa.add(adresa2);
		
		
		
		
		
		
		metode.ubaciUsera("Pera", "Peric",ListaAdresa);*/
		
		 SessionFactory sf=new Configuration().configure().buildSessionFactory();
		 
		/*List<Adresa>ListaAdresa=new ArrayList<Adresa>();
		List<Marka>marke=new ArrayList<Marka>();
		List<User>listauser=new ArrayList<User>();
		
		User user=new User();
		User user1 =new User();
		User user2=new User();
		User user3=new User();
		Marka marka=new Marka();
		Marka marka2=new Marka();
		
		Adresa adresa=new Adresa();
		
		adresa.setZemlja("Srbija");
		adresa.setGrad("Beograd");
		adresa.setUlica("Moja ulica");
		
		
		marka.setNazivMarke("Ferari");
		marka.setAdresa(adresa);
		//marka.setUser(user);
		marka2.setNazivMarke("lambo");
		marka2.setAdresa(adresa);
		//marka2.setUser(user);
		listauser.add(user);
		listauser.add(user2);
		listauser.add(user3);
		marka.setListaUsera(listauser);
		marka2.setListaUsera(listauser);
		
		
		user.setIme("Pera");
		user.setPrezime("Peric");
		
		ListaAdresa.add(adresa);
		
	
		*/
		 User user=new User();
		 Administrator administrator=new Administrator();
		 Operater operater=new Operater();
		
				Session sesija=sf.openSession();
		sesija.beginTransaction();
		try {
			//sesija.save(user);
			//sesija.save(user1);
			//sesija.save(user2);
			//sesija.save(user3);
			//sesija.save(marka);
			//sesija.save(marka2);
			
			sesija.getTransaction().commit();
			
		} catch (Exception e) {
		
			sesija.getTransaction().rollback();
		
		}finally {
			sesija.close();
		}
		 
		
		
	}

}
