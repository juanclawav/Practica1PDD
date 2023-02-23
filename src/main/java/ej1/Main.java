package ej1;

public class Main {

    public static void main(String[] args) {
        System.out.println("************************");
        Cajero cajero = new Cajero("8231YJ");
        cajero.registrarse();
        System.out.println("***********Estudiante 1*************");
        Estudiante est1 = new Estudiante("Jose", "783439");
        est1.registrarse();
        est1.pagoColegiatura(7800);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 2*************");
        Estudiante est2 = new Estudiante("Pablo", "545644");
        est2.registrarse();
        est2.pagoColegiatura(4600);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 3*************");
        Estudiante est3 = new Estudiante("Juancho", "684833");
        est3.registrarse();
        est3.pagoColegiatura(1500);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 4*************");
        Estudiante est4 = new Estudiante("Marcos", "533225");
        est4.registrarse();
        est4.pagoColegiatura(4200);
        VentanillaPago.getInstance().montoActual();
        System.out.println("***********Estudiante 5*************");
        Estudiante est5 = new Estudiante("Luis", "345537");
        est5.registrarse();
        est5.pagoColegiatura(3400);
        VentanillaPago.getInstance().montoActual();
    }
}
