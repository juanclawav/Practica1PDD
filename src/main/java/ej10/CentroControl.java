package ej10;

public class CentroControl {
    private int monto;
    private static CentroControl instance = null;

    public CentroControl() {
        monto = 0;
        System.out.println("Monto inicial: "+monto);
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CentroControl();
        }
    }
    public static CentroControl getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
    public synchronized void registro(String placa){
        System.out.println("***********REGISTRO************");
        System.out.println("Auto: "+placa+" registrado.");
    }
    public synchronized void pago(){
        System.out.println("***********PAGO************");
        monto = monto+2;
        System.out.println("Pago realizado, monto actualizado: "+monto);
    }
}
