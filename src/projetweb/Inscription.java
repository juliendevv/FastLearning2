package projetweb;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
// @XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="inscription")
public class Inscription {

	private String nom;
	private String prenom;
	private Date date;
	
	
	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	
	
}
