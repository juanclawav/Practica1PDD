package ej3;

public class Cuaderno {
    private String tipo;
    private int numeroHojas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }
    public void showCuaderno(){
        System.out.println("Tipo: "+getTipo());
        System.out.println("Número de hojas: "+getNumeroHojas());
    }
}
