package ej7;

import java.util.Stack;

public class Dradler implements IAggregate{
    private Stack<Empleado> empleados;
    private String gerente;

    public Stack<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Stack<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Dradler(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public Iterator createIterator() {
        Iterator iterator = new DradlerIterator(empleados);
        return iterator;
    }
}
