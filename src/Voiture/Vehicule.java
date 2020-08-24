package Voiture;
import Moteur.*;
import Voiture.Option;


import java.io.Serializable;
import java.util.*;
import java.util.List;


public class Vehicule extends Moteur {
	
	protected double prix;
	protected String nom;
	protected List<Option> options = new ArrayList<Option>();
	protected Marque nomMarque;
	
	public String toString(){
		String y = "+ Voiture " + this.getMarque() + " : " +   this.nom  + " Moteur "+  this.type + " " + this.cylindre + " (" + this.getPrix() + "€) " + this.getOption() + " d'une valeur totale de " + this.getPrixtot() + " €" ;
		return  y;
	}
	
    public  List<Option> getOption(){
        return this.options;
    }
    
	 public double getPrix(){
		return this.prix ;
	}
	
	 public double getPrixtot(){
			Double prixOp = 0.00 ;
		 for (int i = 0; i < options.size(); i++) {
			 prixOp = options.get(i).getPrix() + prixOp;
		 }
			 
		return this.getPrix() + prixOp ;
	}
		
	public Marque getMarque() {
		return nomMarque;
	}

	public void setMoteur(Moteur a){
		this.cylindre = a.cylindre;	
		this.type = a.type;

	}

	public void addOption(Option b) {
		this.options.add(b);
		
		
		
	}




		
	}
	
	
	//abstract List<Option> getOptions();
	


