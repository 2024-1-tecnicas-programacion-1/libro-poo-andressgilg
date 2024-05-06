package com.mycompany.libropoo;
public class Libro {
    private String a;    
    private String t;    
    private String g;    
    private int ap; // Corregido el tipo de dato
    boolean l;

    public Libro(String a, String t, String g, int ap) {
        this.t = t;
        this.a = a;
        this.g = g;
        this.ap = ap;
        this.l = false;
    }

    public String mostraInformacion() {
        return "Titulo: " + t + ", Autor: " + a + ", Año de publicación: " + 
                ap + ", Género: " + g;
    }

    public void marcarLeido() {
        this.l = true;           
    }        

    public boolean antiguo() {        
        int ac = java.time.Year.now().getValue();
        return (ac - ap) > 50;
    }

    public boolean Leido() {
        return l;
    }       
}
