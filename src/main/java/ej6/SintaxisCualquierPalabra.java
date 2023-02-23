package ej6;

public class SintaxisCualquierPalabra extends Gherkins{
    private String palabra;
    public SintaxisCualquierPalabra(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public void interpreter(Context context) {
        context.output=context.output + palabra + " ";
        context.input=context.input.substring(palabra.length());
    }
}
