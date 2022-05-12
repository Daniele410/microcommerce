package com.ecommerce.microcommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@JsonFilter("monFiltreDynamique")
@Entity
public class Product {
	@Id
	private int id;
	private String nom;
	private int prix;

	// information que nous ne souhaitons pas exposer
//	@JsonIgnore
	private int prixAchat;

	// constructeur par défaut

	public Product() {

	}

	// contructeur pour nos tests

	public Product(int id, String nom, int prix, int prixAchat) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.prixAchat = prixAchat;
	}

	public int getId() {
		return id;
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

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	@Override
	public String toString() {
		return "Product {id=" + id + ", nom=" + nom + ", prix=" + prix + ", getId()=" + getId() + ", getNom()="
				+ getNom() + ", getPrix()=" + getPrix() + "}";
	}
}
