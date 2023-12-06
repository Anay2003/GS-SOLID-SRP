package diariobienhecho;

import java.util.ArrayList;
import java.util.List;

public class GestorActividades {

    List<String> actividades = new ArrayList<>();

    public void addActividad(String actividad) {
        actividades.add(actividad);
    }

    public void removeActividad(String actividad) {
        actividades.remove(actividad);
    }
}
