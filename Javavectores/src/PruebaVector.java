
import java.util.Scanner;

public class PruebaVector {
	
 private int[] sueldos;

public int cargar(){
   Scanner leer=new Scanner(System.in);
   int  resultado=0;
   this.sueldos =new int[5];
   for (int f=0;f <5; f ++){
	   System.out.println("Ingrese el valor del componente");
	   sueldos[f]=leer.nextInt();
	   resultado=sueldos[f];
	   System.out.println("El dato es "+ resultado);
   }
   
   return resultado;
   
}
 
public static void main(String[] args) {
	
PruebaVector c=new PruebaVector();

 c.cargar();

}

}