import java.util.Comparator;

public class OrdenPorRol implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getId() - o2.getId();
    }

}
