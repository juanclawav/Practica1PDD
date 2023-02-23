package ej10;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;

    public Vehiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void showVehiculo(){
        System.out.println("Placa: "+getPlaca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Marca: "+getMarca());
    }
    public void registro(){
        CentroControl.getInstance().registro(placa);
    }
    public void pagar(){
        CentroControl.getInstance().pago();
    }
}
