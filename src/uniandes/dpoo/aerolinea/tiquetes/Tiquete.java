package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.*;

public class Tiquete {
	private Cliente cliente;
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	
	//Metodo constructor
	public Tiquete(String codigo, Vuelo vuelo, Cliente cliente, int tarifa) {
		super();
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.cliente = cliente;
		this.tarifa = tarifa;
	}
	
	//TODO hacer metodos
	public boolean esUsado() {
		return false;
	}
	
	public Cliente getCliente() {
		return cliente;
		
	}
	
	public String getCodigo() {
		return codigo;
		
	}
	
	public int getTarifa() {
		return tarifa;
		
	}
	
	public Vuelo getVuelo() {
		return vuelo;
		
	}
	public void marcarComoUsado() {
		
	}
	
	
	

}
