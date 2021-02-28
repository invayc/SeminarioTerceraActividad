import java.util.Comparator;

public class OrdenPorSalario  implements Comparator<Empleado> {


    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getSalario() - o2.getSalario();
    }

}
