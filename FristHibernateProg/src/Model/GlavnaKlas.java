package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GlavnaKlas {

	public static void main(String[] args) {
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Marka marka=new Marka();
	
		marka.setNazivMarke("BMW");
		marka.setZemlja("Nemacka");
		System.out.println(marka.getNazivMarke());
		
		Session sesija=sf.openSession();
		sesija.beginTransaction();
		try {
			
			
			sesija.persist(marka);
			sesija.getTransaction().commit();
			System.out.println("Uspesno ubacena marka");
			
		} catch (Exception e) {
			// TODO: handle exception
			sesija.getTransaction().rollback();
			System.out.println("Nista");
		}
		sesija.close();
		
		
	}

}
