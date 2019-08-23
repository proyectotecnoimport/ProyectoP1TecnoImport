package modelo;

import modelo.decorator.JefeBodega;

/**
 *
 * @author Dario Triviño
 */
public class Ruta {
    
    private String inicio;
    private String fin;
    private Repartidor repartidor;
    private JefeBodega jefeBodega;

    public Ruta(String inicio, String fin, Repartidor repartidor, JefeBodega jefeBodega) {
        this.inicio = inicio;
        this.fin = fin;
        this.repartidor = repartidor;
        this.jefeBodega = jefeBodega;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public JefeBodega getJefeBodega() {
        return jefeBodega;
    }

    public void setJefeBodega(JefeBodega jefeBodega) {
        this.jefeBodega = jefeBodega;
    }
    
    
}
