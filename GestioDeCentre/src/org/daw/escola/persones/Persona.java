package org.daw.escola.persones;

public class Persona {

	protected String nom;
	protected String Llinatges;
	protected String dataNaixement;
	
public Persona(String nom, String Llinatges, String dataNaixement){		
	this.nom=nom;
	this.Llinatges=Llinatges;
	this.dataNaixement=dataNaixement;
	
}	

public String consulta_nom(){
	return nom;
}

public String consulta_Llinatges(){
	return Llinatges;
}

public String consulta_dataNaixement(){
	return dataNaixement;
}

public void establecer_nom(String nom){
	this.nom=nom;
}

public void establecer_llinatges(String Llinatges){
	this.Llinatges=Llinatges;
}

public void establecer_data(String dataNaixement){
	this.dataNaixement=dataNaixement;
}

public String toString() {
	return "Persona [nom=" + nom + ", Llinatges=" + Llinatges
			+ ", dataNaixement=" + dataNaixement + "]";
}

}
