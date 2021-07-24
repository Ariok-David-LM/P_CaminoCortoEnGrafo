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
 * @author Osvaldo, Julio y Ariok
 */
public class Dijkstra {

    public Dijkstra() {
    }

    public ArrayList<Etiquetas> etiquetarVertices(Grafo grafotmp, String verticeInicial) {
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

            /*Inicia algoritmo*/
            int contador = 0; //Contador del do while
            Etiquetas mayor = null;
            Etiquetas menor = null;
            do {
                ArrayList<Arista> aristasRelacionadas = aristasRelacionadas(aristas, actual.getVerticeActual().getNombreV());
                int contador2 = 0;//Contador de etiquetas relacionadas
                for (Arista aristasRelacionada : aristasRelacionadas) {
                    String etiquetaOpuesta = aristasRelacionada.getVerticeOpuesto(actual.getVerticeActual().getNombreV());
                    for (Etiquetas etiqueta : etiquetas) {
                        if (etiqueta.getVerticeActual().getNombreV().equals(etiquetaOpuesta)) {
                            if (!etiqueta.isNodoEvaluado()) {
                                if (etiqueta.getDistanciaAcumulada() == -1) {
                                    etiqueta.setDistanciaAcumulada(actual.getDistanciaAcumulada() + aristasRelacionada.getValorArista() + 1);
                                    etiqueta.setVerticeAnterior(actual.getVerticeActual());
                                } else if (etiqueta.getDistanciaAcumulada() >= actual.getDistanciaAcumulada() + aristasRelacionada.getValorArista()) {
                                    etiqueta.setDistanciaAcumulada(actual.getDistanciaAcumulada() + aristasRelacionada.getValorArista());
                                    etiqueta.setVerticeAnterior(actual.getVerticeActual());
                                }
                                contador2 = contador2 + 1;
                            }
                        }
                    }
                }
                if (contador2 == 1 && aristasRelacionadas.size() == 1) {
                    String tmp = aristasRelacionadas.get(0).getVerticeOpuesto(actual.getVerticeActual().getNombreV());
                    for (Etiquetas etiqueta : etiquetas) {
                        if (etiqueta.getVerticeActual().getNombreV().equals(tmp)) {
                            etiqueta.setNodoEvaluado(true);
                            actual = etiqueta;
                        }
                    }
                } else if (contador2 == 1 && aristasRelacionadas.size() != 1) {
                    for (Arista aristasRelacionada : aristasRelacionadas) {
                        String tmp = aristasRelacionada.getVerticeOpuesto(actual.getVerticeActual().getNombreV());
                        for (Etiquetas etiqueta : etiquetas) {
                            if (etiqueta.getVerticeActual().getNombreV().equals(tmp) && !etiqueta.isNodoEvaluado()) {
                                etiqueta.setNodoEvaluado(true);
                                actual = etiqueta;
                            }
                        }
                    }
                } else if (contador2 > 1) {
                    for (Etiquetas etiqueta : etiquetas) {
                        if (etiqueta.getVerticeActual() != etiqueta.getVerticeAnterior() && !etiqueta.isNodoEvaluado()) {
                            if (mayor == null) {
                                mayor = etiqueta;
                            } else if (menor == null) {
                                menor = etiqueta;
                            } else {
                                if (menor.isNodoEvaluado()) {
                                    menor = mayor;
                                    mayor = etiqueta;
                                } else if (mayor.isNodoEvaluado()) {
                                    mayor = menor;
                                    menor = etiqueta;
                                }
                                if (menor.getDistanciaAcumulada() > mayor.getDistanciaAcumulada()) {
                                    menor = mayor;
                                }
                                mayor = etiqueta;
                            }
                        }
                    }
                    for (Etiquetas etiqu : etiquetas) {
                        if (menor.getVerticeActual().getNombreV().equals(etiqu.getVerticeActual().getNombreV())) {
                            etiqu.setNodoEvaluado(true);
                        }
                    }
                    actual = menor;
                } else if (contador2 == 0) {
                    for (Etiquetas etiqueta : etiquetas) {
                        if (etiqueta.getVerticeActual().getNombreV().equals(actual.getVerticeActual().getNombreV())) {
                            etiqueta.setNodoEvaluado(true);
                        }
                    }
                    for (Etiquetas etiqueta : etiquetas) {
                        if (etiqueta.getVerticeActual() != etiqueta.getVerticeAnterior() && !etiqueta.isNodoEvaluado()) {
                            if (mayor == null) {
                                mayor = etiqueta;
                            } else if (menor == null) {
                                menor = etiqueta;
                            } else {
                                if (menor.isNodoEvaluado()) {
                                    menor = mayor;
                                    mayor = etiqueta;
                                } else if (mayor.isNodoEvaluado()) {
                                    mayor = menor;
                                    menor = etiqueta;
                                }
                                if (menor.getDistanciaAcumulada() > mayor.getDistanciaAcumulada()) {
                                    menor = mayor;
                                }
                                mayor = etiqueta;
                            }
                        }
                    }
                    for (Etiquetas etiqu : etiquetas) {
                        if (menor.getVerticeActual().getNombreV().equals(etiqu.getVerticeActual().getNombreV())) {
                            etiqu.setNodoEvaluado(true);
                        }
                    }
                    actual = menor;
                }
                System.out.println(actual.getVerticeActual().getNombreV());
                contador = contador + 1;
            } while (contador <= etiquetas.size());
        } else {
            System.out.println("Ingresa un vertice inicial existente en el grafo");
        }
        return etiquetas;
    }

    private ArrayList<Arista> aristasRelacionadas(ArrayList<Arista> aristas, String vertice) {
        ArrayList<Arista> relacionadas = new ArrayList<>();
        for (Arista arista : aristas) {
            if (arista.existeVertice(vertice)) {
                relacionadas.add(arista);
            }
        }
        return relacionadas;
    }

    public ArrayList<Arista> caminoMasCorto(Grafo g, String vertiI, String vertiF) {
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
        } while (contador < eti.size());
        return camino;
    }

    private Arista obtenerArista(ArrayList<Arista> arris, String ini, String fin) {
        Arista arista = null;
        for (Arista arri : arris) {
            if (arri.existeVertice(ini) && arri.existeVertice(fin)) {
                arista = arri;
            }
        }
        return arista;
    }
}
