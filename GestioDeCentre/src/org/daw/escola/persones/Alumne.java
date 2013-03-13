package org.daw.escola.persones;


public class Alumne extends Persona {
	String curs;
	
	public Alumne(String nom, String Llinatges, String dataNaixement, String curs) {
		super(nom, Llinatges, dataNaixement);
		this.curs=curs;
	}

	public String consulta_curs(){
		return curs;
	}
	
	public void establecer_curs(String curs){
		this.curs=curs;
	}
}
