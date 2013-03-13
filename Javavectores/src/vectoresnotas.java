import java.util.Scanner;
public class vectoresnotas {

	private float [] notas1;
	private float [] notas2;
	private float [] medianotas;

		
		public void  medianotas1() {
			Scanner leer=new Scanner(System.in);
	
			float c=2;
			this.notas1= new float[6];
			this.notas2=new float[6];
			this.medianotas=new float[6];
			float n1=0;
			float n2=0;
			float contador=0;
			float n3=0;
			
			for(int f=0;f<6;f++){
				System.out.println("Introduzca las notas del primer alumno");
				notas1[f]=leer.nextFloat();
				System.out.println("Introduzca las notas del segundo alumno");
				notas2[f]=leer.nextFloat();
				n1=n1+notas1[f];
				n2=n2+notas2[f];
				contador=contador+1;
				medianotas[f]=((notas1[f]+notas2[f])/c);
				
				n3=n3+medianotas[f];
				
				System.out.println("La media de la nota de la clase en esta asignatura, teniendo la nota del primer alumno "+notas1[f]+" y la nota del segundo alumno "+notas2[f]+" es igual a "+medianotas[f]);
				
				if (f==5){
					System.out.println("La media total de notas del alumno 1 es "+ n1/contador);
					System.out.println("La media total de notas del alumno 2 es "+ n2/contador);
					System.out.println("La media total de notas por asignatura de ambos alumnos es "+ n3/contador);
					
					
				}
	
			}
			
			
		}
		
	
	public static void main(String[] args) {

		vectoresnotas n=new vectoresnotas();
		n.medianotas1();
		
		
		


	}

}
