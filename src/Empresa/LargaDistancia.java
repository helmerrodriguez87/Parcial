package Empresa;

public class LargaDistancia extends LineasTelefonicas{

    private String pais;

    public LargaDistancia(int tarifa, int numero_llamdas, int duracion, double costo, String pais){
        super(tarifa,numero_llamdas,duracion,costo);

        this.pais = pais;

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + " Larga Distancia: " +
                "\n pais = " + getPais();
    }
}
