package ej8;

public class PCreditos {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
