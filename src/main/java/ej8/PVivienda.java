package ej8;

public class PVivienda {
    public void prestamo(int monto){
        CuentaDeBanco.getInstance().prestar(monto);
    }
}
