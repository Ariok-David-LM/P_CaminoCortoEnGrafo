/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.elementos;

/**
 *
 * @author Osvaldo, Julio y Ariok
 */
public class Vertice {
    
    private int ejex;
    private int ejey;
    private String nombreV;

    public Vertice() {
    }

    public Vertice(int ejex, int ejey, String nombreV) {
        this.ejex = ejex;
        this.ejey = ejey;
        this.nombreV = nombreV;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public int getEjex() {
        return ejex;
    }

    public void setEjex(int ejex) {
        this.ejex = ejex;
    }

    public int getEjey() {
        return ejey;
    }

    public void setEjey(int ejey) {
        this.ejey = ejey;
    }
}
