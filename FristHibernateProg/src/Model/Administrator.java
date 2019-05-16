package Model;

import javax.persistence.Entity;

@Entity
public class Administrator {
	private String banujOpertera;

	public String getBanujOpertera() {
		return banujOpertera;
	}

	public void setBanujOpertera(String banujOpertera) {
		this.banujOpertera = banujOpertera;
	}
	

}
