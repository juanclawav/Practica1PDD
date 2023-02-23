package ej8;


public class CuentaDeBanco {
    private int saldo;
    private static CuentaDeBanco instance = null;

    public CuentaDeBanco() {
        saldo = 0;
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CuentaDeBanco();
        }
    }
    public static CuentaDeBanco getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void prestar(int monto){
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Prestamo realizado.");
            System.out.println("El monto actual de la cuenta es : " + saldo);
        } else {
            System.out.println("Error en Prestamo");
            System.out.println("Saldo insuficiente.");
        }
    }
    public void principioDeMes(int dinero) {
        System.out.println("El monto actual es : "+saldo);
        saldo = saldo+dinero;
        System.out.println("El monto actual de la cuenta es: "+saldo);
    }
}
