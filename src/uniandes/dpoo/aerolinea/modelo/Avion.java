package uniandes.dpoo.aerolinea.modelo;


/**En esta clase se organiza la información básica de los aviones que realizan los vuelos
 * 
 */

public class Avion {
	/**La capcidad del avión
	 * 
	 */
	private int capacidad;
	
	/**El nombre con el que se identifica al avión
	 * 
	 */
	private String nombre;
	
	
	/**Construye un avion con un determinado nombre y capacidad
	 * 
	 * @param nombre
	 * @param capacidad
	 */

	public Avion(String nombre, int capacidad) {
		this.capacidad = capacidad;
		this.nombre = nombre;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	
	
	
	
	
	

}
