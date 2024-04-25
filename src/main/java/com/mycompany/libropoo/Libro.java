package com.mycompany.libropoo;

public class Libro {
private String a;    
private String t;    
private String g;    
private String ap;    
boolean l;

public Libro (String a, String t, String g, String ap, int l){
this.t = t;
this.a = a;
this.g = g;
this.ap = ap;
this.l = false;
}

    Libro(String t, String a, String g, int ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public String mostraInformacion(){
return "Titulo: "+ t + ", Autor: " + a + ", Año de publicación: " + 
        ap + ", Género: " + g;
}
public void marcarLeido(){
this.l=true;           
}        
public boolean antiguo(){        
int ac = java.time.Year.now().getValue();
 int aP = Integer.parseInt(ap);
return (ac - aP)> 50;
}
public boolean Leido(){
return l;
}       
}

