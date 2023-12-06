package diariobienhecho;

import java.util.Scanner;

public class VisualizadorActividades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorActividades gestorActividades = new GestorActividades();
        int option = 0;
        do {
            System.out.println("Entre 1 para añadir actividad");
            System.out.println("Entre 2 para eliminar actividad");
            System.out.println("Entre 3 para mostrar las actividades");
            System.out.println("Entre 0 para salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Entre la actividad a añadir");
                    String actividadAñadir = sc.next();
                    gestorActividades.addActividad(actividadAñadir);
                    break;

                case 2:
                    System.out.println("Entre la actividad a eliminar");
                    String actividadEliminar = sc.next();
                    gestorActividades.removeActividad(actividadEliminar);
                    break;

                case 3:
                    System.out.println(gestorActividades.actividades);

                case 4:
                    break;

                default:
                    System.out.println("opción no válida");

            }
        } while (option != 0);
    }
}
