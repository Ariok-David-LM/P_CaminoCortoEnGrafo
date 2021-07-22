/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.algoritmos;

import ico.elementos.Arista;
import ico.elementos.Etiquetas;
import ico.elementos.Grafo;
import ico.elementos.Vertice;
import java.util.ArrayList;

/**
 *
 * @author Ariok León
 */
public class Dijkstra {

    public Dijkstra() {
    }
    
    public ArrayList<Etiquetas> etiquetarVertices(Grafo grafotmp, String verticeInicial){
        ArrayList<Vertice> vertices = grafotmp.getVertices();
        ArrayList<Arista> aristas = grafotmp.getAristas();
        ArrayList<Etiquetas> etiquetas = new ArrayList<>();
        Etiquetas actual = new Etiquetas();
        
        if (grafotmp.existeNombreVertice(verticeInicial)) {
            
            for (Vertice verti : vertices) {
                Etiquetas tmpEti = null;
                if (verti.getNombreV().equals(verticeInicial)) {
                    tmpEti = new Etiquetas(0, verti, verti, true);
                    actual = tmpEti;
                } else {
                    tmpEti = new Etiquetas(-1, verti, verti, false);
                }
                etiquetas.add(tmpEti);
            }
            
            /*Inicia algoritmo de Dijkstra*/
            
            Etiquetas actualEvaluando = null;
            int contador = 0;
            Etiquetas mayor = null;
            Etiquetas menor = null;
            do {                
                if (actualEvaluando == null) {
                    actualEvaluando = actual;
                }
                
                ArrayList<Arista> relacionadas = aristasRelacionadas(aristas, actualEvaluando.getVerticeActual().getNombreV());
                
                for (Arista relacionado : relacionadas) {
                    
                    String opuesto = relacionado.getVerticeOpuesto(actualEvaluando.getVerticeActual().getNombreV());
                    
                    for (Etiquetas eti : etiquetas) {
                        
                        if (eti.getVerticeActual().getNombreV().equals(opuesto)) {
                            
                            if (!eti.isNodoEvaluado()) {
                                
                                if (eti.getDistanciaAcumulada() == -1) {
                                    eti.setDistanciaAcumulada(0);
                                    eti.setDistanciaAcumulada(actualEvaluando.getDistanciaAcumulada() + relacionado.getValorArista());
                                    eti.setVerticeAnterior(actualEvaluando.getVerticeActual());
                                } else {
                                    
                                    if (eti.getDistanciaAcumulada()>= (actualEvaluando.getDistanciaAcumulada() + relacionado.getValorArista())) {
                                        eti.setDistanciaAcumulada(actualEvaluando.getDistanciaAcumulada() + relacionado.getValorArista());
                                        eti.setVerticeAnterior(actualEvaluando.getVerticeActual());
                                    }
                                }
                            }
                        }
                    }
                }
                
               /**/
                
                for (Etiquetas etique : etiquetas) {
                    if (etique.getVerticeActual() != etique.getVerticeAnterior() && !etique.isNodoEvaluado()) {
                        if (mayor == null) {
                            mayor = etique;
                        } else if (menor == null) {
                            menor = etique;
                        } else {
                            
                            if (menor.isNodoEvaluado()) {
                                menor = mayor;
                                mayor = etique;
                            } else if (mayor.isNodoEvaluado()) {
                                mayor = menor;
                                menor = etique;
                            }
                            
                            if (menor.getDistanciaAcumulada() > mayor.getDistanciaAcumulada()) {
                                menor = mayor;
                             
                            }
                            mayor = etique;
                        }
                    }
                }
                
                for (Etiquetas etiqu : etiquetas) {
                    if (menor.getVerticeActual().getNombreV().equals(etiqu.getVerticeActual().getNombreV())) {
                        etiqu.setNodoEvaluado(true);
                    }
                }
                actualEvaluando = menor;
                contador = contador + 1;
            } while (contador <= etiquetas.size());
        } else {
            System.out.println("Ingresa un vertice inicial existente en el grafo");
        }
        return etiquetas;
    }
    
    
    private ArrayList<Arista> aristasRelacionadas(ArrayList<Arista> aristas, String vertice){
        ArrayList<Arista> relacionadas = new ArrayList<>();
        for (Arista arista : aristas ) {
            if (arista.existeVertice(vertice)) {
                relacionadas.add(arista);
            }
        }
        return relacionadas;
    }
    
    public ArrayList<Arista> caminoMasCorto (Grafo g, String vertiI, String vertiF){
        ArrayList<Etiquetas> eti = etiquetarVertices(g, vertiI);
        ArrayList<Arista> aristasTotales = g.getAristas();
        ArrayList<Arista> camino = new ArrayList<>();
        String seleccionado = vertiF;
        int contador = 0;
        do {            
            for (Etiquetas etiq : eti) {
                if (etiq.getVerticeActual().getNombreV().equals(seleccionado)) {
                    Arista tmp = obtenerArista(aristasTotales, etiq.getVerticeActual().getNombreV(), etiq.getVerticeAnterior().getNombreV());
                    camino.add(tmp);
                    seleccionado = etiq.getVerticeAnterior().getNombreV();
                }
            }
            contador = contador + 1;
            if (seleccionado.equals(vertiI)) {
                contador = 1000;
            }
        } while (contador <= eti.size());
        return camino;
    }
    
    private Arista obtenerArista(ArrayList<Arista> arris, String ini, String fin){
        Arista arista = null;
        for (Arista arri : arris) {
            if (arri.existeVertice(ini) && arri.existeVertice(fin)) {
                arista = arri;
            }
        }
        return arista;
    }
}
