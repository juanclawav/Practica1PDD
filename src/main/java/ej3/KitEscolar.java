package ej3;

public class KitEscolar implements IKit{
    private Mochila mochila = new Mochila();
    private Deportivo deportivo = new Deportivo();
    private Cuaderno cuaderno = new Cuaderno();
    public KitEscolar() {}

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void showKit() {
        System.out.println("**************KIT*****************");
        mochila.showMochila();
        deportivo.showDeportivo();
        cuaderno.showCuaderno();
    }
}
