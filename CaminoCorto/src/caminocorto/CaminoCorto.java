/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caminocorto;

import ico.algoritmos.Dijkstra;
import ico.elementos.Arista;
import ico.elementos.Etiquetas;
import ico.elementos.Grafo;
import ico.elementos.Vertice;
import java.util.ArrayList;

/**
 *
 * @author Ariok León
 */
public class CaminoCorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.insertarVertice(5,2,"a");
        grafo.insertarVertice(6,3,"b");
        grafo.insertarVertice(7,4,"c");
        grafo.insertarVertice(8,5,"d");
        grafo.insertarVertice(9,6,"e");
        grafo.insertarVertice(10,7,"z");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        
        grafo.insertarArista("a","b");
        grafo.insertarArista("a","c");
        grafo.insertarArista("b","e");
        grafo.insertarArista("d","b");
        grafo.insertarArista("c","e");
        grafo.insertarArista("d","e");
        grafo.insertarArista("d","z");
        grafo.insertarArista("e","z");



        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        
        Dijkstra a = new Dijkstra();
        
        ArrayList<Arista> aris = a.caminoMasCorto(grafo, "a", "z");
        System.out.println("//////");
        for (Arista ari : aris) {
            System.out.println("INICIAL:" + ari.getVerticeInicial().getNombreV());
            System.out.println("FINAL:" + ari.getVerticeFinal().getNombreV());
            System.out.println("----------------------------------------");
        }
        
        
        
     }
    
}
