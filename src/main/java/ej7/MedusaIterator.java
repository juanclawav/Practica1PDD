package ej7;

public class MedusaIterator implements Iterator{
    private Empleado empleados[];
    private int position = 0;

    public MedusaIterator(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean hasNext() {
        boolean itHasNext = this.empleados.length != 0 && position < this.empleados.length;
        return itHasNext;
    }

    @Override
    public Empleado next() {
        Empleado empleado = this.empleados[position++];
        return empleado;
    }
}
