
public class for_in {

	
	public static void main(String[] args) {
		
		String[] semana={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado", "Domingo"};
		
		for (String dia: semana) {
			
			System.out.println(dia);
			
		}
		
		//ESTA SERIA OTRA FORMA DE HACERLO
		
		for (int f=0;f<7;f++) {
			
			System.out.println(semana[f]);
		}

		
	}

}
