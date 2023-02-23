package ej3;

public class KitEscolarCreator extends CreatorKit{
    @Override
    public KitEscolar create() {
        KitEscolar kit = new KitEscolar();
        Mochila mochila = new Mochila();
        mochila.setTamano("Grande");
        mochila.setNumeroBolsillos(13);
        kit.setMochila(mochila);

        Deportivo deportivo = new Deportivo();
        deportivo.setTalla("M");
        deportivo.setColor("aZUL");
        deportivo.setNumeroPrendas(3);
        kit.setDeportivo(deportivo);

        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setTipo("Oficio");
        cuaderno.setNumeroHojas(150);
        kit.setCuaderno(cuaderno);
        return kit;
    }
}
