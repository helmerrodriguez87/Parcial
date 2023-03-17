package Empresa;

public class LineasTelefonicas {

    private int tarifa;
    private int numero_llamdas;
    private int duracion;
    private double costo;

    public LineasTelefonicas() {
    }

    public LineasTelefonicas(int tarifa, int numero_llamdas, int duracion, double costo) {
        this.tarifa = tarifa;
        this.numero_llamdas = numero_llamdas;
        this.duracion = duracion;
        this.costo = costo;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int getNumero_llamdas() {
        return numero_llamdas;
    }

    public void setNumero_llamdas(int numero_llamdas) {
        this.numero_llamdas = numero_llamdas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Lineas Telefonicas: " +
                "\n tarifa = " + getTarifa() + " pesos "+
                "\n numero llamdas = " + getNumero_llamdas() +
                "\n duracion = " + getDuracion()+
                "\n costo = " + getCosto();
    }
}
