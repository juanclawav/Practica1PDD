package ej8;

public class PFinancia {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
