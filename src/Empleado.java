import java.util.ArrayList;

public class Empleado extends Persona{

    private Integer salario;

    public Empleado(){
    }

    public Empleado(Integer id, String nombre, String apellido, Integer salario) {
        super(id, nombre, apellido);
        this.salario = salario;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }


    @Override
    public String toString()
    {
        return this.getId() + " " + this.getNombre() + " " + this.getApellido() +  " " + this.getSalario();
    }
}
