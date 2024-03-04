package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.List;
import java.util.ArrayList;


import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	/**La lista de tiquetes sin usar del cliente
	 * 
	 */
	protected List<Tiquete> tiquetesSinUsar;
	
	/**La lista de tiquetes usados del cliente
	 * 
	 */
	protected List<Tiquete> tiquetesUsados;

	public Cliente() {
		this.tiquetesSinUsar = new ArrayList<Tiquete>( );
		this.tiquetesUsados = new ArrayList<Tiquete>( );
	}
	/** Agrega un nuevo cliente a la lista de tiquetes (sin usar) que ha comprado el cliente
	 * 
	 * @param tiquete
	 */
	public abstract void agregarTiquete(Tiquete tiquete);
	
	
	/**Calcula el valor total de los tiquetes que ha comprado un cliente
	 * 
	 * @return
	 */
	public abstract int calcularValorTotalTiquetes();
	
	
	/**Retorna el identificador del cliente
	 * 
	 * @return
	 */
	public abstract String getIdentificador();
	
	
	/**Retorna el tipo del cliente.
	 * 
	 * @return
	 */
	public abstract String getTipoCliente();
	
	
	/**Marca como usados todos los tiquetes del cliente que se
	 * hayan realizado en el vuelo que llega por parámetro, 
	 * moviéndolos de la lista de tiquetes sin usar a la lista
	 * de tiquetes usados
	 * @param vuelo
	 */
	public abstract void usarTiquetes(Vuelo vuelo);
	
	
	
	
	

}
