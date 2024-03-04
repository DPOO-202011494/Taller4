package uniandes.dpoo.aerolinea.modelo;

import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;

/**Esta clase tiene la información de un vuelo particular que cubre una ruta y se lleva a cabo en 
 * una cierta fecha. Los vuelos son las unidades a las cuales están asociadas las ventas de tiquetes
 * 
 */
public class Vuelo {
	
	/**El avion utilizado para realizar el vuelo
	 * 
	 */
	private Avion avion;
	
	/**La fecha para el vuelo, expresada como una cadena de la forma YYYY-MM-DD
	 * 
	 */
	private String fecha;
	
	/**Ruta
	 * 
	 */
	private Ruta ruta;
	
	/**Los tiquetes que ya fueron vendidos para el vuelo
	 * 
	 */
	private Map<String,Tiquete> tiquetes;

	//Metodo Constructor
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		super();
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
	}
	
	public boolean equals(Object obj) {
		
	}
	
	
	public Avion getAvion() {
		return avion;
	}

	public String getFecha() {
		return fecha;
	}


	public Ruta getRuta() {
		return ruta;
	}


	public Map<String, Tiquete> getTiquetes() {
		return tiquetes;
	}
	
	/**Vende una determinada cantidad de tiquetes para el vuelo y los deja registrados en el mapa de tiquetes
	 * 
	 * @param cliente
	 * @param calculadora
	 * @return
	 */
	
	public int vendertTiquetes(Cliente cliente,CalculadoraTarifas calculadora, int cantidad) {
		//TODO
		return 0;
		
	}


	

	
	
	
	
	
}
