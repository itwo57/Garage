package Voiture;

public class VitreElectrique implements Option {
	@Override
	public Double getPrix() {
		return 212.35d;
	}
	public String toString() {
		return "Vitre electrique (" + this.getPrix() + "€)";
	}

	

}
