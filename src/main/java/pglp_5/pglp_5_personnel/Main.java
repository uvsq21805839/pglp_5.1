package pglp_5.pglp_5_personnel;


import java.time.LocalDate;


public final class Main {
	
	private Main() {
	}
	
    public static void main(final String[] args) {
        Personnel p = new Personnel.Builder("Sekou", "Diawara", LocalDate.of(1991,01,12)).build();
        System.out.println(p);
    }
}
