package uniandes.dpoo.aerolinea.persistencia;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONObject;

import uniandes.dpoo.aerolinea.exceptions.ClienteRepetidoException;
import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteNatural;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {
	
    private static final String NOMBRE_AVION = "nombre";
    private static final String CAPACIDAD_AVION = "Capacidad";
    
    private static final String NOMBRE_AEROPUERTO = "nombre";
    private static final String CODIGO_AEROPUERTO = "codigo";
    private static final String NOMBRE_CIUDAD = "ciudad";
    private static final String LATITUD = "latitud";
    private static final String LONGITUD = "longitud";
    
    private static final String HORA_SALIDA = "hora salida";
    private static final String HORA_LLEGADA = "hora llegada";
    private static final String CODIGO_RUTA = "codigo";
    private static final String AEROPUERTO_ORIGEN = "aeropuerto origen";
    private static final String AEROPUERTO_DESTINO = "aeropuerto destino";
    
    private static final String FECHA_VUELO = "fecha";
    
    
    //Salvar Aviones
    public void salvarAviones( Aerolinea aerolinea, JSONObject jobject ) {
        JSONArray jAviones = new JSONArray( );
        for( Avion avion : aerolinea.getAviones() )
        {
            JSONObject jAvion = new JSONObject( );
            jAvion.put( NOMBRE_AVION, avion.getNombre() );
            jAvion.put( CAPACIDAD_AVION, avion.getCapacidad() );
            jAviones.put( jAvion );
        }

        jobject.put( "aviones", jAviones );	
    	
    }
    
    
    //Salvar Aeropuertos
    public void salvarAeropuertos( Aerolinea aerolinea, JSONObject jobject ) {
        JSONArray jAeropuertos = new JSONArray( );
        for( Aeropuerto aeropuerto : aerolinea.getAeropuertos() )
        {
            JSONObject jAeropuerto = new JSONObject( );
            jAeropuerto.put( NOMBRE_AEROPUERTO, aeropuerto.getNombre() );
            jAeropuerto.put( CODIGO_AEROPUERTO, aeropuerto.getCodigo() );
            jAeropuerto.put( NOMBRE_CIUDAD, aeropuerto.getNombreCiudad() );
            jAeropuerto.put( LATITUD, aeropuerto.getLatitud() );
            jAeropuerto.put( LONGITUD, aeropuerto.getLongitud() );
            jAeropuertos.put( jAeropuerto );
        }

        jobject.put( "aeropuertos", jAeropuertos );	
    	
    }
    
    
    //Salvar Rutas
    public void salvarRutas( Aerolinea aerolinea, JSONObject jobject ) {
        JSONArray jRutas = new JSONArray( );
        for( Ruta ruta : aerolinea.getRutas() )
        {
            JSONObject jRuta = new JSONObject( );
            jRuta.put( HORA_SALIDA, ruta.getHoraSalida() );
            jRuta.put( HORA_LLEGADA, ruta.getHoraLlegada() );
            jRuta.put( CODIGO_RUTA, ruta.getCodigoRuta() );
            jRuta.put( AEROPUERTO_ORIGEN, ruta.getOrigen().getNombre() );
            jRuta.put( AEROPUERTO_DESTINO, ruta.getDestino().getNombre() );
            
            jRutas.put( jRuta );
        }

        jobject.put( "rutas", jRutas );	
    	
    }
    
    
    //Salvar Vuelos
    public void salvarVuelos( Aerolinea aerolinea, JSONObject jobject ) {
        JSONArray jVuelos = new JSONArray( );
        for( Vuelo vuelo : aerolinea.getVuelos() )
        {
            JSONObject jVuelo = new JSONObject( );
            jVuelo.put( FECHA_VUELO, vuelo.getFecha() );
            jVuelo.put( CODIGO_RUTA, vuelo.getRuta()  );
            jVuelo.put( NOMBRE_AVION, vuelo.getAvion() );
            jVuelos.put( jVuelo );
        }

        jobject.put( "vuelos", jVuelos );	
    	
    }
    

	@Override
	public void cargarAerolinea(String archivo, Aerolinea aerolinea)throws IOException, InformacionInconsistenteException {
		//TODO
	}
	
	

	@Override
	public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException {
	    JSONObject jobject = new JSONObject( );

		  
	    // Salvar Aviones
        salvarAviones( aerolinea, jobject );

        // Salvar Vuelos
        salvarVuelos( aerolinea, jobject );
        
        // Salvar Rutas
        salvarRutas( aerolinea, jobject );
        
        // Salvar Aeropuertos
        salvarAeropuertos( aerolinea, jobject );

        // Escribir la estructura JSON en un archivo
        PrintWriter pw = new PrintWriter( archivo );
        jobject.write( pw, 2, 0 );
        pw.close( );	
		
	}
	
	
	

}
