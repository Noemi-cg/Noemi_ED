package Ejercicio2;


import org.junit.Test;
import static org.junit.Assertions.*;

public class Edades_NoemiTest {

	@Test
	void testInvertCadenaNull() {
		Edades_Noemi edad = new Edades_Noemi("25");
		Exception exception = assertThrows(IllegalArgumentException.class,() -> {
			edad.invertCadena(null);
		});
		assertEquals("Cadena no puede ser null", exception.getMessage());
	}

}
