package ej3;

public class Computadora {
    private String marca;
    private String os;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public void showComputadora(){
        System.out.println("Marca: "+getMarca());
        System.out.println("OS: "+getOs());
    }
}
