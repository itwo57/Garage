package Voiture;

public class Climatisation implements Option {
	@Override
	public Double getPrix() {
		return 347.3d;
	}
	public String toString() {
		return "Climatisation (" + this.getPrix() + "€)";
	}

	

}
