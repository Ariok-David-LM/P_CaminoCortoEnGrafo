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

        grafo.insertarVertice(20,20,"a");
        grafo.insertarVertice(40,20,"b");
        grafo.insertarVertice(60,20,"c");
        grafo.insertarVertice(20,40,"d");
        //grafo.insertarVertice(9,6,"e");
        //grafo.insertarVertice(10,7,"z");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        
        grafo.insertarArista("a","d");
        grafo.insertarArista("a","b");
        grafo.insertarArista("d","b");
        grafo.insertarArista("d","c");
        //grafo.insertarArista("c","e");
        //grafo.insertarArista("d","e");
        //grafo.insertarArista("d","z");
        //grafo.insertarArista("e","z");



        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        
        Dijkstra a = new Dijkstra();
        
        ArrayList<Arista> aris = a.caminoMasCorto(grafo, "a", "c");
        System.out.println("//////");
        for (Arista ari : aris) {
            System.out.println("INICIAL:" + ari.getVerticeInicial().getNombreV());
            System.out.println("FINAL:" + ari.getVerticeFinal().getNombreV());
            System.out.println("----------------------------------------");
        }
        
        
        
     }
    
}
