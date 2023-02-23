package ej8;

public class Main {
    public static void main(String[] args) {
        CuentaDeBanco.getInstance().principioDeMes(20000);
        System.out.println("************************");
        Cajero cajero = new Cajero();
        cajero.getPCredito().prestamo(700);
        cajero.getPNegocio().prestamo(150);
        System.out.println("************************");
        Cajero cajero2 = new Cajero();
        cajero2.getPFinancia().prestamo(9000);
        cajero2.getPVivienda().prestamo(999);
        System.out.println("************************");
        Cajero cajero3 = new Cajero();
        cajero3.getPNegocio().prestamo(1000);
        cajero3.getPCredito().prestamo(5000);
        System.out.println("************************");
        Cajero cajero4 = new Cajero();
        cajero4.getPVivienda().prestamo(30000);

    }
}
