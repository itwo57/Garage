package Voiture;

public class SiegeChauffant implements Option {
	@Override
	public Double getPrix() {
		return 562.9d;
	}
	public String toString() {
		return "Siège Chauffant (" + this.getPrix() + "€)";
	}

	

}
