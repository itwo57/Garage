package Moteur;

 public class MoteurElectrique extends Moteur {
	 
	public MoteurElectrique(String string, double d) {
		this.cylindre = string;
		this.prix = d;
		this.type = TypeMoteur.ELECTRIQUE;

	}

 }
