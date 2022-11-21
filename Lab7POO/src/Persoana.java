import javax.swing.JOptionPane;

public class Persoana {
	private String nume, prenume, adresa;
	private Imprumut imprumut;
	public Persoana(String nume, String prenume, String adresa) {
		this.nume = nume;
		this.prenume = prenume;
		this.adresa = adresa;
	}
	public String getNume() {
		return this.nume;
	}
	public String getPrenume() {
		return this.prenume;
	}
	public String getAdresa() {
		return this.adresa;
	}
	public void realizeazaImprumut(double suma, String frecventa) {
		String tipimprumut = JOptionPane.showInputDialog("Introduceti tipul imprumutului");
				if (this.imprumut.equals("Apartament")) {
					this.imprumut = new ImprumutApartament(suma, frecventa);
				}
				else if (this.imprumut.equals("Casnic")) {
					this.imprumut = new ImprumutProdusCasnic(suma,frecventa);
					
				}
				else {
					this.imprumut = new Imprumut(suma,frecventa);
					this.imprumut.calculeazaRata();
				}
	}
	public Imprumut getImprumut() {
		return imprumut;
	}
	
}
