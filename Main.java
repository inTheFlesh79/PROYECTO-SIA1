package Proyecto;

import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
	
	private static ArrayList<Evento> listaEventos;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/*Funcion que crea un recinto*/
	/*Funcion que agrega un recinto y clave asociada*/
	
	private static void menu() {
		/*
		 * Menu para listar las siguientes acciones:
		 * Agregar Recintos/Asistentes/Eventos
		 * Eliminar Recintos/Asistentes/Eventos
		 * Buscar Recintos/Asistentes/Eventos
		 * Listar Recintos/Eventos
		 */
	}
	
	private static void agregarLista(ArrayList<Evento> listaEventos, Evento newEvento) {
		//validaciones pertinentes
		listaEventos.add(newEvento);
	}
	
	private static boolean eliminarLista(ArrayList<Evento> listaEventos, Evento newEvento) {
		for(int i = 0; i <= listaEventos.size(); i++) {
			listaEventos.remove(i);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArrayList<Evento> listaEventos = new ArrayList<>();
		ArrayList<Recinto> listaAsistente = new ArrayList<>();
		
		menu();
	}

}
