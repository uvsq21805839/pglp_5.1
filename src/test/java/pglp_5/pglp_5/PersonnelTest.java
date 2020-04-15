package pglp_5.pglp_5;

import static org.junit.Assert.*;

import java.time.LocalDate;
 

import org.junit.Test;

import pglp_5.pglp_5_personnel.Personnel;


public class PersonnelTest {
	@Test
	
	public void test() {
		
        Personnel p = new Personnel.Builder("Sekou", "Diawara", LocalDate.of(1991, 9, 12)).build();
        assertTrue(p.getNom().equals("Sekou") && p.getPrenom() == "Diawara" &&
                p.getDateNaissance().equals(LocalDate.of(1991, 9, 12)));
        
        Personnel p1 = new Personnel.Builder("Mamby", "Diawara", LocalDate.of(1989, 11, 14)).build();
        assertTrue(p1.getNom().equals("Mamby") && p.getPrenom() == "Diawara" &&
        		p1.getDateNaissance().equals(LocalDate.of(1989, 11, 14)));
        
        Personnel p2 = new Personnel.Builder("Oumou", "Diawara", LocalDate.of(1987, 12, 18)).build();
        assertTrue(p2.getNom().equals("Oumou") && p.getPrenom() == "Diawara" &&
        		p2.getDateNaissance().equals(LocalDate.of(1987, 12, 18)));
       
	
	}
	
}
