/* Ilari Tuominen*/
public class OppilaitosTest {
	public static void main(String[] args) {
		Oppilaitos hh = new Oppilaitos("Haaga-Helia", "Helsinki", 100500);
		Oppilaitos metro = new Oppilaitos("Metropolia", "Helsinki", 16500);
		Oppilaitos tamk = new Oppilaitos("TAMK", "Tampere", 10000);
		
		System.out.println(hh.toString());
		
		System.out.println(metro.toString());
		
		System.out.println(tamk.toString());
	}




}
