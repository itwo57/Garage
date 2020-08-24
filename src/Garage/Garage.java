package Garage;
import Voiture.*;

import java.util.List;
import java.io.*;
import java.util.*;

public class Garage {
    String str = "";

    
	private List<Vehicule> voitures = new LinkedList<Vehicule>();


	private FileReader fr;
	
	public void addVoiture(Vehicule v) {
		voitures.add(v);
		try {
			str = v.toString();
			 FileWriter fw = new FileWriter("garage.txt", true);
			 fw.write(str + "\n");
			 fw.close();
;
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
		}

   
	public String toString() {
	System.out.println("*****************************");
	System.out.println("*   Garage OpenClassrooms   *");
	System.out.println("*****************************");
		return this.str ;
	}
	
	public Garage() {
	    try {
	        fr = new FileReader("garage.txt");
	        str = "";
	        int i = 0;
	        //Lecture des données
	        while((i = fr.read()) != -1)
	          str += (char)i;
    
            
		} catch (FileNotFoundException  e) {
			System.err.println("Aucune voiture sauvegardée !");
		} catch (IOException  e) {
	         e.printStackTrace();
		}

	}



	}


