/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.elementos;

import java.util.ArrayList;

/**
 *
 * @author Ariok León
 */
public class Grafo {

    private ArrayList<Vertice> listaVertises = new ArrayList<>();
    private ArrayList<Arista> listaAristas = new ArrayList<>();
    
    public Grafo() {
    }
    
    public void insertarVertice(int ejx, int ejy, String nombrev){
        Vertice tmp = null;
        tmp = new Vertice(ejx, ejy, nombrev);
        if (listaVertises.isEmpty()) {
            this.listaVertises.add(tmp);
            System.out.println("Se incerto el vertice");
        } else if (!this.existeNombreVertice(tmp.getNombreV()) && !this.existeVertice(tmp)) {
            this.listaVertises.add(tmp);
            System.out.println("Se incerto el vertice");
        } else {
            System.out.println("No se incerto, puede que ya exista el nombre del vertice o las cordenadas");
        }
    }
    
    private boolean existeVertice(Vertice tmp){
        boolean existe = false;
        for (Vertice verti : listaVertises) {
            if (verti.getEjex() == tmp.getEjex() && verti.getEjey() == tmp.getEjey()) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public boolean existeNombreVertice(String tmp){
        boolean existe = false;
        for (Vertice verti : listaVertises) {
            if (verti.getNombreV().equals(tmp)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public void mostrarVertice(){
        for (Vertice vertice : listaVertises) {
            System.out.println(vertice.getEjex());
            System.out.println(vertice.getEjey());
            System.out.println(vertice.getNombreV());
            System.out.println("-------------------");
        }
    }
    
    public void insertarArista(String vertiIni, String vertiFin){
        Vertice verticeInicial = null;
        Vertice verticeFinal = null;
        Arista aristaIncertar = null;
        if (vertiIni.equals(vertiFin)) {
            System.out.println("No puedes insertar este arista");
        } else if (!vertiIni.equals(vertiFin)) {
            for (Vertice vertise : listaVertises) {
                if (vertise.getNombreV().equals(vertiIni)) {
                    verticeInicial = vertise;
                }
                if (vertise.getNombreV().equals(vertiFin)) {
                    verticeFinal = vertise;
                }
            }
            if (verticeInicial != null && verticeFinal != null) {
                aristaIncertar = new Arista(verticeInicial, verticeFinal);
                if (listaAristas.isEmpty()) {
                    this.listaAristas.add(aristaIncertar);
                    System.out.println("Se incerto el arista");
                } else {
                    if (!existeArista(aristaIncertar)) {
                        this.listaAristas.add(aristaIncertar);
                        System.out.println("Se incerto arista");
                    } else if (existeArista(aristaIncertar)) {
                        System.out.println("Ya existe la arista");
                    }
                }
            } else {
                System.out.println("Compruebe que existen los vertices del arista");
            }
        }
    }
    
    private boolean existeArista(Arista tmp){
        boolean existeA = false;
        
        int validarIniX = tmp.getVerticeInicial().getEjex();
        int validarIniY = tmp.getVerticeInicial().getEjey();
        
        int validarFinX = tmp.getVerticeFinal().getEjex();
        int validarFinY = tmp.getVerticeFinal().getEjey();
        
        for (Arista listaaris : listaAristas) {
            
            int listaIniX = listaaris.getVerticeInicial().getEjex();
            int listaIniY = listaaris.getVerticeInicial().getEjey();
            
            int listaFinX = listaaris.getVerticeFinal().getEjex();
            int listaFinY = listaaris.getVerticeFinal().getEjey();
            
            if (validarIniX == listaIniX && validarIniY == listaIniY && validarFinX == listaFinX && validarFinY == listaFinY) {
                existeA = true;
                break;
            } else if ((validarIniX == listaFinX && validarIniY == listaFinY)&&(validarFinX == listaIniX && validarFinY == listaIniY)) {
                existeA = true;
                break;
            }
        }
        
        return existeA;
    }
    
    public void mostrarAristas(){
        for (Arista listaarista : listaAristas) {
            System.out.println("Inicial:" + listaarista.getVerticeInicial().getEjex() + "" + listaarista.getVerticeInicial().getEjey());
            System.out.println("Final:" + listaarista.getVerticeFinal().getEjex() + "" + listaarista.getVerticeFinal().getEjey());
            System.out.println("*********************************");
        }
    }
    
    public ArrayList<Vertice> getVertices(){
        return listaVertises;
    }
    
    public ArrayList<Arista> getAristas(){
        return listaAristas;
    }
}
