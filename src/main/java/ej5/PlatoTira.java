package ej5;

public class PlatoTira extends BuilderPlato{
    @Override
    public void buildTipoCarne() {this.plato.setTipoCarne("Lomo");}

    @Override
    public void buildSabdorRefresco() {this.plato.setSaborRefresco("Pepsi");}

    @Override
    public void buildGuarnicion() {this.plato.setGuarniciones("Arroz");}
}
