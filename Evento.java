package Proyecto;

import java.io.*;
import java.util.HashMap;

public class Evento {
	private String nombreEvento;
	private String fechaEvento;
	private String idRecinto;
	private String descripcion;
	private String grupoObjetivo;
	private HashMap<String, Asistente> mapaAsistentes;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/*Funcion que agrega un recinto y clave asociada*/
	public void agregarAsistente() throws IOException {
		//nota mental, meter todo lo I/O de esta funcion al menu
		String nombreAsistente, email, idAsistente;
		int edad;
		System.out.println("Ingrese ID del asistente");
		idAsistente = reader.readLine();
		if (mapaAsistentes.containsKey(idAsistente)) {
			System.out.println("ID YA SE ENCUENTRA REGISTRADA");
			return;
		}
		
		System.out.println("Ingrese nombre del asistente");
		nombreAsistente = reader.readLine();
		System.out.println("Ingrese edad del asistente");
		edad = Integer.parseInt(reader.readLine());
		System.out.println("Ingrese email del asistente");
		email = reader.readLine();
		
		Asistente newAsistente = new Asistente(idAsistente, nombreAsistente, edad, email);
	    mapaAsistentes.put(newAsistente.getidAsistente(), newAsistente);
	} 
	
	public void eliminarAsistente(String idAsistente) {
		if(mapaAsistentes.containsKey(idAsistente)) {
			mapaAsistentes.remove(idAsistente);
		}
		else {
			System.out.println("La clave no existe. No se elimino el elemento.");
		}
	}
	
	public Evento(String idRecinto, String nombre, String fecha, int id, String descripcion, String gO) {
		//inserte validaciones pertinentes
		nombreEvento = nombre;
		fechaEvento = fecha;
		this.idRecinto = idRecinto;
		this.descripcion = descripcion;
		grupoObjetivo = gO;
	}
	
	public String getnombreEvento() {
        return nombreEvento;
    } 

	public String getfechaEvento() {
        return fechaEvento;
    }   

	public String getidRecinto() {
        return idRecinto;
    }

	public String getdescripcion() {
        return descripcion;
    }

	public String getgrupoObjetivo() {
        return grupoObjetivo;
    }  

	public void setnombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

	public void setfechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }   

	public void setidRecinto(String idRecinto) {
        this.idRecinto = idRecinto;
    }  

	public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 

	public void setgrupoObjetivo(String grupoObjetivo) {
        this.grupoObjetivo = grupoObjetivo;
    }
	
	
}
