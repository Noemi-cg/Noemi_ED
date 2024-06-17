package Ejercicio2;

public class Edades_Noemi {
	private String edad;
	public Edades_Noemi(String edadPersona) {
		this.edad = edadPersona;
	}
	public String invertCadenaNull(String cadena) {
			throw new IllegalArgumentException("Cadena no puede ser null");
		}

	public void  saludar () {
		System.out.print("Hola, tu edad es "+ edad +"años!");
	}
	public static void main(String[] args) {
		Edades_Noemi edad = new Edades_Noemi("25");
		edad.saludar();
		String cadena = "hola";
		String cadenaInvertida = edad.invertCadenaNull(cadena);
		System.out.println ("Cadena invertida: "+ cadenaInvertida);
	}
}

