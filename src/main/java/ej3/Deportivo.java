package ej3;

public class Deportivo {
    private String talla;
    private String color;
    private int numeroPrendas;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPrendas() {
        return numeroPrendas;
    }

    public void setNumeroPrendas(int numeroPrendas) {
        this.numeroPrendas = numeroPrendas;
    }
    public void showDeportivo(){
        System.out.println("Talla: "+getTalla());
        System.out.println("Color: "+getColor());
        System.out.println("Número de Prendas: "+getNumeroPrendas());
    }
}
