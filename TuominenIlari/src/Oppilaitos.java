/* Ilari Tuominen */
public class Oppilaitos {

private String laitos;
private String osoite;
private int omaara;

public Oppilaitos(String laitos, String osoite, int omaara) {
	this.laitos = laitos;
	this.osoite = osoite;
	this.omaara = omaara;
}


@Override
public String toString(){
	return this.laitos + ", " + this.osoite  + " (" + this.omaara + ")";
}
}
