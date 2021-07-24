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
public class Arista {
    
    private Vertice verticeInicial;
    private Vertice verticeFinal;
    private float valorArista;

    public Arista() {
    }

    public Arista(Vertice verticeInicial, Vertice verticeFinal) {
        this.verticeInicial = verticeInicial;
        this.verticeFinal = verticeFinal;

    }

    public Vertice getVerticeInicial() {
        return verticeInicial;
    }

    public void setVerticeInicial(Vertice verticeInicial) {
        this.verticeInicial = verticeInicial;
    }

    public Vertice getVerticeFinal() {
        return verticeFinal;
    }

    public void setVerticeFinal(Vertice verticeFinal) {
        this.verticeFinal = verticeFinal;
    }

    public float getValorArista() {
        this.valorArista = this.calcularValor();
        return valorArista;
    }

    private float calcularValor(){
        int xs = verticeInicial.getEjex() - verticeFinal.getEjex();
        int ys = verticeInicial.getEjey() - verticeFinal.getEjey();
        int xs2 = (int) Math.pow(xs, 2);
        int ys2 = (int) Math.pow(ys, 2);
        int xs2ys2 = xs2 + ys2;
        float valor = (float) Math.sqrt(xs2ys2);
        return valor;
    }
    
    public boolean existeVertice(String verti){
        boolean existe = false;
        if (verticeInicial.getNombreV().equals(verti) || verticeFinal.getNombreV().equals(verti)) {
            existe = true;
        }
        return existe;
    }
    
    public String getVerticeOpuesto(String vertice){
        String opuesto = null;

        if (verticeInicial.getNombreV().equals(vertice)) {
            opuesto = verticeFinal.getNombreV();
        } else if (verticeFinal.getNombreV().equals(vertice)) {
            opuesto = verticeInicial.getNombreV();
        }
        
        return opuesto;
    }
}
