package Modelo;

public class Persona {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona () {}
	
	Persona (boolean llenarBD){
		if (llenarBD)
			crearBD();
	}
	
	public void crearBD(){}
	
}
