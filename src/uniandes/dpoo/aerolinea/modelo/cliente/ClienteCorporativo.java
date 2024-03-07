package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;
import java.util.Objects;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
    public static String CORPORATIVO = "Corporativo";
    public int GRANDE = 1;
    public int MEDIANA = 2;
    public int PEQUENA = 3;
    private String nombreEmpresa;
    private int tamanoEmpresa;
    
    
    //Metodo Constructor
    public ClienteCorporativo( String nombreEmpresa,int tamanoEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.tamanoEmpresa = tamanoEmpresa;

	}
 
    
    
    
    /**Retorna el nombre de la empresa
     * 
     * @return
     */
    public String getNombreEmpresa() {
		return nombreEmpresa;
	}

    /**Retorna el tamaño de la empresa: PEQUENA, MEDIANA, GRANDE 
     * 
     * @return
     */
	public int getTamanoEmpresa() {
		return tamanoEmpresa;
	}




	/**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }



	/**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
    
    

//TODO overrides
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
	public String getIdentificador() {
		return this.nombreEmpresa;
	}


	@Override
	public String getTipoCliente() {
		return ClienteCorporativo.CORPORATIVO;
	}


	@Override
	public void usarTiquetes(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}
}
