package ej1;

public class VentanillaPago {
    private int monto;
    private static VentanillaPago instance = null;

    public VentanillaPago() {
        monto = 0;
        System.out.println("Monto inicial: "+monto);
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new VentanillaPago();
        }
    }
    public static VentanillaPago getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void registro(String codigo){
        System.out.println("Registro exitoso de: "+codigo);
    }
    public synchronized void pagar(int dinero){
        monto = monto+dinero;
        System.out.println("Pago realizado de: "+dinero);
    }
    public void montoActual() {
        System.out.println("El monto actual en la ventanilla es de: "+monto);
    }
}

