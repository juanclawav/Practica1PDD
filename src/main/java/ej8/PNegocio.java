package ej8;

public class PNegocio {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
