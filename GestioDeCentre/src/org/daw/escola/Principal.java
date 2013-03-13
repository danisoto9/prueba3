package org.daw.escola;

import java.util.ArrayList;


import org.daw.escola.persones.*;

public class Principal {
	static ArrayList <Alumne> alumnes;
	static ArrayList<Professor>professors;
	
	int x=0;
	String nom;
	String llinatges;
	String dataNaixement;
	
	int valor=0;
	
public Principal(){
	
	alumnes =new ArrayList<Alumne>();
	professors=new ArrayList<Professor>();
	
	  
		
}

public void introduirDades(){
	
	Alumne a1=new Alumne("Dani","Soto Moreno","24/11/1987","DAW1A");
	Alumne a2=new Alumne("Pep","Flaquer Fernández","15/10/1985","DAW1A");
	Alumne a3=new Alumne("Tomeu","Gili Hernández","03/03/1988","DAM1A");
	

	Professor pr1=new Professor("Mateu","Fuster Oliver","21/09/1969","DAW1A");
	Professor pr2=new Professor("Juan","Sánchez Nieto","11/10/1967","DAW1A");
	Professor pr3=new Professor("Miquel","Febrer Flaquer","07/06/1967","DAM1A");

	ArrayList<Alumne> alumnes;
	alumnes=new ArrayList<Alumne>();
	
	alumnes.add(a1);
	alumnes.add(a2);
	alumnes.add(a3);
	
	ArrayList<Professor> professors;
	professors=new ArrayList<Professor>();
	
	professors.add(pr1);
	professors.add(pr2);
	professors.add(pr3);
	
	if(valor==0){
		
	Persona A=alumnes.get(x);
	
	
	this.nom=A.consulta_nom();
	this.llinatges=A.consulta_Llinatges();
	this.dataNaixement=A.consulta_dataNaixement();
	}
		

	
	else{
	Persona B=professors.get(x);
	
	this.nom=B.consulta_nom();
	this.llinatges=B.consulta_Llinatges();
	this.dataNaixement=B.consulta_dataNaixement();
	}
	
}
public void mostrarDades(){
System.out.println("Alumnes:");
for(int y=0;y<=2;y++){
	
	introduirDades();
	imprimir(this.nom,this.llinatges,this.dataNaixement);
	x++;
	}
x=0;

System.out.println("Professors:");
for(int y=0;y<=2;y++){
	valor=1;
	introduirDades();
	imprimir(this.nom,this.llinatges,this.dataNaixement);
	x++;
	}

}

private void imprimir (String nom,String llinatges, String dataNaixement){

	
	this.nom=nom;
	this.llinatges=llinatges;
	this.dataNaixement=dataNaixement;
	
	

	 System.out.println( "Nom: " + nom + ", Llinatges: " + llinatges
				+ ", Data de Naixement: " + dataNaixement);

	
}



	public static void main(String[] args) {
		
		Principal p=new Principal();
		
		p.introduirDades();
		
		p.mostrarDades();
		
	}
	
	/*PREGUNTAS DEL APARTADO 6:
	/•	•Quina informació veis per els professors ? I per els alumnes ? La informació que veim es la del atributs de la classe Persona. Per què?
	 *  Perque feim que rebi nomes els atributs de la d'un objecte del tipus Persona i, per tant, son els que es mostren, encara que en cada una dels Arrays
	 *   (Alumne i Professor)i ha més atributs.
		•Podeu utilitzar getEspecialitat o getCurs dins el mètode imprimir ? No. Per què? Perque no s'inicialitza ja que es vol fer un objecte del tipus persona i,
		per tant, nomes es poden fer referencia als seus metodes des del metode imprimir. **/



}
