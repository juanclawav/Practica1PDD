package ej7;

public class Medusa implements IAggregate{
    private Empleado empleados[];
    private String gerente;

    public Empleado[] getEmpleado() {
        return empleados;
    }

    public void setEmpleado(Empleado[] empleado) {
        this.empleados = empleado;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Medusa(String gerente) {
        this.gerente = gerente;
    }
    @Override
    public Iterator createIterator() {
        Iterator iterator = new MedusaIterator(empleados);
        return iterator;
    }
}
