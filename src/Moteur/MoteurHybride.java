package Moteur;

public class MoteurHybride extends Moteur {
	
	public MoteurHybride(String string, double d) {
		this.cylindre = string;
		this.prix = d;
		this.type = TypeMoteur.HYBRIDE;
	}
}
	
