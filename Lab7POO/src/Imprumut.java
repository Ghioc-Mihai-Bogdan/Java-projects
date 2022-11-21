
public class Imprumut {
	private static int id = 1;
	private int numar;
	private double suma;
	protected double rata;
	private double sumaNeplatita;
	protected String frecventa;
	
	public Imprumut(double suma, String frecventa) {
		this.suma = suma;
		this.frecventa = frecventa;
		this.numar = id++;
		this.sumaNeplatita = this.suma;
	}
	
	public void calculeazaRata() {
		this.rata = this.suma*0.1;
	}
	public void platesteRata() {
		this.sumaNeplatita-=this.rata;
	}
	public double getSumaNePlatita() {
		return this.sumaNeplatita;
	}
	public double getSuma() {
		return this.suma;
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Imprumut pentru cumpararea unui ");
		sb.append(this.getClass().getName().substring(8));
		sb.append("\n");
		sb.append("Numarul imprumutului este: ");
		sb.append(this.numar);
		sb.append("\nSuma neplatita: ");
		sb.append(this.sumaNeplatita);
		sb.append("\nRata este: ");
		sb.append(this.rata);
		sb.append("\nSuma initial imprumutata: ");
		sb.append(this.suma);
		sb.append("\nFrecventa ratei: "+this.frecventa);
		return sb.toString();
	}
	
}
