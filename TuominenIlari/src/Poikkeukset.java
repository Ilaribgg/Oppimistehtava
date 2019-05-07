/*Ilari Tuominen*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class Poikkeukset {
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		while(true)
		try {
			Scanner lukija = new Scanner(System.in);
			
			System.out.println("Syötä kaksi: ");
			int a = lukija.nextInt();
			int b = lukija.nextInt();
			int summa = a + b;
			System.out.println(a +  " + " + b + " = " + summa);
			
		}catch (InputMismatchException e){
			System.out.println("Annoit väärin");
		continue;
		}finally {
			break;
		}
	}

}
