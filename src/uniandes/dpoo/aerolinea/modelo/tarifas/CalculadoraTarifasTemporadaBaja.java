package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{
	protected int COSTO_POR_KM_CORPORATIVO;
	protected int COSTO_POR_KM_NATURAL;
	protected double DESCUENTO_GRANDES;
	protected double DESCUENTO_MEDIANAS;
	protected double DESCUENTO_PEQ;
	

	public CalculadoraTarifasTemporadaBaja() {
	}
	
	//TODO
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
