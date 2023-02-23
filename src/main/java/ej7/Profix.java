package ej7;

import java.util.ArrayList;
import java.util.List;

public class Profix implements IAggregate{
    private List<Empleado> empleados = new ArrayList<>();
    private String gerente;

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Profix(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public Iterator createIterator() {
        Iterator iterator = new ProfixIterator(empleados);
        return iterator;
    }
}
