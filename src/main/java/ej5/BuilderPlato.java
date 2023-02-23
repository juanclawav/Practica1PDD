package ej5;

public abstract class BuilderPlato {
    protected Plato plato;
    public Plato getPlato(){return plato;}
    public void prepararPlato(){plato = new Plato();}
    public abstract void buildTipoCarne();
    public abstract void buildSabdorRefresco();
    public abstract void buildGuarnicion();
}
