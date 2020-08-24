package Moteur;

public class MoteurDiesel extends Moteur {
	public MoteurDiesel(String string, double d) {
		this.cylindre = string;
		this.prix = d;
		this.type = TypeMoteur.DIESEL;
	}
}
