package Voiture;

public class GPS implements Option {
	@Override
	public Double getPrix() {
		return 113.5d;
	}
	public String toString() {
		return  "GPS (" + this.getPrix() + "€)";
	}

	

}
