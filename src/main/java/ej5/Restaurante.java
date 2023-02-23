package ej5;

public class Restaurante {
    private BuilderPlato builder;
    public Plato getPlato(){return builder.getPlato();}
    public void setTipoPlato(BuilderPlato builder) {this.builder = builder;}
    public void buildPlato(){
        this.builder.prepararPlato();
        this.builder.buildTipoCarne();
        this.builder.buildSabdorRefresco();
        this.builder.buildGuarnicion();
    }
}
