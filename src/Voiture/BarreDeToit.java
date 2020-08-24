package Voiture;

public class BarreDeToit implements Option {
	@Override
	public Double getPrix() {
		return 29.9d;
	}
	public String toString() {
		return "Barre de toit (" + this.getPrix() + "€)";
	}

	

}
