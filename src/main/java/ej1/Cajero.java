package ej1;

public class Cajero {
    private String codigoCajero;

    public Cajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public String getCodigoCajero() {
        return codigoCajero;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }
    public void registrarse (){
        VentanillaPago.getInstance().registro(codigoCajero);
        System.out.println("Bienvenido Cajero!");
    }
}
