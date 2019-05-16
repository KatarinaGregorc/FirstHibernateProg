package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="moja_tabela_marki")
public class Marka {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idMarke;
	@Column (name="pera")
	private String nazivMarke;
	@Embedded
	private Adresa adresa;
	@ManyToMany
	private List<User> listaUsera=new ArrayList<User>();
	
	public int getIdMarke() {
		return idMarke;
	}
	public List<User> getListaUsera() {
		return listaUsera;
	}
	public void setListaUsera(List<User> listaUsera) {
		this.listaUsera = listaUsera;
	}
	public void setIdMarke(int idMarke) {
		this.idMarke = idMarke;
	}
	public String getNazivMarke() {
		return nazivMarke;
	}
	public void setNazivMarke(String nazivMarke) {
		this.nazivMarke = nazivMarke;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	/*public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/

	
	

}
