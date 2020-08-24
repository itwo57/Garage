package Moteur;

public class Moteur {
	public TypeMoteur type;
	public String cylindre;
	protected double prix;
	
	public Moteur() {
	cylindre ="Inconnu";
	prix = '0';
	}
		
	public Moteur(String cylindre, double prix) {
		
		this.cylindre = cylindre;
		this.prix = prix;
	
	}

	public String toString() {
		return cylindre;
	}
		
	public double getPrix() {
		return prix;
	}
}
