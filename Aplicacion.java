import Controlador.Logica;
import Modelo.Persona;
import Utils.Ayudante;
import Vista.Pantallas;

public class Aplicacion {

	public static void main(String[] args) {
		Pantallas vista = new Pantallas ();
		Logica controlador = new Logica();
		int cantidadPersonas = Ayudante.conversor(vista.IngresarValor("ingresa cantidad"));
		controlador.inicializarPersonas(cantidadPersonas);
		for (int i = 0; i < cantidadPersonas; i++) {
			controlador.ingresarPersona(i, vista.IngresarValor("Coloque su nombre"));
		}
		
		for (int x = 0; x < cantidadPersonas; x++) {
			Persona ekis = controlador.traerPersona(x);
			vista.MostrarMensaje (ekis.getNombre());
		}
	}
}
