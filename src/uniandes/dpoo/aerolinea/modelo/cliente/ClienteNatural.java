package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import java.util.Objects;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente{
	/**La constante usada para identificar el tipo de cliente
	 * 
	 */
	public static String NATURAL = "Natural";
	
	/**El nombre del cliente
	 * 
	 */
	private String nombre;
	
	//Metodo Constructor
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificador() {
		return this.nombre;
	}


	@Override
	public void agregarTiquete(Tiquete tiquete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calcularValorTotalTiquetes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void usarTiquetes(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	

}
