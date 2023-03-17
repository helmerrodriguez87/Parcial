package Empresa;

public class Celulares extends LineasTelefonicas{

    private String operador;

    public Celulares(int tarifa, int numero_llamdas, int duracion, double costo, String operador) {
        super(tarifa, numero_llamdas, duracion, costo);

        this.operador = operador;

    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return super.toString() + " Celulares: " +
                "\n operador = " + getOperador();
    }
}
