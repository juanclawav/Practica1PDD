package ej5;

public class PlatoBife extends BuilderPlato{
    @Override
    public void buildTipoCarne() {this.plato.setTipoCarne("Bife");}

    @Override
    public void buildSabdorRefresco() {this.plato.setSaborRefresco("Coca Cola");}

    @Override
    public void buildGuarnicion() {this.plato.setGuarniciones("Papas Fritas");}
}
