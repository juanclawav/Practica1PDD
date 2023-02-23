package ej7;

import java.util.Vector;

public class Ares implements IAggregate{
    private Vector<Empleado> empleados = new Vector<>();
    private String gerente;

    public Vector<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Vector<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Ares(String gerente) {
        this.gerente = gerente;
    }
    @Override
    public Iterator createIterator() {
        Iterator iterator = new AresIterator(empleados);
        return iterator;
    }
}
