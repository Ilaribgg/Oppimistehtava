/* Ilari Tuominen */
import java.util.Scanner;
public class PolkupyoranKoko {
public static void main(String[] args) {

	System.out.print(SopivaPyora());
}
public static boolean SopivaPyora(){
Scanner lukija = new Scanner(System.in);
System.out.println("Syötä pyöräilijän pituus: ");

int syote = lukija.nextInt();
						{
	if (syote <= 80 && syote <= 100){
		System.out.println("Suositeltu pyörän koko: 12");
	}
	else if(syote <= 95 && syote <= 110){
	System.out.println("Suositeltu pyörän koko: 16");
	}
	else if(syote <= 105 && syote <= 140){
		System.out.println("Suositeltu pyörän koko: 20");
	}
	else if(syote<=130 && syote <= 150){
			System.out.println("Suositeltu pyörän koko: 24");
	}
	else if (syote<=140 && syote <=160);{
			System.out.println("Suositeltu pyörän koko: 26");
		}
	
}
return true;
}
}
