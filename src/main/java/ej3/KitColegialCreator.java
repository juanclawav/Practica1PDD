package ej3;

public class KitColegialCreator extends CreatorKit{
    @Override
    public KitColegial create() {
        KitColegial kit = new KitColegial();
        Mochila mochila = new Mochila();
        mochila.setTamano("Mediano");
        mochila.setNumeroBolsillos(8);
        kit.setMochila(mochila);

        Libros libros = new Libros();
        libros.setTipo("Fisica");
        libros.setAutor("Segway");
        kit.setLibros(libros);

        Computadora computadora = new Computadora();
        computadora.setMarca("Mac");
        computadora.setOs("MACOS");
        kit.setComputadora(computadora);
        return kit;
    }
}
