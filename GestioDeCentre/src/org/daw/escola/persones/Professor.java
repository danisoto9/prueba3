package org.daw.escola.persones;


public class Professor extends Persona {
	
	String especialitat;

	public Professor(String nom, String Llinatges, String dataNaixement, String especialitat) {
		super(nom, Llinatges, dataNaixement);
		this.especialitat=especialitat;
	}
	
	public String consulta_especialitat(){
		return especialitat;
	}
	
	public void establecer_especialitat(String especialitat){
		this.especialitat=especialitat;
	}

	
	public String toString() {
		return "Professor [nom: "+nom+", llinatges: "+Llinatges+", data naixement: "+dataNaixement+", especialitat=" + especialitat + "]";
	}
	
	/*PREGUNTA DEL APARTADO 5:
	/Quin accés han de tenir els atributs i mètodes de Persona per poder-los utilitzar directament des de Professor ?
	 Han de tenir el tipus d'acces protected, ja que amb aquest tipus d'acces es poden utilitzar/modificar a les classes que reben l'herencia de Persona.
	 */


}
