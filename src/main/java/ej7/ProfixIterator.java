package ej7;

import java.util.List;

public class ProfixIterator implements Iterator{
    private List<Empleado> empleados;
    private int position = 0;

    public ProfixIterator(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean hasNext() {
        boolean itHasNext = this.empleados.size() != 0 && position < this.empleados.size();
        return itHasNext;
    }

    @Override
    public Empleado next() {
        Empleado empleado = this.empleados.get(position++);
        return empleado;
    }
}
