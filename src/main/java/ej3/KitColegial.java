package ej3;

public class KitColegial implements IKit{
    private Mochila mochila = new Mochila();
    private Libros libros = new Libros();
    private Computadora computadora = new Computadora();
    public KitColegial() {}

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showKit() {
        System.out.println("**************KIT*****************");
        mochila.showMochila();
        libros.showLibros();
        computadora.showComputadora();
    }
}
