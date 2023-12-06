package diario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> actividades = new ArrayList<>();
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
                    actividades.add(actividadAñadir);
                    break;

                case 2:
                    System.out.println("Entre la actividad a eliminar");
                    String actividadEliminar = sc.next();
                    actividades.remove(actividadEliminar);
                    break;

                case 3:
                    System.out.println(actividades);
                case 4:
                    break;
                default:
                    System.out.println("opción no válida");

            }
        } while (option != 0);
    }

}
