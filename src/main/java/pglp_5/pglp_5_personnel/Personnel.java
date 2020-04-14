package pglp_5.pglp_5_personnel;

import java.util.ArrayList;
import java.io.Serializable;
import java.time.LocalDate;

public final class Personnel implements Annu, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 730629534334772359L;
	
	private final String  nom;
	public String getNom(){return nom;}
	
	private final String prenom;
	 public String getPrenom() {
	        return prenom;   }
		
	private final java.time.LocalDate dateNaissance;
	 public java.time.LocalDate getDateNaissance() {
	        return dateNaissance;
	    }
	    
	private final ArrayList<Integer> numTelephone;
	public ArrayList<Integer> getNumTelephone() {
        return (ArrayList<Integer>) numTelephone.clone();
    }
	  private final int id;
	     public int getId() {
	        return id;
	    }

	public static class Builder {
		private final String  nom;
		private final String prenom;
		private final java.time.LocalDate dateNaissance;
		private ArrayList<Integer> numTelephone;
		 private static int idNext = 1;
	       private final int id;
		
		public Builder(final String nom, final String prenom, final java.time.LocalDate dateNaissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.numTelephone = new ArrayList<Integer>();
			this.id=idNext+1;
		}
		
		public Builder numeroTelephone(final  ArrayList<Integer> numTelephone) {
			this.numTelephone = numTelephone;
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	private Personnel(final Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		dateNaissance = builder.dateNaissance;
		numTelephone = builder.numTelephone;
		id = builder.id;
	}
	public void print() {
		System.out.print(prenom + " " + nom
			+ ", naissance : " + dateNaissance
			+ ", numéros de téléphone : ");
		for (Integer i : numTelephone) {
			System.out.print(i + "  ");
		}
		
	}
	public void printAnnuaireName() {
		// TODO Auto-generated method stub
		
	}

}
