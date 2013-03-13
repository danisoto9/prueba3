import java.util.Scanner;

public class MiVector {

	private Object[] vector;
	

	public MiVector(int b) {

		this.vector = new Object[b];

	}

	public int longitud() {

		return vector.length;

	}

	public void imprimir() {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != null) {
				System.out.println("Los datos almacenados en el vector son "
						+ vector[i]);
			}
		}

	}

	public void poner() {

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++) {

			System.out.println("Introduce el dato");

			this.vector[i] = leer.next();

		}

	}

	public Object obtener(int posicion) {

		Object elemento = null;
		if ((posicion >= 0) && (posicion < vector.length)) {
			elemento = vector[posicion];
		}
		return elemento;
	}

	public static void main(String[] args) {

		MiVector p = new MiVector(4);
		System.out
				.println("El numero de datos en el vector es " + p.longitud());
		p.poner();
		p.imprimir();
		System.out
				.println("El elemento almacenado en la posicion que has introducido es "
						+ p.obtener(3));

	}

}
