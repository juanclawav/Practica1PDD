package ej5;

public class PlatoLomito extends BuilderPlato{
    @Override
    public void buildTipoCarne() {this.plato.setTipoCarne("Tira de Carne");}

    @Override
    public void buildSabdorRefresco() {this.plato.setSaborRefresco("Coca Cola");}

    @Override
    public void buildGuarnicion() {this.plato.setGuarniciones("Fideo");}
}
