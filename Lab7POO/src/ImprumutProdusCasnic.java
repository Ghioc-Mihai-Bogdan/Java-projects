
public class ImprumutProdusCasnic extends Imprumut{
	public ImprumutProdusCasnic(double suma, String frecventa) {
		super(suma,frecventa);
	}
	
	public void calculeazarata() {
		if(this.frecventa.equals("semestriala")) {
			this.rata=6*0.1*this.getSuma();//0.1*this.suma e lunar
			this.rata*=1.07;
		}
		else {
			super.calculeazaRata();
		}
	}
}
