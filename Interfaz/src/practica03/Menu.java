package practica03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	 private static List<Tareas> tareas = new ArrayList<>();
	 private static int tareaIdContador = 1;

	
	
	public Menu() {
		
		Scanner scanner = new Scanner(System.in);
        int opcion;
        
        //menu

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Marcar tarea como realizada");
            System.out.println("5. Modificar tarea");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarTarea(scanner);
                    break;
                case 2:
                    listarTareas();
                    break;
                case 3:
                    eliminarTarea(scanner);
                    break;
                case 4:
                    marcarTareaComoRealizada(scanner);
                    break;
                case 5:
                    modificarTarea(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 6);
    }
	
	//funcion agregar tarea

    private static void agregarTarea(Scanner scanner) {
        System.out.print("Descripcion de la tarea: ");
        String descripcion = scanner.nextLine();
        System.out.print("Prioridad (Alta, Media, Baja): ");
        String prioridad = scanner.nextLine();
        System.out.print("Fecha limite (YYYY-MM-DD): ");
        String fechaLimite = scanner.nextLine();
        Tareas tarea = new Tareas(tareaIdContador++, descripcion, prioridad, fechaLimite, false);
        tareas.add(tarea);
      
    }

    //funcion para listar las tareas
    
    private static void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas");
            return;
        }

        for (Tareas tarea : tareas) {
            System.out.println(tarea);
            for (Subtareas subtarea : tarea.getSubtareas()) {
                System.out.println("\t" + subtarea);
            }
        }
    }

    //funcion para eliminar una tarea
    
    private static void eliminarTarea(Scanner scanner) {
        System.out.print("Pon el ID de la tarea a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        tareas.removeIf(t -> t.getId() == id);
        System.out.println("Tarea eliminada");
    }
    
    //funcion para completar una tarea

    private static void marcarTareaComoRealizada(Scanner scanner) {
        System.out.print("Ingresa el ID de la tarea: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Tareas tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setCompletada(true);
              
                return;
            }
        }

        System.out.println("Tarea no encontrada");
    }

    //funcion para modifica la tarea
    
    private static void modificarTarea(Scanner scanner) {
        System.out.print("Ingresa el ID de la tarea: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        for (Tareas tarea : tareas) {
            if (tarea.getId() == id) {
                System.out.print("Nueva descripcion: ");
                tarea.setDescripcion(scanner.nextLine());
                System.out.print("Nueva prioridad: ");
                tarea.setPrioridad(scanner.nextLine());
                System.out.print("Nueva fecha limite: ");
                tarea.setFechaLimite(scanner.nextLine());
                System.out.println("Tarea modificada");
                return;
            }
        }

        System.out.println("Tarea no encontrada");
    }

}
