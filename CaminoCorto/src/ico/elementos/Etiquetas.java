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
public class Etiquetas {
    private float distanciaAcumulada;
    private Vertice verticeAnterior;
    private Vertice verticeActual;
    private boolean nodoEvaluado;

    public Etiquetas() {
    }

    public Etiquetas(float distanciaAcumulada, Vertice verticeAnterior, Vertice verticeActual, boolean nodoEvaluado) {
        this.distanciaAcumulada = distanciaAcumulada;
        this.verticeAnterior = verticeAnterior;
        this.verticeActual = verticeActual;
        this.nodoEvaluado = nodoEvaluado;
    }

    public float getDistanciaAcumulada() {
        return distanciaAcumulada;
    }

    public void setDistanciaAcumulada(float distanciaAcumulada) {
        this.distanciaAcumulada = distanciaAcumulada;
    }

    public Vertice getVerticeAnterior() {
        return verticeAnterior;
    }

    public void setVerticeAnterior(Vertice verticeAnterior) {
        this.verticeAnterior = verticeAnterior;
    }

    public Vertice getVerticeActual() {
        return verticeActual;
    }

    public void setVerticeActual(Vertice verticeActual) {
        this.verticeActual = verticeActual;
    }

    public boolean isNodoEvaluado() {
        return nodoEvaluado;
    }

    public void setNodoEvaluado(boolean nodoEvaluado) {
        this.nodoEvaluado = nodoEvaluado;
    }
}
