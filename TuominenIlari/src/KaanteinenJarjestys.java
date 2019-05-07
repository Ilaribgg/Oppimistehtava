/* Ilari Tuominen */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class KaanteinenJarjestys {
 public static void main(String[] args) {
	 Scanner lukija = new Scanner(System.in);
	 List<String> lista = new ArrayList<String>();

	 System.out.println("Syötä tekstiä. Tyhjä rivi lopettaa: ");
	 while(true){
		 
	 String syote = lukija.nextLine();
	 if("".equals(syote)){
	 break;
	 }else {
		 lista.add(syote);
	 }

	 }
	 
	
	for (int i =0; i< lista.size(); i++){ 		
		System.out.println(lista.get(i));
		lukija.close();
	}
}
}
