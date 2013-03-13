import java.util.Scanner;
public class vectoraltura {

		private float[] altura; 
		private float media;
		
		
	public float  media_altura() {
		Scanner leer=new Scanner(System.in);
		float a=0;
		float c=0;
		this.altura= new float[5];
		
		for(int f=0;f<5;f++){
			System.out.println("Introduzca la altura");
			altura[f]=leer.nextFloat();
			a=a+altura[f];
			c++;
			
		}
		
		this.media=a/c;
		return this.media;
	}
	
	public String mayormenor(){
	    String resultado=null;
		//float[] segundaaltura;
		
		//segundaaltura=this.altura;
		
		int acumuladormayor=0;
		int acumuladormenor=0;
		for(int i=0;i<5;i++){
			
			if(this.media<=this.altura[i]){
				
				System.out.println("Para la media de altura "+ this.media+" y la altura introducida "+ this.altura[i]+" esta persona esta por encima de la media ");
				acumuladormayor=acumuladormayor+1;
			}
			else {
				System.out.println("Para la media de altura "+ this.media+" y la altura introducida "+ this.altura[i]+" esta persona esta por debajo de la media ");
				acumuladormenor=acumuladormenor+1;
				
			}
		
		}
		return resultado="Hay "+acumuladormayor+" personas por encima de la media y hay "+acumuladormenor+" personas por debajo de la media";
			
	}
	

	
	public static void main (String[] args){
		vectoraltura d=new vectoraltura();
		
		System.out.println(d.media_altura());
		
		System.out.println(d.mayormenor());
	}

}
