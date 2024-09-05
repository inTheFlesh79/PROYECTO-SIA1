package Proyecto;

public class Menu {
	public class Menu Throws IOException{
	    private BufferedReader lector = new BufferedReader(InputStreamReader(System.in));
	    private static void menuPrincipal(){
	        System.out.println("**MENU PRINCIPAL**");
	        System.out.println("1) Gestionar Eventos");
	        System.out.println("2) Gestionar Asistentes");
	        System.out.println("3) Gestionar Recintos");
	        System.out.println("4) Salir");
	    }

	    private static void menuEventos(){
	        System.out.println("**MENU EVENTOS**");
	        System.out.println("1) Crear Nuevo Evento");
	        System.out.println("2) Modificar Evento");
	        System.out.println("3) Eliminar Evento");
	        System.out.println("4) Mostrar Eventos");
	        System.out.println("5) Regresar al menu principal");
	    }

	    private static void menuAsistentes(){
	        System.out.println("**MENU ASISTENTES**");
	        System.out.println("1) Registrar nuevo Asistente.");
	        System.out.println("2) Modificar Asistentes de un evento");
	        System.out.println("3) Eliminar Asistentes de un evento");
	        System.out.println("4) Mostrar Asistentes de un evento");
	        System.out.println("5) Regresar al menu principal");
	    }

	    private static void menuRecintos(){
	        System.out.println("**MENU RECINTOS**");
	        System.out.println("1) Agregar recinto.");
	        System.out.println("2) Modificar recinto");
	        System.out.println("3) Eliminar recinto");
	        System.out.println("4) Mostrar recintos");
	        System.out.println("5) Regresar al menu principal");
	    }
	    // este metodo solo valida el 
	    private static int opcionValida Throws IOException(int opcion, int inf, int sup){
	        
	        int opcion;
	        do{
	            System.out.print("Ingrese una opcion: ");
	            opcion = Integer.parseInt(lector.readLine());
	        } while (opcion >= inf && opcion <= sup);

	        return opcion;
	    }

	    public static void runMenu(){
	        boolean flag = true;
	        int opcion;
	        while (flag){
	            menuPrincipal();
	            opcion = opcionValida(opcion, 0, 3);
	            switch (opcion){
	            case 1:
	                menuEventos();
	                opcionValida(opcion, 1, 5);
	                break; 
	            case 2:
	                menuAsistentes();
	                break;
	            case 3:
	                menuRecintos();
	                break;
	            case 0:
	                flag = false;
	                break;
	            default:
	                System.out.println("Ingrese una opcion valida.");
	                break;
	            }
	            
	        }
	    }
	}
}
