package Moteur;


public enum TypeMoteur {
	
	DIESEL("Moteur DIESEL"),
	ESSENCE("Moteur ESSENCE"),
	HYBRIDE("Moteur HYBRIDE"),
	ELECTRIQUE("Moteur ELECTRIQUE");
	
	public String type = "";
	
	TypeMoteur(String type){
		this.type = type;
	}
	


}
