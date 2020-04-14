package pglp_5.pglp_5_personnel;

import java.util.ArrayList;
import java.util.List;

public  class PersonnelAnnuaire implements Annu
{

     private String nomAnnu;
     private List<Personnel> listPersonnels = new ArrayList<Personnel>();

     public void printAnnuNom() 
     {
         // TODO Auto-generated method stub
         System.out.println("Annuaire de "+nomAnnu);
     }

     public PersonnelAnnuaire(String nom)
     {
         this.nomAnnu = nom;
     }

     public void addPersonnel(Personnel personnel)
     {
         listPersonnels.add(personnel);
     }

     public void removePersonnel(Personnel personnel)
     {
         listPersonnels.remove(personnel);
     }

     public void getPersonnel()
     {

     }

	public void printAnnuaireName() {
		// TODO Auto-generated method stub
		
	}

}