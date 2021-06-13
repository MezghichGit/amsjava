package com.sip.ams.entities;

public class Candidat {
	
	private int id;
	private String nom;
	private String email;
	private String telephone;
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Candidat [id=" + id + ", nom=" + nom + ", email=" + email + ", telephone=" + telephone + "]";
	}

	public Candidat(int id, String nom, String email, String telephone) {
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
	}
	
	public Candidat() {
	
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
