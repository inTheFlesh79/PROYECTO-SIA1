import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
      HashMap<String, Evento> mapaEventos = new HashMap<String, Evento>();
      ArrayList<Recinto> ArrayRecintos = new ArrayList<Recinto>();

      private void menuPrincipal() {
          System.out.println("**MENU PRINCIPAL**");
          System.out.println("1) Gestionar Eventos");
          System.out.println("2) Gestionar Asistentes");
          System.out.println("3) Gestionar Recintos");
          System.out.println("4) Salir");
      }

      private void menuEventos() {
          System.out.println("**MENU EVENTOS**");
          System.out.println("1) Agregar Nuevo Evento");
          System.out.println("2) Modificar Evento");
          System.out.println("3) Eliminar Evento");
          System.out.println("4) Mostrar Eventos");
          System.out.println("5) Regresar al menu principal");
      }

      private void menuAsistentes() {
          System.out.println("**MENU ASISTENTES**");
          System.out.println("1) Registrar nuevo Asistente.");
          System.out.println("2) Modificar Asistentes de un evento");
          System.out.println("3) Eliminar Asistentes de un evento");
          System.out.println("4) Mostrar Asistentes de un evento");
          System.out.println("5) Regresar al menu principal");
      }

      private void menuRecintos() {
          System.out.println("**MENU RECINTOS**");
          System.out.println("1) Agregar recinto.");
          System.out.println("2) Modificar recinto");
          System.out.println("3) Eliminar recinto");
          System.out.println("4) Mostrar recintos");
          System.out.println("5) Regresar al menu principal");
      }

      private int opcionValida(int inf, int sup, BufferedReader lector) throws IOException {
          int opcion;
          do {
              System.out.print("Ingrese una opcion: ");
              opcion = Integer.parseInt(lector.readLine());
          } while (!(opcion >= inf && opcion <= sup));

          return opcion;
      }

      public void runMenu() throws IOException {
          BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
          boolean flag = true;
          int opcion = 0, opcionB, opcionC, opcionD;

          while (flag) {
              menuPrincipal();
              opcion = opcionValida( 1, 4, lector);

              switch (opcion) {
                  case 1:
                      menuEventos();
                      opcionB = opcionValida( 1, 5, lector);
                      switch (opcionB) {
                          case 1:
                              // Agregar nuevo Evento
                              break;
                          case 2:
                              // Modificar Evento
                              break;
                          case 3:
                              // Eliminar Evento
                              break;
                          case 4:
                              // Mostrar Eventos
                              break;
                          case 5:
                              // Regresar al menu principal
                              break;
                          default:
                              System.out.println("Ingrese una opcion valida.");
                              break;
                      }
                      break;
                  case 2:
                    menuAsistentes();
                    opcionC = opcionValida( 1, 5, lector);
                    switch (opcionC) {
                      case 1:
                        // Agregar nuevo Asistente
                        break;
                      case 2:
                        // Modificar Asistente
                        break;
                      case 3:
                        // Eliminar Asistente
                        break;
                      case 4:
                        // Mostrar Asistente
                        break;
                      case 5:
                        // Regresar al menu principal
                        break;
                      default:
                        System.out.println("Ingrese una opcion valida.");
                        break;
                      }
                      break;
                  case 3:
                      menuRecintos();
                      opcionD = opcionValida( 1, 5, lector);
                      switch (opcionD) {
                          case 1:
                              // Agregar nuevo Recinto
                              break;
                          case 2:
                              // Modificar Recinto
                              break;
                          case 3:
                              // Eliminar Recinto
                              break;
                          case 4:
                              // Mostrar Recinto
                              break;
                          case 5:
                              // Regresar al menu principal
                              break;
                          default:
                              System.out.println("Ingrese una opcion valida.");
                              break;
                      }
                      break;
                  case 4:
                      flag = false; // salir
                      break;
                  default:
                      System.out.println("Ingrese una opcion valida.");
                      break;
              }
          }
      }
  }