package ej8;

public class Cajero {
    private PCreditos pCreditos = new PCreditos();
    private PFinancia PFinancia = new PFinancia();
    private PNegocio PNegocio = new PNegocio();
    private PVivienda pVivienda = new PVivienda();

    public PCreditos getPCredito() {
        return pCreditos;
    }

    public void setPCredito(PCreditos pCreditos) {
        this.pCreditos = pCreditos;
    }

    public PFinancia getPFinancia() {
        return PFinancia;
    }

    public void setPFinancia(PFinancia PFinancia) {
        this.PFinancia = PFinancia;
    }

    public PNegocio getPNegocio() {
        return PNegocio;
    }

    public void setPNegocio(PNegocio PNegocio) {
        this.PNegocio = PNegocio;
    }

    public PVivienda getPVivienda() {
        return pVivienda;
    }

    public void setPVivienda(PVivienda pVivienda) {
        this.pVivienda = pVivienda;
    }
}
