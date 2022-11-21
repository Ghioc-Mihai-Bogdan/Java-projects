
public class ImprumutApartament extends Imprumut{

	
	public ImprumutApartament(double suma, String frecventa) {
		super(suma,frecventa);
	}
	public void calculeazaRata() {
		if(this.frecventa.equals("trimestriala")) {
			this.rata=3*0.1*this.getSuma();//0.1*this.suma e lunar
			this.rata*=1.03;
		}
		else {
			super.calculeazaRata();
		}
		
	}
}
