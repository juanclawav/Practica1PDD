package ej7;

public class Empleado {
    private String apellido;
    private String ci;

    public Empleado(String apellido, String ci) {
        this.apellido = apellido;
        this.ci = ci;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    public void showInfo() {
        System.out.println("*******Empleado*****");
        System.out.println("Apellido: " +getApellido());
        System.out.println("Codigo: " +getCi());
        System.out.println("**********************");
    }
}
