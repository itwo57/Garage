package Moteur;

public class MoteurEssence extends Moteur {
	public MoteurEssence(String string, double d) {
		this.cylindre = string;
		this.prix = d;
		this.type = TypeMoteur.ESSENCE;
	}
}
