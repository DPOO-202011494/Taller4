package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;




public abstract class CalculadoraTarifas {
	/**El porcentaje que corresponde al impuesto sobre la costo base
	 * 
	 */
	public static double IMPUESTO = 0.28;
	public Cliente cliente;
	public Vuelo vuelo;
	
	public CalculadoraTarifas() {

	}
	//TODO
	protected abstract int calcularCostoBase(Vuelo vuelo,Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
		
	}
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	public int calcularTarifa(Vuelo vuelo,Cliente cliente) {
		return 0;
		
	}
	protected int calcularValorImpuestos(int costoBase) {
		return costoBase;
		
	}
	
	
	
	

	
	
}
