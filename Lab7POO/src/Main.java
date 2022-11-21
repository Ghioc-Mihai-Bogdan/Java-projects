
public class Main {

	public static void main(String[] args) {
		Persoana p1 = new Persoana("Killa","Fonic","Ploiesti");
		Persoana p2 = new Persoana("Romanian","FinalBoss","Polonia");
		
		p1.realizeazaImprumut(2, "semestriala");
		p2.realizeazaImprumut(10,"trimestriala");
		
		p1.getImprumut().platesteRata();
		p2.getImprumut().platesteRata();
		System.out.println(p1+"\n"+p2);
	}

}
