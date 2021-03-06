package BisnisServis;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Adresa;
import Model.Marka;
import Model.User;

public class crudMetode {

	private SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public void ubaciMarku(String nazivMarke,String zemlja,String grad,String ulica) {
		
		Adresa adresa = new Adresa();
		adresa.setZemlja(zemlja);
		adresa.setGrad(grad);
		adresa.setUlica(ulica);
		
		Marka marka=new Marka();
		
		marka.setNazivMarke(nazivMarke);
		marka.setAdresa(adresa);
		
		
		
		
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
		}finally {
			sesija.close();
		}
		
		
		
		
		
		
	}
	
	public Marka vratiMarku(int idMarke) {
		Marka marka =null;
		Session sesija=sf.openSession();
		sesija.beginTransaction();
		
		try {
		    marka =sesija.get(Marka.class,idMarke);
			sesija.getTransaction().commit();
			return marka;
			
			
		} catch (Exception e) {
			
			sesija.getTransaction().rollback();
			return null;
		}finally {
			
			
			sesija.close();
		}
		
		
		
		
		
	}
	
	public boolean azururajZemlju(int idMarke,String zemlja) {
		
		
		
		Marka marka =vratiMarku(idMarke);
		//marka=vratiMarku(idMarke);
		Session sesija=sf.openSession();
		sesija.beginTransaction();
		
		try {
			
			if(marka !=null) {
			marka.getAdresa().setZemlja(zemlja);
		    sesija.update(marka);
		    System.out.println("Uptade uspeo");
		    sesija.getTransaction().commit();
		    return true;
		    }else {
		    	System.out.println("Nije uspeo update");
		    	sesija.getTransaction().commit();
		    	return false;
		    }
			
		   // marka =sesija.get(Marka.class,idMarke);
			//sesija.getTransaction().commit();
		
			
			
		} catch (Exception e) {
			
			sesija.getTransaction().rollback();
			return false;
		}finally {
			
			
			sesija.close();
		
		
		
		
	}
	
	
	
	}
	
	public void ubaciUsera(String ime,String prezime,List<Adresa>listaAdresa) {
		User user=new User();
		user.setIme(ime);
		user.setPrezime(prezime);
		//user.setListaAdresa(listaAdresa);
		
		
		Session sesija=sf.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(user);
			
			sesija.getTransaction().commit();
		} catch (Exception e) {
		   sesija.getTransaction().rollback();
		}finally {
			sesija.close();
		}
	}
	
	
}
